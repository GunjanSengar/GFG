class Solution {

    public int rowWithMax1s(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        int maxOnes = 0;
        int ans = -1;

        for (int i = 0; i < rows; i++) {

            int left = 0;
            int right = cols - 1;
            int first = cols;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (arr[i][mid] == 1) {
                    first = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            int ones = cols - first;

            if (ones > maxOnes) {
                maxOnes = ones;
                ans = i;
            }
        }

        return ans;
    }
}