package part2;

/*
1342. Number of Steps to Reduce a Number to Zero
Easy
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

Example 1:
Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.

Example 2:
Input: num = 8
Output: 4
Explanation:
Step 1) 8 is even; divide by 2 and obtain 4.
Step 2) 4 is even; divide by 2 and obtain 2.
Step 3) 2 is even; divide by 2 and obtain 1.
Step 4) 1 is odd; subtract 1 and obtain 0.
Example 3:

Input: num = 123
Output: 12

Constraints:
0 <= num <= 106

 */
public class A1342_Number_of_Steps_to_Reduce_a_Number_to_Zero_Easy {
    public static void main(String[] args) {
        System.out.println(numberOfSteps2(100));
    }

    public static int numberOfSteps(int num) {
        int count0 = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else
                num --;
            count0++;
        }
        return count0;
    }

        static int count = 0;
    public static int numberOfSteps1(int num) {
        if (num == 0) return count;
        else if (num % 2 == 0) {
            num /= 2;
        } else {
            num -= 1;
        }
            count++;
        numberOfSteps1(num);
        return count;
    }
    public static int numberOfSteps2(int num){
        if(num==0) return count;
        else if (num % 2 == 0) {
            count++;
            return numberOfSteps2(num/2);
        }
        else  {
            count++;
            return numberOfSteps2(num-1);
        }
    }
}
