package part1.level2;

public class Unit1 {
    public static void main(String[] args) {
        int[] arrI = {1,3,5,7,2,4,6};
        int[] arrS = {11,22,55,77};
        for (int i : inputAt(arrI,arrS,3)) {
            System.out.print(i + " ");
        }
    }

    public static int[] inputAt(int[] arrI, int[] arrS, int index){
        int[] newArray = new int[arrI.length+arrS.length];

        int k =0;
        for (int i = 0; i < newArray.length; i++) {
            if(i<index-1){
            newArray[i]=arrI[i];
        } else if (i>=(index-1)&&i<(index+arrS.length-1)) {
            newArray[i]=arrS[k];
            k++;
        }
            else{
            newArray[i] =arrI[index-1];
            index++;
            }
        }
        return newArray;
    }
}
