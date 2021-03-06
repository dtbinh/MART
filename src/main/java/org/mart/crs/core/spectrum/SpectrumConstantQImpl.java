/*
 * Copyright (c) 2008-2013 Maksim Khadkevich and Fondazione Bruno Kessler.
 *
 * This file is part of MART.
 * MART is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2, as published
 * by the Free Software Foundation.
 *
 * MART is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with MART; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.mart.crs.core.spectrum;

import org.apache.log4j.Logger;
import org.mart.crs.logging.CRSLogger;
import org.mart.crs.management.config.Configuration;
import org.mart.crs.utils.helper.Helper;
import org.mart.crs.utils.windowing.WindowFunction;
import org.mart.crs.utils.windowing.WindowOption;
import org.mart.crs.utils.windowing.WindowType;
import rasmus.interpreter.sampled.util.FFTConstantQ;


/**
 * Constant-Q spectrum of an audioReader object
 *
 * @version 1.0 23.03.2009 16:03:24
 * @author: Maksim Khadkevich
 */
//TODO : write tests
public class SpectrumConstantQImpl extends SpectrumImplPhaseComponents {

    public static double THRESHOLD = 0.01; //Threshold for Constant-Q Transform

    protected static Logger logger = CRSLogger.getLogger(SpectrumConstantQImpl.class);

    private FFTConstantQ fftcq;
    private int fftframesize;
    private int outputbins;


    public SpectrumConstantQImpl(float[] samples, int startSampleIndex, int endSampleIndex, float sampleRate, int windowLength, int windowType, float overlapping) {
        super(samples, startSampleIndex, endSampleIndex, sampleRate, windowLength, windowType, overlapping);
    }

    protected void initialize() {
        if (fftcq == null) {
            logger.info("Creating Constant-Q spectrum");
            fftcq = new FFTConstantQ(getSampleRate(), Helper.getFreqForMIDINote(Configuration.START_NOTE_FOR_PCP_UNWRAPPED), Helper.getFreqForMIDINote(Configuration.START_NOTE_FOR_PCP_UNWRAPPED), Configuration.NUMBER_OF_SEMITONES_IN_OCTAVE, THRESHOLD);

            fftframesize = fftcq.getFFTSize();
            logger.debug("FFT frame size = " + fftframesize);
            outputbins = fftcq.getNumberOfOutputBands();
            logger.debug("Number of CQ bins = " + outputbins);
        }
    }


    //TODO: needs refactoring to the base class
    protected void processFrame(int startIndexInSamples, int length) {
        float[][] out = new float[2][];
        try {
            double[] fftbuffer = new double[fftframesize];
            double[] fftoutbuffer = new double[outputbins * 2]; //Because complex numbers

            for (int i = 0; i < fftbuffer.length; i++) {
                if (startIndexInSamples + i < sampleNumber) {
                    fftbuffer[i] = audioReader.getSamples()[startIndexInSamples + i];
                } else {
                    fftbuffer[i] = 0;
                }
            }

            WindowFunction.apply(fftbuffer, 0, fftbuffer.length, WindowType.values()[this.windowType], WindowOption.WINDOW);
            
            fftcq.calc(fftbuffer, fftoutbuffer);

            out[0] = extractMagSpec(fftoutbuffer);
            out[1] = extractPhaseSpec(fftoutbuffer);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            logger.error("Error while calculating spectrum ");
            logger.error(Helper.getStackTrace(e));
        }
    }


}
