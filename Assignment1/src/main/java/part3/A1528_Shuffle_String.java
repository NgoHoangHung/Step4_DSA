package part3;

import java.util.Arrays;

/*
1528. Shuffle String
Companies
You are given a string s and an integer array indices of the same length.
 The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
Example 1:
4,5,6,7,0,2,1,3
c o d e l e e t
| | | | | | | |
| | | | | | | |
| | | | | | | |
V V V V V V V V

l e e t c o d e
0,1,2,3,4,5,6,7
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.


Constraints:

s.length == indices.length == n
1 <= n <= 100
s consists of only lowercase English letters.
0 <= indices[i] < n
All values of indices are unique.
 */
public class A1528_Shuffle_String {

    public static void main(String[] args) {

//        int[] indices = {4,5,6,7,0,2,1,3};
//        for (int i = 0; i < indices.length; i++) {
//            System.out.println(Arrays.binarySearch(indices,i));
//        }
    }

    public int findIndex(int[] arrayInt, int value) {
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == value) return i;
        }
        return -1;
    }

    public String restoreString(String s, int[] indices) {
        String resul = "";
        for (int i = 0; i < indices.length; i++) {
            resul += s.charAt(findIndex(indices, i));
        }
        return resul;
    }

    public String restoreString2ms(String s, int[] indices) {
        char ch[] = s.toCharArray();
        int n = ch.length;
        char ch1[] = new char[n];

        for (int i = 0; i < n; i++) {
            ch1[indices[i]] = ch[i];
        }

        return new String(ch1);

    }

    public String restoreString1ms(String s, int[] indices) {
        char[] charIndices = new char[indices.length];
        for (int i = 0; i < charIndices.length; i++) {
            charIndices[indices[i]] = s.charAt(i);
        }
        return String.valueOf(charIndices);
    }
}
