class Solution {
    public double squareRoot(int n, int p) {

        int left = 0;
        int right = n;
        int result = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= n) {
                result = mid;
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        double ans = result;
        double factor = 0.1;

        for (int i = 0; i < p; i++) {

            for (int j = 0; j < 10; j++) {

                double next = ans + factor;

                if (next * next <= n) {
                    ans = next;
                } 
                else {
                    break;
                }
            }

            factor = factor / 10;
        }

        return ans;
    }
}