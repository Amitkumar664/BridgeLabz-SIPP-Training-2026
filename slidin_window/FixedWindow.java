// Server CPU Spike Detection
class Solution {

    public int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int start = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int end = 0; end < cpuLoad.length; end++) {

            windowSum += cpuLoad[end];

            if (end >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= cpuLoad[start];

                start++;
            }
        }

        return maxSum;
    }
}