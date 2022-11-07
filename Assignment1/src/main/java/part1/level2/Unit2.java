package part1.level2;

public class Unit2 {

    public static void main(String[] args) {
        int[] arrI = {5, 4, 3, 7, 55, 8, 10, 9, 21, 1, 6, 32, 19};
        int[] arrD = {4, 6, 2, 4, 5, 6, 8, 5};

        for (int i : removeAt(arrI, arrD)) {

            System.out.print(i + " ");
        }
    }

    public static int[] removeAt(int[] arrI, int[] arrD) {
        int arrILength = arrI.length;
        int count = 0;
        for (int index = 0; index < arrD.length; index++) {
            if (arrD[index] <= arrILength - count) {
//arrILength - count-1 vẫn phải trừ đi 1 tránh việc gán nằm ngoài kích thước của mảng
                for (int i = arrD[index] - 1; i < arrILength - count - 1; i++) {
                    arrI[i] = arrI[i + 1];
                }
                count++;
            }
        }
        int[] newArray = new int[arrILength - count];
        for (int i = 0; i < arrILength - count; i++) {
            newArray[i] = arrI[i];
        }
        return newArray;
    }
}
