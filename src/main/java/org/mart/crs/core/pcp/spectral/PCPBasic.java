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

package org.mart.crs.core.pcp.spectral;

import org.mart.crs.core.pcp.PCPBuilder;

/**
 * @version 1.0 26-May-2010 13:57:43
 * @author: Hut
 */
public class PCPBasic extends PCP {

    public PCPBasic(PCPBuilder builder) {
        super(builder);
    }


    /**
     * Preprocesses spectrum. Used in Harmonic PCP and Enhenced PCP.
     *
     * @param spectrum
     * @param spectalResolution
     * @return
     */
    protected float[] preProcessEnergySpectrumFrame(float[] spectrum, float spectalResolution) {
        return spectrum;
    }

}