package part3;

/*
1979. Find Greatest Common Divisor of Array
Companies
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

Example 1:
Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

Example 2:
Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.

Example 3:
Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.

Constraints:
2 <= nums.length <= 1000
1 <= nums[i] <= 1000
 */
public class A1979_Find_Greatest_Common_Divisor_of_Array {
    public static void main(String[] args) {
int[] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        int min, max = min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return findCommonDivisor(min, max);
    }

    public static int findCommonDivisor(int min, int max) {
        int GCD = 1;
        if (min == 1) return GCD;
        for (int i = min; i >= 1; i--) {
            if (min % i == 0 && max % i == 0)
                return i;
        }
        return GCD;
    }
}
