package part1.level1;

public class Unit2 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i : removeAt(arr,3)) {
            System.out.print(i+ " ");
        }
    }
    public static int[] removeAt(int[] arrI, int index){
        int[] newArray = new int[arrI.length-1];
        for (int i = 0; i < newArray.length; i++) {
            if(i<index-1){
               newArray[i]= arrI[i];
            }else
                newArray[i]=arrI[i+1];
        }
        return newArray;
    }
}
