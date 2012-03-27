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

package org.mart.crs.exec.operation.models.lm;

import org.apache.log4j.Logger;
import org.mart.crs.config.Settings;
import org.mart.crs.logging.CRSLogger;
import org.mart.crs.management.beat.BeatStructure;
import org.mart.crs.management.beat.segment.BeatSegment;
import org.mart.crs.management.label.LabelsSource;
import org.mart.crs.management.label.chord.ChordSegment;
import org.mart.crs.management.label.chord.ChordStructure;
import org.mart.crs.management.label.chord.ChordType;

import java.util.*;

/**
 * @version 1.0 3/22/12 10:36 PM
 * @author: Hut
 */
public class LanguageModelChordPerBeat extends LanguageModelChord{


    protected static Logger logger = CRSLogger.getLogger(LanguageModelChordPerBeat.class);

    protected LabelsSource beatLabelsSource;


    public LanguageModelChordPerBeat(String chordLabelsSoursePath, String beatLabelsSourcePath, String wavFileList, String outTextFilePath) {
        super(chordLabelsSoursePath, wavFileList, outTextFilePath);
        this.beatLabelsSource = new LabelsSource(beatLabelsSourcePath, true, "beatGT", Settings.BEAT_EXTENSIONS);
    }


    protected List<String> createText(List<String> wavFilePaths) {
        List<String> outList = new ArrayList<String>();

        for (String wavFilePath : wavFilePaths) {
            StringBuilder textBuilder = new StringBuilder();

            String chordFilePath = chordLabelsSource.getFilePathForSong(wavFilePath);
            String beatFilePath = beatLabelsSource.getFilePathForSong(wavFilePath);

            if(chordFilePath == null || beatFilePath == null){
                logger.warn(String.format("Could not find labels for song %s", wavFilePath));
                continue;
            }

            ChordStructure chordStructure = new ChordStructure(chordFilePath);
            BeatStructure beatStructure = BeatStructure.getBeatStructure(beatFilePath);

            for (BeatSegment beatSegment : beatStructure.getBeatSegments()) {
                ChordSegment tempSegmentWithBeatDuration = new ChordSegment(beatSegment.getTimeInstant(), beatSegment.getNextBeatTimeInstant(), ChordType.NOT_A_CHORD.getName());
                TreeMap<Float, ChordSegment> intersectionchords = new TreeMap<Float, ChordSegment>();
                for (ChordSegment chordSegment : chordStructure.getChordSegments()) {
                    if (chordSegment.intersects(tempSegmentWithBeatDuration)) {
                        intersectionchords.put(chordSegment.getIntersection(tempSegmentWithBeatDuration), chordSegment);
                    }
                }
                textBuilder.append(intersectionchords.lastEntry().getValue().getChordName()).append(" ");
            }
            addShiftedVersions(textBuilder.toString(), outList, true);
        }
        return outList;

    }
    

}