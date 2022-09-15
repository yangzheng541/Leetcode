package String.IsAnagram;

import java.util.Hashtable;

public class Solution {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        Hashtable<Integer, Integer> alphabet = new Hashtable<>(), alphabet2 = new Hashtable<>();
        s.chars().forEach(i -> alphabet.put(i, alphabet.getOrDefault(i, 0) + 1));
        t.chars().forEach(i -> alphabet.put(i, alphabet.getOrDefault(i, 0) - 1));
        return alphabet.values().stream().allMatch(a -> a==0);
    }
}
