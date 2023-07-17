class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0;
        int high = n;
        int[] perm = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = low;
                low++;
            } else if (s.charAt(i) == 'D') {
                perm[i] = high;
                high--;
            }
        }

        // Set the last element to either low or high
        perm[n] = low;

        return perm;
    }
}
