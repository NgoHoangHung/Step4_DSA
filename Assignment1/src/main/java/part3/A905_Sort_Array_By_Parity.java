package part3;

/*
905. Sort Array By Parity
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.

Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
1 <= nums.length <= 5000
0 <= nums[i] <= 5000
 */
public class A905_Sort_Array_By_Parity {
    public static void main(String[] args) {

    }
    public int[] sortArrayByParity(int[] nums) {
        int[] newNumbers = new int[nums.length];
        int evenIntegers = 0;
        int oddIntegers = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newNumbers[evenIntegers] = nums[i];
                evenIntegers++;
            }
            else{
                newNumbers[oddIntegers] = nums[i];
                oddIntegers--;
            }
        }
        return newNumbers;
    }
}
