package String;

/*
1221. Split a String in Balanced Strings
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

Example 1:
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Example 2:
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.

Example 3:
Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".

Constraints:
2 <= s.length <= 1000
s[i] is either 'L' or 'R'.
s is a balanced string.
 */
public class A1221_Split_a_String_in_Balanced_Strings {


    public  int balancedStringSplit(String s) {
        int count = 0;
        int lengStringSequence = s.length();
        if (s.length() < 2) return -1;
        for (int i = 0; i <lengStringSequence/2; i++) {
            if(checkBlanceArray(s.substring(2*i,2*i+1))&&checkBlanceArray(s.substring(2*i+2))){
                count++;
            }
        }
        return 0;
    }

    public  boolean checkBlanceArray(String checkStringSequence) {
        int count = 0;
        if (checkStringSequence.length() % 2 != 0) return false;
        for (int i = 0; i < checkStringSequence.length(); i++) {
            if (checkStringSequence.charAt(i) == 'R' || checkStringSequence.charAt(i) == 'r') count++;
        }

        return (count == checkStringSequence.length() / 2);
    }

}
