package part1.level3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static javax.swing.UIManager.get;

public class Unit1 {
//    public static void main(String[] args) {
//        int[] arrI = {3, 2, 5, 2, 3, 4, 21, 55, 44};
//        Map<Integer, int[]> mapS = new HashMap<>();
//        mapS.put(4, new int[]{4, 5, 3, 2, 1, 6, 4, 3});
//        mapS.put(1, new int[]{1, 1, 1, 1, 1, 1, 1});
//        mapS.put(6, new int[]{2, 2, 2, 2});
//        mapS.put(99, new int[]{3, 3, 3, 3, 3, 3, 33, 3, 3, 3, 3, 3, 3, 3, 33});
//
//
//    }


//    public static int[] insertMany(int[] arrI, Map<Integer, int[]> mapS) {
//        //lấy giá trị của key
//        Set<Integer> key = mapS.keySet();
//        String[] str = key.toString().split("\\D");
//        int[] keyInts = new int[mapS.size()];
//        int k = 0;
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].matches("\\d+")) {
//                keyInts[k] = Integer.parseInt(str[i]);
//                k++;
//            }
//        }
//
//
//        // sắp xếp lại key
//        for (int i = 0; i < keyInts.length; i++) {
//            for (int j = i; j < keyInts.length; j++) {
//                if (keyInts[i] > keyInts[j]) {
//                    int tmp = keyInts[i];
//                    keyInts[i] = keyInts[j];
//                    keyInts[j] = tmp;
//                }
//            }
//        }
//
//        //chèn
//        for (int i = 0; i < mapS.size(); i++) {
//        insertArray( arrI, keyInts[i], mapS.get(keyInts[i]));
//        }
//
//        return null;
//    }
//
//    public static int[] insertArray(int[] arrI, int index, int[] arrS) {
//        int k = 0;
//        int[] newArray = new int[arrI.length + arrS.length];
//        if (arrI.length >= index) {
//
//            for (int i = 0; i < newArray.length; i++) {
//                if (i < index - 1) {
//                    newArray[i] = arrI[i];
//                } else if (i >= index - 1 && i < arrS.length + index - 1) {
//                    newArray[i] = arrS[k];
//                    k++;
//                } else
//                    newArray[i] = arrI[i - arrS.length];
//            }
//
//        } else {
//            int indexTmp = 0;
//            for (int i = arrI.length; i < newArray.length; i++) {
//                newArray[i] = arrS[indexTmp];
//                indexTmp++;
//            }
//        }
//        return newArray;
//    }
}
