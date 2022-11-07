package part3;

/*
1512. Number of Good Pairs
Companies
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Example 3:
Input: nums = [1,2,3]
Output: 0

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
 */
public class A1512_Number_of_Good_Pairs {
    public static void main(String[] args) {

    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

    public int numIdenticalPairs1(int[] nums) {
        int count = 0;
        int[] ans = new int[101];
        for (int num : nums) {
            count += nums[num]++;// cộng gộp các biến num khi nó chưa được tăng giá trị với toán tử ++
        }
        return count;
    }
}
