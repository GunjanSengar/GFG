class Solution {

    public double medianOf2(int[] a, int[] b) {

        if (a.length > b.length)
            return medianOf2(b, a);

        int n1 = a.length;
        int n2 = b.length;

        int left = 0;
        int right = n1;

        while (left <= right) {

            int cut1 = (left + right) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : a[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : b[cut2 - 1];

            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : a[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : b[cut2];

            if (l1 <= r2 && l2 <= r1) {

                if ((n1 + n2) % 2 == 0) {

                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;

                } else {

                    return Math.max(l1, l2);
                }

            }

            else if (l1 > r2) {

                right = cut1 - 1;

            } else {

                left = cut1 + 1;
            }
        }

        return 0;
    }
}