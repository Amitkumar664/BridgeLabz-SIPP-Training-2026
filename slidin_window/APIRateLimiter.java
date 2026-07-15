// At Most N Distinct
import java.util.*;

class Solution {

    public int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {

        Map<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < keyIds.length; end++) {

            map.put(keyIds[end], map.getOrDefault(keyIds[end], 0) + 1);

            while (map.size() > n) {

                map.put(keyIds[start], map.get(keyIds[start]) - 1);

                if (map.get(keyIds[start]) == 0)
                    map.remove(keyIds[start]);

                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}