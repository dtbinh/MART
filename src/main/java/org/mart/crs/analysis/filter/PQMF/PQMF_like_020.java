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

package org.mart.crs.analysis.filter.PQMF;

/**
 * @version 1.0 29-Apr-2010 11:41:45
 * @author: Hut
 */
public interface PQMF_like_020 {

    public static final float[] h_Coeff = new float[]{
            4.6838465e-003f,
            -2.5750788e-004f,
            -2.5411865e-004f,
            -2.5398161e-004f,
            -2.5556311e-004f,
            -2.6007796e-004f,
            -2.6592738e-004f,
            -2.7438058e-004f,
            -2.8378394e-004f,
            -2.9544580e-004f,
            -3.0759084e-004f,
            -3.2168663e-004f,
            -3.3575935e-004f,
            -3.5147120e-004f,
            -3.6659160e-004f,
            -3.8314519e-004f,
            -3.9837471e-004f,
            -4.1502221e-004f,
            -4.2930290e-004f,
            -4.4587846e-004f,
            -4.5553777e-004f,
            -4.7390821e-004f,
            -4.8594249e-004f,
            -4.9270617e-004f,
            -5.0144350e-004f,
            -5.0788613e-004f,
            -5.1381682e-004f,
            -5.1700246e-004f,
            -5.1845986e-004f,
            -5.1693047e-004f,
            -5.1308531e-004f,
            -5.0625793e-004f,
            -4.9683979e-004f,
            -4.8449872e-004f,
            -4.6940665e-004f,
            -4.5153005e-004f,
            -4.3074662e-004f,
            -4.0737436e-004f,
            -3.8095957e-004f,
            -3.5236491e-004f,
            -3.2018821e-004f,
            -2.8671426e-004f,
            -2.5066650e-004f,
            -2.1026152e-004f,
            -1.6993798e-004f,
            -1.2703084e-004f,
            -8.2698043e-005f,
            -3.6001514e-005f,
            1.1813117e-005f,
            6.1163678e-005f,
            1.1104280e-004f,
            1.6171774e-004f,
            2.1241850e-004f,
            2.6335348e-004f,
            3.1384139e-004f,
            3.6395680e-004f,
            4.1311323e-004f,
            4.6123760e-004f,
            5.0778449e-004f,
            5.5258311e-004f,
            5.9523735e-004f,
            6.3547959e-004f,
            6.7240618e-004f,
            7.0750019e-004f,
            7.3790157e-004f,
            7.6504542e-004f,
            7.8827851e-004f,
            8.0770246e-004f,
            8.2244711e-004f,
            8.3269438e-004f,
            8.3790913e-004f,
            8.3835255e-004f,
            8.3360021e-004f,
            8.2390939e-004f,
            8.0883957e-004f,
            7.8863238e-004f,
            7.6293794e-004f,
            7.3206362e-004f,
            6.9570656e-004f,
            6.5432276e-004f,
            6.0765360e-004f,
            5.5632069e-004f,
            4.9976211e-004f,
            4.3941056e-004f,
            3.7411335e-004f,
            3.0494723e-004f,
            2.3226788e-004f,
            1.5626033e-004f,
            7.7049296e-005f,
            -4.7624877e-006f,
            -8.8808268e-005f,
            -1.7446524e-004f,
            -2.6142509e-004f,
            -3.4905685e-004f,
            -4.3707267e-004f,
            -5.2478042e-004f,
            -6.1180552e-004f,
            -6.9738333e-004f,
            -7.8119096e-004f,
            -8.6239151e-004f,
            -9.4073385e-004f,
            -1.0153466e-003f,
            -1.0861689e-003f,
            -1.1520634e-003f,
            -1.2130968e-003f,
            -1.2686130e-003f,
            -1.3177745e-003f,
            -1.3605132e-003f,
            -1.3963756e-003f,
            -1.4248747e-003f,
            -1.4455808e-003f,
            -1.4581995e-003f,
            -1.4625150e-003f,
            -1.4582651e-003f,
            -1.4453140e-003f,
            -1.4234338e-003f,
            -1.3925474e-003f,
            -1.3525227e-003f,
            -1.3034776e-003f,
            -1.2453574e-003f,
            -1.1783977e-003f,
            -1.1026561e-003f,
            -1.0184919e-003f,
            -9.2599794e-004f,
            -8.2556892e-004f,
            -7.1779571e-004f,
            -6.0263947e-004f,
            -4.8104080e-004f,
            -3.5343340e-004f,
            -2.2037957e-004f,
            -8.2437743e-005f,
            5.9583603e-005f,
            2.0497126e-004f,
            3.5295537e-004f,
            5.0277724e-004f,
            6.5360405e-004f,
            8.0461058e-004f,
            9.5488538e-004f,
            1.1034933e-003f,
            1.2495249e-003f,
            1.3920812e-003f,
            1.5301978e-003f,
            1.6630108e-003f,
            1.7895465e-003f,
            1.9090320e-003f,
            2.0202646e-003f,
            2.1227893e-003f,
            2.2154432e-003f,
            2.2974852e-003f,
            2.3682338e-003f,
            2.4269987e-003f,
            2.4729996e-003f,
            2.5056476e-003f,
            2.5243938e-003f,
            2.5287807e-003f,
            2.5183319e-003f,
            2.4927326e-003f,
            2.4516453e-003f,
            2.3948968e-003f,
            2.3223488e-003f,
            2.2340701e-003f,
            2.1300114e-003f,
            2.0104355e-003f,
            1.8754561e-003f,
            1.7255485e-003f,
            1.5609007e-003f,
            1.3822874e-003f,
            1.1901924e-003f,
            9.8525592e-004f,
            7.6842944e-004f,
            5.4052846e-004f,
            3.0246893e-004f,
            5.5297294e-005f,
            -1.9979515e-004f,
            -4.6161451e-004f,
            -7.2890342e-004f,
            -1.0002998e-003f,
            -1.2744060e-003f,
            -1.5497466e-003f,
            -1.8248116e-003f,
            -2.0979755e-003f,
            -2.3677392e-003f,
            -2.6324081e-003f,
            -2.8903827e-003f,
            -3.1399322e-003f,
            -3.3794494e-003f,
            -3.6071725e-003f,
            -3.8213847e-003f,
            -4.0206039e-003f,
            -4.2029935e-003f,
            -4.3670630e-003f,
            -4.5112486e-003f,
            -4.6340495e-003f,
            -4.7339133e-003f,
            -4.8094996e-003f,
            -4.8594818e-003f,
            -4.8826253e-003f,
            -4.8777398e-003f,
            -4.8437942e-003f,
            -4.7797922e-003f,
            -4.6848642e-003f,
            -4.5582913e-003f,
            -4.3994524e-003f,
            -4.2077710e-003f,
            -3.9829257e-003f,
            -3.7245986e-003f,
            -3.4327483e-003f,
            -3.1072510e-003f,
            -2.7484960e-003f,
            -2.3565707e-003f,
            -1.9320108e-003f,
            -1.4753735e-003f,
            -9.8739096e-004f,
            -4.6883548e-004f,
            7.9213967e-005f,
            6.5563502e-004f,
            1.2591488e-003f,
            1.8884100e-003f,
            2.5418427e-003f,
            3.2178531e-003f,
            3.9146683e-003f,
            4.6304376e-003f,
            5.3631283e-003f,
            6.1108079e-003f,
            6.8711958e-003f,
            7.6421718e-003f,
            8.4213237e-003f,
            9.2064345e-003f,
            9.9949123e-003f,
            1.0784449e-002f,
            1.1572519e-002f,
            1.2356585e-002f,
            1.3134117e-002f,
            1.3902631e-002f,
            1.4659527e-002f,
            1.5402312e-002f,
            1.6128514e-002f,
            1.6835742e-002f,
            1.7521538e-002f,
            1.8183612e-002f,
            1.8819672e-002f,
            1.9427556e-002f,
            2.0005077e-002f,
            2.0550368e-002f,
            2.1061406e-002f,
            2.1536474e-002f,
            2.1973859e-002f,
            2.2372077e-002f,
            2.2729662e-002f,
            2.3045373e-002f,
            2.3318148e-002f,
            2.3546918e-002f,
            2.3730921e-002f,
            2.3869501e-002f,
            2.3962155e-002f,
            2.4008540e-002f,
            2.4008540e-002f,
            2.3962155e-002f,
            2.3869501e-002f,
            2.3730921e-002f,
            2.3546918e-002f,
            2.3318148e-002f,
            2.3045373e-002f,
            2.2729662e-002f,
            2.2372077e-002f,
            2.1973859e-002f,
            2.1536474e-002f,
            2.1061406e-002f,
            2.0550368e-002f,
            2.0005077e-002f,
            1.9427556e-002f,
            1.8819672e-002f,
            1.8183612e-002f,
            1.7521538e-002f,
            1.6835742e-002f,
            1.6128514e-002f,
            1.5402312e-002f,
            1.4659527e-002f,
            1.3902631e-002f,
            1.3134117e-002f,
            1.2356585e-002f,
            1.1572519e-002f,
            1.0784449e-002f,
            9.9949123e-003f,
            9.2064345e-003f,
            8.4213237e-003f,
            7.6421718e-003f,
            6.8711958e-003f,
            6.1108079e-003f,
            5.3631283e-003f,
            4.6304376e-003f,
            3.9146683e-003f,
            3.2178531e-003f,
            2.5418427e-003f,
            1.8884100e-003f,
            1.2591488e-003f,
            6.5563502e-004f,
            7.9213967e-005f,
            -4.6883548e-004f,
            -9.8739096e-004f,
            -1.4753735e-003f,
            -1.9320108e-003f,
            -2.3565707e-003f,
            -2.7484960e-003f,
            -3.1072510e-003f,
            -3.4327483e-003f,
            -3.7245986e-003f,
            -3.9829257e-003f,
            -4.2077710e-003f,
            -4.3994524e-003f,
            -4.5582913e-003f,
            -4.6848642e-003f,
            -4.7797922e-003f,
            -4.8437942e-003f,
            -4.8777398e-003f,
            -4.8826253e-003f,
            -4.8594818e-003f,
            -4.8094996e-003f,
            -4.7339133e-003f,
            -4.6340495e-003f,
            -4.5112486e-003f,
            -4.3670630e-003f,
            -4.2029935e-003f,
            -4.0206039e-003f,
            -3.8213847e-003f,
            -3.6071725e-003f,
            -3.3794494e-003f,
            -3.1399322e-003f,
            -2.8903827e-003f,
            -2.6324081e-003f,
            -2.3677392e-003f,
            -2.0979755e-003f,
            -1.8248116e-003f,
            -1.5497466e-003f,
            -1.2744060e-003f,
            -1.0002998e-003f,
            -7.2890342e-004f,
            -4.6161451e-004f,
            -1.9979515e-004f,
            5.5297294e-005f,
            3.0246893e-004f,
            5.4052846e-004f,
            7.6842944e-004f,
            9.8525592e-004f,
            1.1901924e-003f,
            1.3822874e-003f,
            1.5609007e-003f,
            1.7255485e-003f,
            1.8754561e-003f,
            2.0104355e-003f,
            2.1300114e-003f,
            2.2340701e-003f,
            2.3223488e-003f,
            2.3948968e-003f,
            2.4516453e-003f,
            2.4927326e-003f,
            2.5183319e-003f,
            2.5287807e-003f,
            2.5243938e-003f,
            2.5056476e-003f,
            2.4729996e-003f,
            2.4269987e-003f,
            2.3682338e-003f,
            2.2974852e-003f,
            2.2154432e-003f,
            2.1227893e-003f,
            2.0202646e-003f,
            1.9090320e-003f,
            1.7895465e-003f,
            1.6630108e-003f,
            1.5301978e-003f,
            1.3920812e-003f,
            1.2495249e-003f,
            1.1034933e-003f,
            9.5488538e-004f,
            8.0461058e-004f,
            6.5360405e-004f,
            5.0277724e-004f,
            3.5295537e-004f,
            2.0497126e-004f,
            5.9583603e-005f,
            -8.2437743e-005f,
            -2.2037957e-004f,
            -3.5343340e-004f,
            -4.8104080e-004f,
            -6.0263947e-004f,
            -7.1779571e-004f,
            -8.2556892e-004f,
            -9.2599794e-004f,
            -1.0184919e-003f,
            -1.1026561e-003f,
            -1.1783977e-003f,
            -1.2453574e-003f,
            -1.3034776e-003f,
            -1.3525227e-003f,
            -1.3925474e-003f,
            -1.4234338e-003f,
            -1.4453140e-003f,
            -1.4582651e-003f,
            -1.4625150e-003f,
            -1.4581995e-003f,
            -1.4455808e-003f,
            -1.4248747e-003f,
            -1.3963756e-003f,
            -1.3605132e-003f,
            -1.3177745e-003f,
            -1.2686130e-003f,
            -1.2130968e-003f,
            -1.1520634e-003f,
            -1.0861689e-003f,
            -1.0153466e-003f,
            -9.4073385e-004f,
            -8.6239151e-004f,
            -7.8119096e-004f,
            -6.9738333e-004f,
            -6.1180552e-004f,
            -5.2478042e-004f,
            -4.3707267e-004f,
            -3.4905685e-004f,
            -2.6142509e-004f,
            -1.7446524e-004f,
            -8.8808268e-005f,
            -4.7624877e-006f,
            7.7049296e-005f,
            1.5626033e-004f,
            2.3226788e-004f,
            3.0494723e-004f,
            3.7411335e-004f,
            4.3941056e-004f,
            4.9976211e-004f,
            5.5632069e-004f,
            6.0765360e-004f,
            6.5432276e-004f,
            6.9570656e-004f,
            7.3206362e-004f,
            7.6293794e-004f,
            7.8863238e-004f,
            8.0883957e-004f,
            8.2390939e-004f,
            8.3360021e-004f,
            8.3835255e-004f,
            8.3790913e-004f,
            8.3269438e-004f,
            8.2244711e-004f,
            8.0770246e-004f,
            7.8827851e-004f,
            7.6504542e-004f,
            7.3790157e-004f,
            7.0750019e-004f,
            6.7240618e-004f,
            6.3547959e-004f,
            5.9523735e-004f,
            5.5258311e-004f,
            5.0778449e-004f,
            4.6123760e-004f,
            4.1311323e-004f,
            3.6395680e-004f,
            3.1384139e-004f,
            2.6335348e-004f,
            2.1241850e-004f,
            1.6171774e-004f,
            1.1104280e-004f,
            6.1163678e-005f,
            1.1813117e-005f,
            -3.6001514e-005f,
            -8.2698043e-005f,
            -1.2703084e-004f,
            -1.6993798e-004f,
            -2.1026152e-004f,
            -2.5066650e-004f,
            -2.8671426e-004f,
            -3.2018821e-004f,
            -3.5236491e-004f,
            -3.8095957e-004f,
            -4.0737436e-004f,
            -4.3074662e-004f,
            -4.5153005e-004f,
            -4.6940665e-004f,
            -4.8449872e-004f,
            -4.9683979e-004f,
            -5.0625793e-004f,
            -5.1308531e-004f,
            -5.1693047e-004f,
            -5.1845986e-004f,
            -5.1700246e-004f,
            -5.1381682e-004f,
            -5.0788613e-004f,
            -5.0144350e-004f,
            -4.9270617e-004f,
            -4.8594249e-004f,
            -4.7390821e-004f,
            -4.5553777e-004f,
            -4.4587846e-004f,
            -4.2930290e-004f,
            -4.1502221e-004f,
            -3.9837471e-004f,
            -3.8314519e-004f,
            -3.6659160e-004f,
            -3.5147120e-004f,
            -3.3575935e-004f,
            -3.2168663e-004f,
            -3.0759084e-004f,
            -2.9544580e-004f,
            -2.8378394e-004f,
            -2.7438058e-004f,
            -2.6592738e-004f,
            -2.6007796e-004f,
            -2.5556311e-004f,
            -2.5398161e-004f,
            -2.5411865e-004f,
            -2.5750788e-004f,
            4.6838465e-003f};

}
