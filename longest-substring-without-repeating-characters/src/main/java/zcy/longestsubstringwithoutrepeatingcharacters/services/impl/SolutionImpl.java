package zcy.longestsubstringwithoutrepeatingcharacters.services.impl;

import zcy.longestsubstringwithoutrepeatingcharacters.services.Solution;

import java.util.HashSet;
import java.util.Set;

public class SolutionImpl implements Solution {
    @Override
    public int lengthOfLongestSubstring(String s) {
        final int LENGTH = s.length();
        int maxLength = 0;
        int beginIndex = 0;
        int endIndex = -1;
        Set<Character> set = new HashSet<>();
        while (beginIndex < LENGTH) {
            if (beginIndex != 0) {
                set.remove(s.charAt(beginIndex - 1));
            }
            while (endIndex + 1 < LENGTH && !set.contains(s.charAt(endIndex + 1))) {
                set.add(s.charAt(++endIndex));
            }
            maxLength = Math.max(maxLength, endIndex - beginIndex + 1);
            beginIndex++;
        }
        return maxLength;
    }
}
