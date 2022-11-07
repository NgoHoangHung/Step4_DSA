package part3;

public class A1480_Running_Sum_of_1d_Array {

    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
