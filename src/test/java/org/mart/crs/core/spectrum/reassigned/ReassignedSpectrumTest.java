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

import org.mart.crs.core.AudioReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import rasmus.interpreter.sampled.util.FFT;

/**
 * @version 1.0 6/12/12 4:15 PM
 * @author: Hut
 */
public class ReassignedSpectrumTest {

    public static float[] data = new float[]{
            10	,
            10	,
            -1	,
            -14	,
            -4	,
            4	,
            10	,
            25	,
            31	,
            30	,
            28	,
            30	,
            42	,
            54	,
            45	,
            22	,
            6	,
            0	,
            -2	,
            9	,
            6	,
            -7	,
            -9	,
            -10	,
            9	,
            20	,
            24	,
            25	,
            4	,
            7	,
            17	,
            11	,
            -4	,
            -10	,
            -16	,
            -13	,
            -29	,
            -119	,
            118	,
            372	,
            54	,
            -497	,
            -764	,
            -221	,
            191	,
            113	,
            470	,
            489	,
            206	,
            252	,
            474	,
            468	,
            -261	,
            -434	,
            -285	,
            -600	,
            -546	,
            -663	,
            -267	,
            -16	,
            -568	,
            416	,
            1077	,
            311	,
            260	,
            460	,
            578	,
            651	,
            535	,
            -21	,
            -1056	,
            -970	,
            -685	,
            -728	,
            317	,
            540	,
            -193	,
            -361	,
            -797	,
            -267	,
            1551	,
            2179	,
            1261	,
            -27	,
            -662	,
            -957	,
            -641	,
            -45	,
            -820	,
            -1094	,
            -475	,
            108	,
            684	,
            -209	,
            -843	,
            413	,
            1173	,
            974	,
            1104	,
            593	,
            -1120	,
            -2156	,
            -1827	,
            -1263	,
            -496	,
            533	,
            952	,
            724	,
            -278	,
            -726	,
            1302	,
            3111	,
            2319	,
            1098	,
            803	,
            225	,
            -1155	,
            -1558	,
            -1262	,
            -1430	,
            -757	,
            733	,
            1665	,
            405	,
            -2203	,
            -1929	,
            266	,
            701	,
            208	,
            -66	,
            -907	,
            -1748	,
            -1181	,
            29	,
            1498	,
            2687	,
            1564	,
            192	,
            -143	,
            -1053	,
            -1050	,
            523	,
            1589	,
            1553	,
            1364	,
            1114	,
            243	,
            -759	,
            -1498	,
            -2067	,
            -1651	,
            -495	,
            111	,
            -191	,
            -1011	,
            -648	,
            564	,
            1034	,
            2089	,
            2923	,
            1253	,
            -1154	,
            -1849	,
            -1303	,
            -1556	,
            -1718	,
            -683	,
            -376	,
            -930	,
            -1186	,
            -20	,
            2746	,
            3950	,
            2666	,
            1260	,
            288	,
            -1185	,
            -2685	,
            -2192	,
            -954	,
            -603	,
            380	,
            2391	,
            3282	,
            806	,
            -1725	,
            -994	,
            -477	,
            -965	,
            -619	,
            -619	,
            -1100	,
            -807	,
            692	,
            2175	,
            2110	,
            654	,
            -1253	,
            -2285	,
            -2215	,
            -1675	,
            0	,
            2088	,
            2782	,
            2419	,
            1785	,
            1157	,
            55	,
            -1424	,
            -2087	,
            -2370	,
            -2093	,
            -825	,
            603	,
            886	,
            -32	,
            553	,
            1768	,
            1661	,
            2002	,
            1572	,
            -889	,
            -2680	,
            -2001	,
            -595	,
            -543	,
            -477	,
            -99	,
            -710	,
            -1315	,
            -1234	,
            149	,
            2239	,
            2595	,
            1523	,
            610	,
            260	,
            -254	,
            -1038	,
            -324	,
            501	,
            50	,
            672	,
            2104	,
            1312	,
            -1485	,
            -2464	,
            -696	,
            399	,
            353	,
            176	,
            -908	,
            -1964	,
            -1249	,
            909	,
            1925	,
            852	,
            -456	,
            -1415	,
            -1581	,
            -1116	,
            -579	,
            585	,
            1808	,
            2546	,
            2786	,
            2294	,
            1548	,
            110	,
            -1366	,
            -1737	,
            -2189	,
            -2503	,
            -1577	,
            -228	,
            -307	,
            -604	,
            1394	,
            2660	,
            2189	,
            2107	,
            979	,
            -1145	,
            -2012	,
            -1336	,
            -844	,
            -1166	,
            -507	,
            398	,
            4	,
            -625	,
            -785	,
            -49	,
            1097	,
            1216	,
            981	,
            1025	,
            639	,
            -354	,
            -768	,
            214	,
            783	,
            495	,
            818	,
            1074	,
            -143	,
            -2228	,
            -2119	,
            22	,
            559	,
            316	,
            452	,
            -387	,
            -1155	,
            -476	,
            925	,
            775	,
            -429	,
            -824	,
            -1123	,
            -1177	,
            -916	,
            -592	,
            431	,
            1619	,
            2426	,
            2503	,
            2002	,
            1055	,
            -679	,
            -1272	,
            -773	,
            -1666	,
            -2386	,
            -1372	,
            -334	,
            -384	,
            86	,
            1900	,
            2548	,
            1829	,
            1495	,
            574	,
            -931	,
            -1646	,
            -1578	,
            -1465	,
            -1368	,
            -396	,
            531	,
            331	,
            -359	,
            -829	,
            -204	,
            542	,
            896	,
            1460	,
            1099	,
            491	,
            234	,
            158	,
            988	,
            969	,
            102	,
            220	,
            414	,
            -922	,
            -2320	,
            -801	,
            1032	,
            679	,
            680	,
            670	,
            -548	,
            -1559	,
            -1088	,
            -178	,
            -758	,
            -1240	,
            -554	,
            -39	,
            73	,
            -237	,
            71	,
            1313	,
            2009	,
            2300	,
            2301	,
            1454	,
            -36	,
            -1061	,
            -519	,
            -433	,
            -1826	,
            -2378	,
            -1413	,
            -379	,
            -334	,
            435	,
            2303	,
            2353	,
            1530	,
            1345	,
            666	,
            -594	,
            -1878	,
            -1969	,
            -1700	,
            -1592	,
            -294	,
            278	,
            -327	,
            -713	,
            -641	,
            132	,
            1015	,
            1652	,
            1329	,
            352	,
            -173	,
            -700	,
            -239	,
            649	,
            340	,
            175	,
            578	,
            288	,
            -983	,
            -1249	,
            261	,
            773	,
            238	,
            541	,
            538	,
            -510	,
            -1131	,
            -565	,
            -307	,
            -1186	,
            -1318	,
            -489	,
            -262	,
            -727	,
            -782	,
            301	,
            1439	,
            2354	,
            3233	,
            2600	,
            1030	,
            -431	,
            -1058	,
            -458	,
            -867	,
            -2161	,
            -2207	,
            -908	,
            -124	,
            -303	,
            1261	,
            2594	,
            1301	,
            618	,
            1136	,
            561	,
            -1176	,
            -1917	,
            -1558	,
            -1588	,
            -719	,
            454	,
            503	,
            -14	,
            -794	,
            -597	,
            489	,
            1401	,
            1910	,
            1314	,
            253	,
            -392	,
            -545	,
            86	,
            464	,
            27	,
            -249	,
            -99	,
            -176	,
            -851	,
            -364	,
            910	,
            515	,
            190	,
            935	,
            716	,
            -539	,
            -1090	,
            -410	,
            -982	,
            -2045	,
            -1024	,
            -372	,
            -1014	,
            -1255	,
            -561	,
            653	,
            1693	,
            3014	,
            3195	,
            1805	,
            482	,
            -667	,
            -636	,
            -437	,
            -1660	,
            -2486	,
            -1641	,
            -92	,
            165	,
            813	,
            2599	,
            1865	,
            316	,
            865	,
            1253	,
            -83	,
            -1975	,
            -2293	,
            -1541	,
            -1301	,
            -524	,
            581	,
            328	,
            -934	,
            -1215	,
            -96	,
            849	,
            1620	,
            2005	,
            1160	,
            427	,
            41	,
            -60	,
            594	,
            467	,
            -398	,
            -839	,
            -560	,
            -518	,
            -966	,
            114	,
            805	,
            -38	,
            408	,
            1209	,
            580	,
            -640	,
            -729	,
            -575	,
            -1644	,
            -1631	,
            -689	,
            -510	,
            -659	,
            -669	,
            351	,
            1609	,
            2518	,
            3072	,
            2198	,
            695	,
            -570	,
            -989	,
            -496	,
            -1059	,
            -2225	,
            -2176	,
            -1120	,
            -119	,
            460	,
            1533	,
            2018	,
            664	,
            -12	,
            1062	,
            1460	,
            -315	,
            -1929	,
            -1292	,
            -982	,
            -1136	,
            102	,
            526	,
            -709	,
            -1819	,
            -1321	,
            139	,
            983	,
            1670	,
            1750	,
            1138	,
            673	,
            -10	,
            142	,
            543	,
            -111	,
            -850	,
            -899	,
            -300	,
            -437	,
            -253	,
            957	,
            772	,
            422	,
            1093	,
            1270	,
            330	,
            -913	,
            -1039	,
            -1066	,
            -1655	,
            -1362	,
            -612	,
            -619	,
            -1206	,
            -801	,
            730	,
            1705	,
            2305	,
            2497	,
            1339	,
            -137	,
            -690	,
            -378	,
            -392	,
            -1194	,
            -1701	,
            -1516	,
            -439	,
            605	,
            973	,
            1938	,
            1740	,
            106	,
            453	,
            1760	,
            1025	,
            -1057	,
            -1774	,
            -1193	,
            -1330	,
            -951	,
            70	,
            -137	,
            -1513	,
            -2316	,
            -953	,
            565	,
            1000	,
            1592	,
            1639	,
            1154	,
            438	,
            -14	,
            493	,
            463	,
            -390	,
            -1013	,
            -758	,
            -77	,
            -147	,
            123	,
            888	,
            732	,
            375	,
            890	,
            1212	,
            -70	,
            -1531	,
            -1363	,
            -1241	,
            -1774	,
            -1262	,
            -393	,
            -741	,
            -1324	,
            -282	,
            1381	,
            2047	,
            2642	,
            2490	,
            953	,
            96	,
            -112	,
            -318	,
            -498	,
            -1360	,
            -2123	,
            -1681	,
            -419	,
            260	,
            918	,
            1765	,
            936	,
            228	,
            1200	,
            1909	,
            1047	,
            -879	,
            -1497	,
            -884	,
            -863	,
            -530	,
            267	,
            -154	,
            -1822	,
            -2058	,
            -242	,
            706	,
            886	,
            1595	,
            1664	,
            989	,
            341	,
            94	,
            119	,
            -299	,
            -1118	,
            -1496	,
            -733	,
            -63	,
            -318	,
            325	,
            1287	,
            811	,
            709	,
            1638	,
            1529	,
            -157	,
            -1474	,
            -1159	,
            -1177	,
            -1684	,
            -859	,
            -155	,
            -783	,
            -1176	,
            -98	,
            1231	,
            1765	,
            1962	,
            1365	,
            515	,
            48	,
            -384	,
            -268	,
            -614	,
            -1651	,
            -1914	,
            -1312	,
            -258	,
            523	,
            1030	,
            1290	,
            829	,
            614	,
            1389	,
            2126	,
            1083	,
            -911	,
            -1332	,
            -883	,
            -1011	,
            -616	,
            154	,
            -685	,
            -2193	,
            -1572	,
            154	,
            568	,
            768	,
            1540	,
            1454	,
            859	,
            379	,
            37	,
            119	,
            -382	,
            -1266	,
            -1011	,
            -156	,
            -157	,
            -322	,
            566	,
            984	,
            537	,
            954	,
            1713	,
            1196	,
            -505	,
            -1419	,
            -1201	,
            -1522	,
            -1669	,
            -846	,
            -348	,
            -868	,
            -1062	,
            374	,
            1849	,
            2030	,
            1840	,
            1505	,
            741	,
            63	,
            -86	,
            -246	,
            -819	,
            -1490	,
            -1811	,
            -1111	,
            29	,
            371	,
            425	,
            583	,
            377	,
            405	,
            1388	,
            1960	,
            733	,
            -867	,
            -943	,
            -506	,
            -670	,
            -274	,
            65	,
            -1132	,
            -2117	,
            -1108	,
            335	,
            668	,
            961	,
            1608	,
            1724	,
            1193	,
            561	,
            379	,
            -155	,
            -1217	,
            -1400	,
            -756	,
            -304	,
            -431	,
            -208	,
            586	,
            867	,
            978	,
            1465	,
            1809	,
            1051	,
            -610	,
            -1398	,
            -1158	,
            -1421	,
            -1774	,
            -791	,
            -207	,
            -1272	,
            -1047	,
            945	,
            1829	,
            1590	,
            1571	,
            1375	,
            720	,
            126	,
            -208	,
            -415	,
            -978	,
            -1811	,
            -1706	,
            -592	,
            186	,
            190	,
            159	,
            352	,
            361	,
            583	,
            1418	,
            1752	,
            567	,
            -734	,
            -547	,
            -145	,
            -403	,
            -401	,
            -440	,
            -1390	,
            -2151	,
            -1117	,
            212	,
            291	,
            621	,
            1686	,
            1964	,
            1264	,
            811	,
            369	,
            -802	,
            -1609	,
            -1381	,
            -815	,
            -539	,
            -453	,
            -24	,
            602	,
            1213	,
            1411	,
            1338	,
            1577	,
            756	,
            -936	,
            -1229	,
            -848	,
            -1474	,
            -1539	,
            -316	,
            -326	,
            -1217	,
            -516	,
            1056	,
            1588	,
            1092	,
            1014	,
            1328	,
            809	,
            29	,
            52	,
            37	,
            -820	,
            -1401	,
            -986	,
            -290	,
            -18	,
            -149	,
            -69	,
            279	,
            463	,
            712	,
            1439	,
            1764	,
            688	,
            -445	,
            -305	,
            -163	,
            -820	,
            -1031	,
            -853	,
            -1740	,
            -2212	,
            -884	,
            167	,
            335	,
            970	,
            2042	,
            2157	,
            1307	,
            807	,
            130	,
            -1008	,
            -1458	,
            -1087	,
            -619	,
            -448	,
            -399	,
            -106	,
            744	,
            1309	,
            1059	,
            1235	,
            1341	,
            297	,
            -687	,
            -969	,
            -1206	,
            -1539	,
            -1321	,
            -551	,
            -422	,
            -984	,
            -480	,
            1121	,
            1446	,
            696	,
            1068	,
            1614	,
            784	,
            17	,
            241	,
            -13	,
            -1011	,
            -1390	,
            -818	,
            -214	,
            -233	,
            -377	,
            -200	,
            139	,
            355	,
            604	,
            1538	,
            1905	,
            765	,
            -80	,
            -10	,
            -235	,
            -915	,
            -995	,
            -840	,
            -1514	,
            -1785	,
            -838	,
            188	,
            530
    };

    @Test
    public void testReassignedSpectrum(){
        String audioFilePath = this.getClass().getResource("/audio/chord.wav").getPath();
        AudioReader reader = new AudioReader(audioFilePath, 4000);
        ReassignedSpectrumHarmonicPart reassignedSpectrumHarmonicPart = new ReassignedSpectrumHarmonicPart(reader, 1024, 2, 0.5f, 0.4f);
        float[][] magSpec = reassignedSpectrumHarmonicPart.getMagSpectrumStandardArrayForm(1024);
        Assert.assertTrue(magSpec.length > 1);

    }


    @Test(enabled = false)
    public void testReassignedSpectrumNewMethod(){
        AudioReader reader = new AudioReader(data, 4000);
        ReassignedSpectrumHarmonicPart reassignedSpectrum = new ReassignedSpectrumHarmonicPart(reader, 1024, 2, 0.5f, 0.4f);
        reassignedSpectrum.getFrequencyReasValues();
        reassignedSpectrum.getMagSpec();


    }




}