package part2;

import java.util.HashMap;
import java.util.Map;
/*
383. Ransom Note
Easy
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 */
public class A383_Ransom_Note {
    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean flag = false;
        int[] asc2Array = new int[123];
        //set characters library
        for (int i = 0; i < magazine.length(); i++) {
            asc2Array[(int) magazine.charAt(i)]++;//a-->z <=> arr[97]-->arr[122], count amount of charaters
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (asc2Array[(int) ransomNote.charAt(i)] == 0) {
                return false;
            } else {
                flag = true;
                asc2Array[(int) ransomNote.charAt(i)]--;
            }

        }
        return flag;
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }
    public static boolean canConstruct2(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(int i = 0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            count[c-'a']++;
        }
        for(int i =0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            count[c-'a']--;
            if( count[c-'a']<0) return false;
        }
        return true;
    }
    public static boolean canConstruct3(String ransomNote, String magazine) {


        int countRansom[]=new int[26];
        int countMagazine[]=new int[26];

        for(int i=0;i<ransomNote.length();i++){

            char ch=ransomNote.charAt(i);

            countRansom[ch-'a']++;
        }

        for(int i=0;i<magazine.length();i++){

            char ch=magazine.charAt(i);

            countMagazine[ch-'a']++;
        }

        for(int i=0;i<26;i++){

            if(countRansom[i] > countMagazine[i])
                return false;
        }
        return true;
    }
    public static boolean canConstruct4(String ransomNote, String magazine) {
        int[] ind = new int[26];
        int index=0;
        for(char c : ransomNote.toCharArray())
        {
            index = magazine.indexOf(c, ind[c - 'a']);
            if (index == -1) return false;
            ind[c - 'a'] = index+1;
        }
        return true;
    }
}
