package part3;

public class A1672_Richest_Customer_Wealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {

        int resul = 0;
        for (int i = 0; i < accounts.length; i++) {
            int tmp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tmp += accounts[i][j];
            }
            if (tmp > resul) resul = tmp;
        }
        return resul;
    }
}
