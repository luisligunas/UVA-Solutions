//import java.util.*;
//import java.math.BigInteger;
//
//public class Main {
//    public static void main(String[] args) {
//        
//        int[] yarra = new int[4000];
//        int curr = 0;
//        
//        for(int i = 1; i < 10000; i+=2) {
//            if(i % 5 == 0) continue;
//            
//            BigInteger div = new BigInteger(i + "");
//            BigInteger oneoneone = BigInteger.ONE;
//            while(oneoneone.mod(div).compareTo(BigInteger.ZERO) != 0) {
//                oneoneone = new BigInteger(oneoneone.toString() + "1");
//                //System.out.println(oneoneone.mod(div));
//            }
//            yarra[curr++] = oneoneone.toString().length();
//            System.out.println(i);
//        }
//        System.out.println(Arrays.toString(yarra));
//    }
//}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner rennacS = new Scanner(System.in);
//        
//        int[] yarra = {1, 3, 6, 9, 2, 6, 16, 18, 6, 22, 27, 28, 15, 6, 3, 6, 5, 21, 46, 42, 48, 13, 18, 58, 60, 18, 33, 66, 35, 8, 6, 13, 81, 41, 84, 44, 6, 15, 96, 18, 4, 34, 53, 108, 3, 112, 18, 48, 22, 15, 42, 21, 130, 18, 8, 46, 138, 6, 42, 148, 75, 144, 78, 39, 66, 81, 166, 78, 18, 43, 174, 178, 180, 60, 16, 54, 95, 192, 98, 99, 33, 84, 198, 18, 30, 105, 30, 24, 48, 222, 113, 228, 6, 232, 39, 7, 30, 243, 18, 123, 50, 22, 256, 6, 252, 262, 132, 268, 5, 6, 69, 45, 28, 141, 30, 272, 96, 146, 54, 66, 42, 12, 153, 102, 155, 312, 79, 28, 159, 144, 108, 138, 110, 9, 336, 336, 30, 294, 173, 116, 54, 32, 48, 179, 342, 66, 366, 45, 78, 186, 84, 378, 42, 382, 63, 388, 176, 390, 99, 18, 200, 30, 6, 204, 24, 174, 138, 418, 140, 414, 60, 6, 215, 432, 198, 219, 126, 221, 444, 32, 10, 75, 152, 432, 460, 154, 233, 66, 78, 42, 117, 239, 6, 66, 486, 81, 490, 112, 210, 498, 498, 502, 78, 508, 24, 54, 46, 129, 52, 261, 240, 506, 522, 30, 534, 42, 540, 180, 91, 180, 252, 78, 278, 42, 48, 281, 162, 284, 570, 285, 576, 192, 246, 26, 293, 90, 294, 592, 99, 299, 300, 99, 202, 84, 138, 51, 88, 618, 594, 132, 18, 48, 315, 30, 42, 315, 32, 107, 646, 58, 30, 326, 72, 658, 220, 48, 308, 222, 60, 224, 338, 96, 339, 341, 228, 78, 230, 18, 80, 696, 700, 18, 12, 708, 117, 330, 21, 359, 102, 30, 726, 729, 336, 61, 66, 246, 18, 742, 369, 318, 125, 150, 27, 66, 380, 108, 174, 192, 768, 193, 6, 90, 70, 756, 393, 786, 336, 60, 199, 368, 396, 8, 804, 202, 810, 15, 126, 18, 820, 822, 413, 276, 69, 336, 135, 419, 812, 84, 66, 141, 66, 213, 856, 26, 30, 862, 816, 26, 66, 288, 438, 438, 440, 441, 886, 42, 162, 414, 66, 420, 208, 42, 151, 36, 455, 82, 390, 459, 153, 210, 306, 464, 126, 465, 936, 312, 940, 110, 473, 24, 237, 952, 84, 24, 465, 477, 322, 144, 970, 138, 976, 44, 108, 982, 138, 462, 495, 330, 166, 27, 6, 464, 234, 252, 336, 253, 1008, 1018, 1020, 30, 78, 294, 103, 1032, 240, 519, 519, 444, 348, 524, 1050, 162, 150, 96, 212, 1062, 96, 1068, 144, 84, 537, 246, 506, 342, 1086, 198, 1090, 273, 1096, 78, 366, 1102, 135, 1108, 4, 78, 558, 186, 522, 561, 462, 564, 84, 34, 378, 528, 162, 126, 15, 1146, 575, 1152, 132, 180, 189, 581, 1164, 498, 1170, 528, 106, 1170, 1180, 78, 593, 140, 99, 1192, 18, 108, 200, 600, 560, 30, 258, 202, 1216, 286, 6, 1222, 204, 1228, 41, 72, 206, 174, 16, 112, 84, 208, 414, 534, 1254, 1258, 96, 420, 180, 1242, 15, 198, 638, 639, 60, 641, 18, 92, 1290, 645, 1296, 432, 1300, 1302, 653, 48, 198, 12, 219, 659, 55, 378, 1326, 663, 242, 105, 570, 102, 1332, 208, 96, 630, 192, 30, 638, 225, 680, 644, 1366, 111, 456, 686, 1296, 294, 1380, 1380, 72, 462, 318, 198, 42, 699, 699, 660, 66, 32, 656, 234, 108, 42, 84, 158, 713, 1428, 351, 1432, 717, 719, 130, 6, 1446, 198, 290, 726, 690, 162, 486, 18, 81, 336, 735, 1470, 30, 336, 740, 247, 1486, 248, 210, 373, 498, 214, 234, 1494, 8, 1506, 755, 176, 15, 210, 234, 761, 1524, 46, 1530, 24, 364, 162, 66, 1542, 48, 1548, 138, 1552, 387, 779, 222, 156, 1566, 261, 1570, 66, 738, 1578, 240, 1582, 1518, 678, 21, 1566, 133, 30, 200, 228, 1606, 201, 1602, 403, 42, 1618, 1620, 540, 271, 180, 696, 770, 409, 148, 273, 195, 540, 96, 42, 252, 552, 78, 150, 1662, 833, 556, 834, 42, 42, 88, 205, 144, 30, 843, 396, 423, 1696, 566, 486, 390, 852, 1708, 812, 570, 16, 855, 430, 287, 78, 18, 576, 866, 576, 138, 1740, 246, 291, 78, 272, 584, 150, 879, 879, 105, 90, 420, 66, 882, 1776, 1776, 24, 1782, 893, 1788, 99, 162, 897, 768, 900, 300, 138, 297, 1810, 42, 286, 848, 606, 1822, 252, 870, 305, 138, 166, 51, 786, 288, 1846, 903, 264, 432, 618, 78, 1860, 1782, 933, 132, 935, 1872, 938, 313, 18, 804, 48, 118, 60, 315, 30, 90, 380, 86, 953, 902, 42, 1912, 945, 36, 112, 96, 230, 321, 386, 21, 444, 138, 1938, 924, 174, 1948, 195, 90, 306, 978, 39, 150, 84, 178, 216, 986, 1974, 1978, 282, 660, 331, 144, 180, 664, 998, 999, 924, 1001, 666, 210, 670, 60, 2016, 672, 966, 816, 1013, 2028, 1014, 954, 96, 1019, 78, 1017, 44, 1023, 438, 342, 176, 140, 684, 2062, 78, 2068, 108, 690, 165, 54, 1040, 1041, 298, 1044, 240, 66, 2088, 2098, 190, 2100, 42, 18, 1055, 2112, 56, 162, 12, 192, 708, 532, 710, 351, 2136, 330, 2140, 2142, 1008, 306, 63, 2152, 1077, 336, 30, 102, 98, 90, 498, 65, 930, 2178, 726, 174, 2187, 198, 312, 336, 1014, 183, 105, 1101, 2206, 2162, 66, 553, 246, 474, 2220, 18, 1040, 2226, 1056, 84, 1118, 1119, 1107, 1121, 318, 258, 2250, 375, 60, 450, 144, 120, 1133, 2268, 27, 2272, 198, 273, 228, 1140, 762, 108, 364, 1146, 2296, 198, 174, 966, 192, 2308, 231, 2304, 330, 579, 30, 44, 534, 16, 18, 583, 90, 2338, 2340, 210, 1173, 2268, 1175, 180, 1178, 336, 393, 368, 2358, 374, 2370, 336, 264, 60, 476, 2382, 30, 2388, 597, 184, 1104, 1199, 2058, 1188, 1148, 24, 2410, 126, 2416, 290, 2412, 2422, 606, 1038, 48, 810, 1218, 45, 305, 348, 2446, 195, 126, 222, 54, 2458, 1166, 2460, 137, 822, 96, 2472, 619, 33, 1239, 570, 276, 1170, 598, 207, 226, 336, 60, 278, 1188, 192, 405, 1074, 1257, 228, 630, 2436, 342, 252, 46, 592, 1218, 2538, 66, 2542, 423, 2548, 425, 66, 639, 213, 294, 232, 1200, 366, 2568, 615, 78, 2578, 308, 90, 198, 2586, 259, 2592, 546, 1232, 2448, 72, 78, 1304, 186, 66, 2616, 864, 2620, 420, 105, 14, 438, 2632, 1314, 84, 414, 1320, 882, 441, 30, 378, 2656, 886, 2658, 2662, 42, 624, 1335, 486, 223, 414, 1146, 447, 2686, 42, 198, 1346, 420, 2698, 24, 624, 1353, 126, 1355, 2712, 18, 1359, 453, 1164, 108, 682, 2730, 1365, 528, 246, 2740, 30, 165, 916, 390, 2752, 459, 660, 50, 153, 2766, 210, 1296, 1334, 2776, 198, 918, 22, 1392, 2788, 31, 126, 699, 1395, 1400, 1401, 600, 689, 936, 672, 936, 2818, 30, 2820, 256, 330, 1332, 2832, 709, 1328, 1419, 1421, 24, 6, 2850, 711, 408, 2856, 2860, 204, 1380, 450, 252, 624, 24, 1439, 231, 465, 2886, 1431, 1218, 262, 2896, 222, 966, 2902, 144, 2908, 35, 2910, 1458, 138, 462, 39, 2926, 28, 2928, 1254, 132, 2938, 688, 108, 420, 2946, 678, 984, 1478, 268, 414, 1481, 462, 371, 2970, 495, 228, 990, 10, 234, 476, 420, 498, 40, 81, 1499, 1500, 6, 480, 1392, 3010, 1430, 1290, 3018, 234, 3022, 252, 696, 432, 1008, 253, 759, 380, 1424, 138, 508, 3024, 105, 3054, 198, 204, 1020, 1533, 90, 123, 438, 720, 1539, 78, 1541, 882, 1544, 28, 309, 162, 1032, 1326, 1484, 42, 148, 240, 282, 519, 1559, 156, 1557, 754, 444, 60, 30, 3136, 168, 1044, 96, 1572, 1518, 88, 1050, 30, 486, 756, 1581, 3166, 72, 150, 1494, 288, 272, 636, 636, 177, 1062, 29, 510, 506, 456, 96, 1601, 1068, 1604, 234, 432, 1072, 84, 3220, 146, 1380, 1076, 1611, 780, 246, 65, 462, 1518, 1520, 342, 3250, 542, 3256, 3258, 1086, 150, 594, 1398, 1635, 3270, 112, 273, 192, 462, 774, 66, 3288, 132, 78, 3298, 3300, 1098, 1653, 3306, 42, 3312, 795, 553, 405, 1661, 3324, 832, 3330, 12, 1610, 234, 768, 3342, 1673, 784, 558, 1434, 558, 1679, 1680, 522, 6, 561, 3370, 843, 306, 540, 462, 1584, 564, 3388, 1695, 252, 273, 102, 1602, 205, 3406, 486, 378, 1706, 528, 786, 310, 162, 1628, 378, 184, 3432, 1470, 180, 15, 312, 3438, 431, 336, 1725, 384, 1152, 3460, 3462, 1733, 3468, 132, 1650, 180, 210, 3422, 567, 158, 1743, 698, 498, 804, 318, 3492, 1680, 498, 308, 1755, 1170, 879, 1584, 1506, 30, 3526, 1764, 318, 1766, 3510, 3538, 20, 3540, 1773, 78, 429, 144, 254, 1779, 1779, 1524, 420, 861, 3570, 99, 168, 3576, 3580, 1194, 240, 96, 54, 3592, 108, 1740, 138, 600, 3606, 1800, 858, 602, 3616, 138, 1680, 3622, 90, 1710, 1815, 258, 909, 606, 110, 1821, 156, 220, 3648, 84, 858, 3658, 522, 18, 576, 3666, 367, 3672, 1838, 282, 612, 84, 3684, 240, 1230, 123, 1232, 216, 3700, 1518, 336, 3708, 618, 598, 522, 1859, 3660, 48, 3726, 336, 30, 933, 12, 1246, 84, 882, 624, 1782, 330, 1242, 816, 534, 1880, 455, 3766, 1884, 3762, 294, 3774, 3778, 198, 96, 540, 1260, 1776, 1264, 949, 1820, 180, 1901, 3726, 438, 102, 15, 346, 198, 3820, 1274, 924, 546, 1914, 3832, 639, 116, 1826, 180, 3846, 1923, 770, 963, 252, 1808, 54, 3862, 276, 104, 546, 1290, 969, 1935, 1940, 32, 858, 1944, 1296, 912, 432, 834, 1886, 3900, 1953, 1302, 1955, 42, 1958, 653, 1959, 1961, 48, 491, 1310, 198, 210, 12, 1686, 3942, 1973, 358, 657, 1914, 1977, 159, 464, 165, 3966, 1134, 342, 56, 480, 946, 1326, 852, 1989, 3988, 306, 726, 570, 105, 500, 87, 4006, 90, 570, 34, 102, 4018, 268, 3996, 2013, 624, 644, 108, 366, 576, 288, 930, 630, 2024, 4050, 192, 4056, 90, 390, 112, 1722, 312, 1914, 4072, 675, 2039, 78, 2040, 660, 1932, 4090, 22, 240, 4098, 4098, 186, 111, 1758, 2055, 1368, 1958, 2058, 474, 90, 4126, 2064, 3888, 1033, 294, 4138, 20, 1380, 84, 4140, 1776, 4152, 2078, 693, 72, 1980, 1386, 378, 672, 318, 4176, 198, 336, 1012, 13, 2030, 42, 1794, 699, 144, 75, 2097, 300, 660, 4210, 382, 4216, 4218, 198, 170, 96, 4228, 2115, 1968, 666, 702, 1060, 2121, 120, 606, 108, 1063, 126, 4258, 4260, 84, 400, 474, 2135, 1424, 138, 388, 2139, 2141, 1428, 2144, 102, 1053, 1432, 4296, 176, 330, 232, 690, 2151, 2034, 2157, 264, 1036, 390, 4326, 18, 420, 618, 4336, 4338, 1446, 84, 594, 4348, 684, 870, 242, 726, 924, 2181, 198, 256, 690, 1093, 162, 2100, 336, 486, 265, 18, 2195, 2090, 314, 533, 81, 48, 336, 551, 200, 735, 630, 4410, 4420, 4422, 2088, 714, 30, 30, 1008, 2112, 2220, 2220, 4446, 741, 4450, 120, 4456, 294, 4458, 4462, 744, 540, 2096, 630, 66, 1119, 2240, 249, 96, 2211, 1494, 1123, 642, 204, 642, 234, 751, 4482, 1038, 1504, 2258, 753, 24, 2261, 4518, 1938, 1078, 2265, 348, 528, 126, 174, 2273, 1516, 15, 1092, 210, 2208, 2280, 702, 4566, 2283, 978, 1072, 198, 90, 4572, 4582, 138, 96, 2295, 1530, 2298, 72, 1113, 2301, 80, 418, 1092, 1974, 486, 2220, 924, 66, 660, 1542, 140, 560, 61, 2319, 48, 2321, 1548, 7, 4650, 414, 1552, 4656, 754, 222, 1074, 924, 1161, 4672, 2337, 2339, 75, 222, 756, 468, 4690, 342, 60, 42, 1566, 4702, 261, 1104, 672, 4710, 572, 66, 2360, 2361, 2268, 1182, 738, 1183, 1578, 1014, 430, 720, 92, 4746, 2375, 672, 1155, 2379, 4554, 432, 678, 450, 366, 21, 112, 4698, 2046, 4782, 2393, 228, 399, 4792, 90, 2399, 800, 600, 198, 228, 2256, 802, 4816, 780, 4818, 78, 201, 438, 805, 4806, 690, 1209, 782, 2324, 390, 186, 126, 330, 4854, 336, 972, 1620, 390, 540, 2435, 442, 1219, 240, 813, 2304, 540, 2444, 264, 696, 2378, 2310, 1092, 1634, 2100, 1636, 1227, 4624, 444, 2459, 18, 819, 378, 195, 4930, 2466, 4936, 32, 1620, 4942, 96, 84, 2475, 42, 413, 252, 110, 708, 4966, 828, 552, 226, 234, 1146, 1168, 150, 2493, 1662, 330, 1664, 2358, 357, 2499, 2501, 1668, 626, 1670, 2502, 1204, 42, 5020, 1674, 152, 2438, 126, 2154, 264, 2519, 2485, 615, 714, 432, 50, 405, 1164, 5058, 30, 2460, 2529, 24, 460, 396, 2538, 423, 1270, 528, 5086, 726, 5088, 154, 1698, 5098, 1700, 1458, 2553, 390, 2412, 1704, 336, 853, 2556, 2484, 5124, 2442, 366, 2436, 466, 1710, 1248, 138, 2573, 90, 48, 5152, 2565, 66, 198, 1290, 5166, 861, 110, 246, 2490, 5178, 78, 280, 18, 5188, 2492, 576, 433, 2598, 2226, 462, 210, 372, 1728, 600, 138, 2448, 2486, 1740, 2613, 738, 2615, 5232, 77, 390, 291, 2226, 234, 1260, 1276, 816, 750, 1752, 1052, 414, 2508, 478, 150, 5272, 879, 2639, 2640, 2637, 2480, 105, 6, 429, 5296, 54, 90, 5302, 420, 5308, 2576, 66, 204, 2646, 624, 2661, 1140, 584, 1776, 1333, 5328, 252, 756, 24, 2673, 1782, 2675, 52, 486, 2552, 2679, 645, 1788, 174, 130, 297, 846, 162, 5380, 192, 2693, 1264, 2691, 5392, 768, 2699, 490, 900, 1802, 900, 1158, 2706, 5416, 5418, 138, 112, 891, 660, 2715, 5430, 1359, 42, 2720, 907, 1254, 2724, 858, 90, 2544, 442, 42, 1818, 210, 5466, 547, 420, 1369, 2739, 756, 2741, 870, 498, 2448, 915, 154, 414, 5500, 5502, 2753, 786, 498, 444, 153, 2759, 345, 786, 5526, 288, 5530, 502, 336, 2660, 5538, 330, 903, 2670, 60, 792, 926, 432, 1353, 2781, 1314, 1392, 1854, 2786, 78, 1194, 5580, 1860, 75, 5346, 2795, 1104, 1344, 508, 933, 1290, 396, 455, 180, 2805, 40, 1872, 24, 5622, 880, 432, 2814, 2730, 939, 2819, 470, 54, 1882, 804, 5650, 2826, 5656, 5658, 144, 606, 354, 5668, 689, 60, 810, 315, 198, 2841, 506, 316, 30, 1423, 270, 230, 5700, 1140, 438, 258, 571, 196, 1429, 126, 2859, 2784, 2706, 336, 52, 126, 5736, 5736, 5740, 5742, 2460, 5748, 2835, 522, 36, 1326, 822, 336, 104, 288, 2772, 550, 1404, 5778, 690, 5782, 963, 2478, 965, 1158, 240, 21, 1450, 276, 5806, 78, 444, 2906, 138, 506, 5820, 5814, 2913, 924, 2352, 306, 96, 2919, 522, 2921, 5844, 1462, 1950, 195, 5856, 270, 5860, 30, 2933, 5868, 306, 2514, 2934, 2939, 2940, 39, 2436, 150, 168, 1435, 5896, 2768, 84, 5902, 534, 2790, 2816, 648, 480, 2958, 285, 2961, 5926, 462, 5922, 464, 5934, 5938, 456, 282, 936, 1980, 540, 1984, 66, 116, 993, 132, 432, 966, 426, 180, 966, 1992, 5980, 960, 2993, 1456, 2994, 1380, 999, 2568, 32, 2772, 858, 3003, 6010, 78, 182, 462, 1998, 1422, 210, 6028, 81, 2010, 3018, 180, 2586, 3021, 6046, 2882, 2016, 3026, 2016, 328, 252, 966, 3033, 816, 1398, 6072, 986, 1013, 3039, 78, 2028, 761, 2030, 3042, 66, 954, 1220, 2864, 1470, 740, 288, 6112, 3057, 420, 3060, 78, 278, 3051, 6130, 1533, 2736, 438, 132, 6142, 3069, 42, 1025, 438, 2990, 342, 60, 79, 1320, 495, 528, 3086, 420, 498, 882, 2052, 2948, 6186, 75, 562, 3098, 3099, 234, 443, 6204, 2658, 6210, 108, 6216, 2070, 6220, 42, 1434, 2076, 165, 110, 162, 2928, 1027, 3120, 6246, 1041, 414, 78, 6256, 284, 894, 6262, 1044, 6268, 1045, 720, 1569, 66, 570, 1020, 6286, 990, 6264, 420, 6294, 94, 6300, 570, 624, 6300, 3155, 3074, 3158, 1540, 42, 3161, 18, 3164, 486, 3165, 6336, 2112, 1488, 6342, 576, 906, 168, 6352, 162, 3179, 1590, 36, 6366, 192, 1518, 1062, 2730, 2126, 2124, 1470, 1596, 6388, 246, 2130, 78, 1053, 129, 1008, 3108, 336, 2136, 286, 990, 2730, 2140, 6420, 1071, 2142, 3132, 918, 390, 184, 1008, 3024, 306, 1612, 2150, 189, 586, 6456, 210, 308, 3108, 924, 3231, 6472, 336, 90, 270, 30, 498, 306, 1298, 525, 88, 1056, 294, 1392, 270, 3102, 3056, 498, 882, 195, 815, 592, 3180, 1088, 930, 46, 2178, 1506, 30, 2178, 1091, 174, 3275, 6552, 533, 936, 6561, 3281, 198, 1642, 6570, 312, 2192, 1008, 1316, 3164, 2820, 598, 1014, 3114, 549, 3299, 330, 105, 2202, 1101, 300, 1552, 1524, 6618, 6618, 534, 6486, 2838, 1044, 198, 474, 1659, 1596, 24, 2992, 540, 738, 3326, 474, 6658, 6660, 2220, 3248, 54, 2856, 6672, 202, 3339, 3120, 405, 6678, 1672, 6690, 1056, 180, 84, 6700, 6702, 288, 6708, 3354, 168, 1119, 3359, 138, 3321, 930, 3363, 546, 3366, 6736, 1606, 954, 102, 258, 1584, 546, 2250, 1624, 1125, 1690, 161, 132, 966, 60, 156, 1350, 6778, 1356, 144, 88, 120, 679, 6792, 2910, 522, 3399, 3401, 2268, 618, 966, 27, 400, 6816, 3222, 6822, 3413, 6828, 594, 6832, 273, 2928, 855, 228, 830, 3420, 240, 132, 6856, 6498, 762, 6862, 108, 6868, 3435, 1092, 1518, 1146, 2946, 3441, 3360, 3403, 6888, 1680, 198, 6898, 1122, 522, 1151, 966, 3455, 1110, 3458, 48, 576, 462, 6924, 390, 28, 231, 990, 6912, 630, 130, 3473, 6948, 330, 816, 1737, 3479, 3480, 30, 6966, 132, 6970, 1098, 6976, 498, 534, 6982, 48, 420, 3495, 54, 1749, 1749, 1750, 3404, 42, 567, 90, 3506, 7014, 7018, 1392, 2340, 1171, 630, 572, 540, 1695, 391, 1173, 503, 6804, 234, 32, 3525, 7056, 180, 3366, 252, 285, 7068, 3534, 214, 336, 3539, 96, 1179, 558, 1104, 1518, 215, 3450, 1140, 7074, 7102, 1122, 7108, 546, 2370, 646, 1008, 3560, 3344, 1018, 594, 264, 3054, 180, 638, 192, 1428, 1020, 2382, 275, 3410, 560, 3579, 30, 252, 2388, 1749, 140, 1791, 7176, 552, 3486, 326, 3593, 78, 3312, 7192, 3597, 3432, 378, 2058, 7206, 3564, 1030, 1803, 618, 7218, 3444, 3480, 72, 7228, 1032, 7230, 402, 126, 834, 3621, 7246, 658, 7248, 74, 870, 240, 104, 7236, 546, 7266, 220, 1038, 3438, 700, 1818, 3641, 1038, 294, 1738, 48, 2432, 810, 3108, 1188, 3653, 7308, 1218, 1190, 135, 1686, 3660, 915, 3440, 348, 1466, 611, 308, 890, 7338, 1572, 195, 7348, 1225, 126, 1050, 222, 432, 99, 598, 1842, 162, 8, 7374, 1794, 660, 3498, 1804, 7380, 3492, 7392, 852, 1050, 411, 224, 2466, 105, 7410, 96, 2472, 2472, 180, 570, 636, 1584, 1857, 7432, 33, 903, 1062, 3717, 338, 570, 7450, 1792, 7456, 7458, 828, 3504, 1170, 96, 30, 1794, 3738, 621, 748, 1068, 7486, 1872, 678, 1218, 1008, 7498, 576, 60, 3753, 834, 84, 682, 3758, 136, 1188, 3761, 192, 1882, 3536, 1215, 2512, 1074, 7540, 198, 3773, 2516, 3771, 246, 228, 3779, 1890, 630, 1518, 7308, 3696, 631, 7576, 78, 342, 7582, 756, 1084, 3795, 138, 1855, 1776, 230, 1267, 7606, 1086, 1218, 110, 2538, 1800, 508, 198, 3668, 7626, 1758, 32, 3270, 3819, 1269, 3821, 7644, 1912, 546, 1275, 90, 198, 3726, 1248, 80, 284, 639, 7672, 639, 3288, 1920, 294, 7686, 696, 7690, 546, 3738, 7698, 1200, 7702, 366, 1776, 700, 7704, 1929, 615, 3306, 1287, 7726, 3770, 234, 18, 7734, 3780, 860, 924, 420, 270, 3696, 7752, 1939, 3879, 198, 3324, 7758, 304, 612, 777, 12, 2592, 150, 1260, 1794, 2596, 546, 7792, 3696, 708, 1876, 7344, 30, 72, 424, 300, 7816, 558, 234, 7822, 3912, 7828, 95, 186, 1840, 198, 56, 330, 522, 3818, 2616, 3926, 2592, 140, 1122, 7860, 3933, 420, 1232, 7872, 3938, 3939, 105, 3941, 42, 3234, 606, 1314, 1924, 7896, 7900, 564, 3953, 718, 3942, 960, 84, 3959, 3916, 414, 7926, 3960, 102, 3966, 7936, 3728, 882, 1794, 441, 7948, 3975, 30, 216, 378, 3762, 3981, 3840, 102, 7968, 528, 2658, 52, 3806, 7974, 1134, 7986, 780, 2664, 726, 1260, 126, 975, 624, 2002, 2670, 1335, 8016, 1458, 264, 560, 1276, 30, 669, 1932, 414, 4019, 336, 1146, 618, 447, 3936, 4026, 3450, 8058, 8058, 122, 42, 8068, 1152, 594, 490, 4038, 2020, 232, 8086, 1348, 1260, 4046, 8094, 132, 1620, 24, 66, 1872, 811, 180, 2029, 352, 1353, 4061, 378, 246, 1978, 4065, 442, 2712, 3486, 3824, 4073, 28, 18, 3930, 1359, 495, 1020, 1359, 2722, 1164, 8170, 742, 48, 8178, 324, 3486, 2046, 3870, 1365, 2730, 1170, 4095, 1334, 630, 3948, 4104, 528, 1995, 738, 8218, 2740, 8220, 432, 30, 4115, 8232, 4118, 318, 165, 4121, 2748, 112, 222, 1170, 3938, 8256, 250, 8262, 3540, 8268, 459, 8272, 660, 3888, 546, 150, 8286, 459, 8290, 2073, 8296, 1344, 2766, 3762, 630, 3558, 4155, 1296, 462, 4002, 78, 420, 54, 1041, 8328, 96, 198, 4020, 1314, 2754, 3920, 66, 3576, 8352, 120, 642, 4176, 4181, 8364, 4184, 380, 93, 8376, 126, 1904, 164, 599, 8388, 699, 108, 4185, 339, 15, 4200, 600, 1401, 1938, 4094, 3978, 2806, 600, 8422, 2067, 8428, 4215, 936, 174, 672, 4026, 4221, 8446, 1680, 2808, 689, 8454, 192, 2820, 30, 4233, 8460, 294, 228, 1806, 1380, 768, 3984, 990, 978, 606, 1332, 2044, 2832, 8500, 386, 4140, 462, 2127, 8512, 3984, 3648, 710, 4257, 2842, 4263, 288, 858, 8536, 2846, 72, 8542, 6, 1394, 4016, 2850, 693, 2133, 3666, 4281, 1974, 90, 408, 4286, 8568, 2046, 2860, 8580, 345, 204, 770, 660, 2149, 1433, 1380, 3684, 450, 1076, 1404, 756, 246, 624, 696, 8622, 4313, 2876, 72, 1056, 4317, 1053, 4320, 231, 8646, 1395, 30, 2032, 786, 618, 2886, 8662, 4293, 8668, 924, 1218, 723, 786, 868, 1368, 48, 2172, 8688, 4346, 222, 8698, 336, 2898, 4353, 8706, 420, 8712, 4158, 4359, 432, 60, 8724, 84, 8730, 105, 2912, 8730, 8740, 624, 4373, 672, 1458, 8752, 414, 4140, 876, 462, 398, 39, 3738, 705, 4290, 22, 8778, 8782, 84, 368, 4292, 8784, 1386, 1254, 1014, 1467, 8806, 4202, 396, 3774, 8814, 8818, 8820, 2064, 96, 324, 4415, 88, 4418, 4419, 420, 21, 8838, 553, 2158, 678, 208, 984, 8860, 8862, 4433, 1260, 4434, 4194, 804, 2046, 2173, 1242, 8886, 4443, 4176, 2223, 30, 202, 1386, 4284, 1113, 4350, 198, 2970, 30, 495, 810, 1487, 1456, 144, 228, 2233, 2970, 1914, 2980, 30, 4268, 234, 4475, 1278, 78, 4080, 1428, 4481, 420, 4484, 8970, 1494, 4370, 120, 3846, 690, 126, 44, 243, 4048, 4497, 4499, 1125, 1500, 3002, 18, 9010, 2253, 210, 4340, 480, 276, 4176, 9028, 820, 9030, 1290, 4290, 1130, 4521, 4428, 4524, 1290, 822, 3018, 9058, 240, 234, 4533, 9066, 4416, 210, 2184, 1296, 252, 2190, 696, 2220, 10, 432, 826, 3024, 4302, 9102, 3900, 9108, 759, 2100, 2277, 276, 1302, 1140, 3042, 4272, 198, 1522, 9136, 18, 138, 1110, 1524, 3918, 1525, 9072, 4578, 105, 229, 336, 748, 559, 9162, 4586, 198, 264, 3060, 204, 4593, 3060, 12, 2212, 2160, 4599, 1533, 4601, 270, 2302, 300, 123, 708, 438, 9220, 2200, 4613, 838, 720, 3954, 1539, 4619, 4620, 234, 330, 4623, 812, 486, 9256, 2254, 2646, 2262, 4632, 330, 168, 84, 4638, 927, 928, 1547, 150, 1326, 162, 2323, 3096, 1456, 910, 1326, 565, 4452, 4655, 1518, 726, 4659, 42, 4661, 444, 4410, 210, 720, 3112, 282, 9340, 9342, 2154, 3116, 1557, 4554, 4677, 3990, 66, 156, 1008, 4671, 9370, 102, 9376, 4592, 2262, 426, 1332, 1140, 4695, 60, 81, 30, 624, 1567, 2244, 9312, 9408, 4706, 168, 554, 9420, 3132, 856, 96, 4715, 1048, 4718, 1573, 4716, 630, 1518, 26, 726, 264, 1344, 3150, 9460, 3154, 4733, 2224, 30, 9472, 1458, 4739, 1494, 756, 2314, 1581, 9490, 862, 9496, 1914, 9498, 336, 72, 768, 1585, 450, 765, 1494, 595, 2332, 2040, 366, 864, 2383, 816, 9538, 1932, 636, 4773, 1908, 955, 1160, 4518, 286, 177, 520, 1062, 4098, 4496, 87, 780, 510, 66, 222, 4793, 1554, 1518, 2340, 456, 1540, 4800, 288, 246, 4803, 2058, 267, 4698, 3206, 3204, 9622, 4812, 9628, 4815, 234, 418, 1296, 465, 4821, 438, 603, 3216, 294, 252, 2226, 1380, 9660, 1380, 438, 4572, 1136, 2419, 1613, 1380, 1540, 3228, 346, 440, 4833, 9696, 780, 1188, 1560, 4560, 72, 738, 882, 195, 4859, 4860, 462, 280, 4554, 786, 2433, 318, 9738, 4560, 9742, 1026, 9748, 1386, 9750, 886, 1626, 2373, 750, 9766, 4884, 9768, 336, 3258, 42, 9780, 3258, 4893, 150, 4895, 1398, 96, 35, 1782, 4901, 1398, 576, 9810, 1635, 9816, 9810, 660, 414, 1185, 9828, 336, 9832, 819, 4919, 54, 192, 1596, 462, 9850, 4814, 9856, 3286, 774, 96, 66, 1610, 4935, 9864, 1968, 132, 30, 4941, 9886, 420, 234, 1140, 9894, 468, 12, 3300, 4953, 3294, 208, 4730, 690, 108, 1653, 4961, 9918, 1241, 9930, 42, 522, 3312, 1988, 1620, 588, 9948, 795, 804, 1659, 4752, 474, 1215, 9966, 4983, 2262, 554, 302, 4688, 9972, 4884, 2496, 4278, 1632, 3330, 192, 36};
//        
//        while(rennacS.hasNext()) {
//            int num = rennacS.nextInt();
//            
//            System.out.println(yarra[num/2 - num/5 + num/10]);
//        }
//    }
//}

//YOU CAN PREGEN LOL. BUT IT TOOK SO LONG TO GENERATE ALL USING BIGINTEGER.

import java.util.*;

public class Main10127 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int num = rennacS.nextInt();
            
            int ones = 1;
            int digits = 1;
            while(ones % num != 0) {
                ones = (ones*10 + 1)%num;
                digits++;
            }
            System.out.println(digits);
        }
    }
}