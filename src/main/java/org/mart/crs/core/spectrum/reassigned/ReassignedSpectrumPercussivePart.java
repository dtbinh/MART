/*
 * This file is part of MART.
 * MART is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2, as published
 * by the Free Software Foundation.
 *
 * MART is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MART; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.mart.crs.core.spectrum.reassigned;

import org.mart.crs.config.ExecParams;
import org.mart.crs.core.AudioReader;

/**
 * @version 1.0 25-Aug-2010 16:44:55
 * @author: Hut
 */
public class ReassignedSpectrumPercussivePart extends ReassignedSpectrumHarmonicPart {

    public ReassignedSpectrumPercussivePart(AudioReader audioReader, int startSampleIndex, int endSampleIndex, int windowLength, int windowType, float overlapping, float threshold, ExecParams execParams) {
        super(audioReader, startSampleIndex, endSampleIndex, windowLength, windowType, overlapping, threshold, execParams);
    }

    public ReassignedSpectrumPercussivePart(AudioReader audioReader, int windowLength, int windowType, float overlapping, float threshold, ExecParams execParams) {
        super(audioReader, windowLength, windowType, overlapping, threshold, execParams);
    }

    public ReassignedSpectrumPercussivePart(float[] samples, int startSampleIndex, int endSampleIndex, float sampleRate, float threshold, ExecParams execParams) {
        super(samples, startSampleIndex, endSampleIndex, sampleRate, threshold, execParams);
    }

    public ReassignedSpectrumPercussivePart(float[] samples, float sampleRate, float threshold, ExecParams execParams) {
        super(samples, sampleRate, threshold, execParams);
    }

    public ReassignedSpectrumPercussivePart(AudioReader audioReader, int startSampleIndex, int endSampleIndex, float threshold, ExecParams execParams) {
        super(audioReader, startSampleIndex, endSampleIndex, threshold, execParams);
    }

    public ReassignedSpectrumPercussivePart(AudioReader audioReader, float threshold, ExecParams execParams) {
        super(audioReader, threshold, execParams);
    }

    @Override
    protected boolean checkCondition(float phaseDoubleDerivative) {
        return Math.abs(phaseDoubleDerivative) <  threshold;
    }
}