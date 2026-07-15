// Minimum Coverage Window
import java.util.*;

class Solution {

    public String minWindowSubstring(String s, String t) {

        if (s.length() == 0 || t.length() == 0)
            return "";

        Map<Character, Integer> need = new HashMap<>();

        for (char ch : t.toCharArray())
            need.put(ch, need.getOrDefault(ch, 0) + 1);

        Map<Character, Integer> window = new HashMap<>();

        int required = need.size();
        int formed = 0;

        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for (int end = 0; end < s.length(); end++) {

            char ch = s.charAt(end);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) &&
                window.get(ch).intValue() == need.get(ch).intValue())
                formed++;

            while (formed == required) {

                if (end - start + 1 < minLen) {

                    minLen = end - start + 1;
                    minStart = start;
                }

                char leftChar = s.charAt(start);

                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar))
                    formed--;

                start++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(minStart, minStart + minLen);
    }
}