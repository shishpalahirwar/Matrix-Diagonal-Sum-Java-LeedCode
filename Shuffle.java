class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i]; // Add xi to result
            result[index++] = nums[i + n]; // Add yi to result
        }

        return result;
    }
}