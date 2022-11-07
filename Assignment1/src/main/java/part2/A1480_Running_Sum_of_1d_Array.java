package part2;

import java.io.PrintStream;

/*
1480. Running Sum of 1d Array
Easy

Companies
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */
public class A1480_Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1, 1};
        int[] arr2 = {4, 6, 5, 7, 5, 8, 6, 4, 2, 3};
        for (int i : runningSum(arr1)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : runningSum(arr2)) {
            System.out.print(i + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
