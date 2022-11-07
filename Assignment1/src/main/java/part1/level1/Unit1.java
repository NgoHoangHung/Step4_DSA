package part1.level1;

public class Unit1 {
    public static void main(String[] args) {
int[] arr = {1,3,5,7,2,4,6};
        for (int i : inputAt(arr,10,4)) {
            System.out.print(i+ " ");
        }
    }

    public static int[] inputAt(int[] arrI, int a, int index) {
        int[] newArray = new int[arrI.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index-1) {
                newArray[i]= arrI[i];
            } else if (i == index -1) {
                newArray[i] = a;
            } else {
                newArray[i]=arrI[i-1];
            }
        }
        return newArray;
    }
}
