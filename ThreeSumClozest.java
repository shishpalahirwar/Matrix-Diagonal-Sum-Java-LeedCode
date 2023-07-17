import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in ascending order
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closestSum with the sum of the first three numbers

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Pointer for the element to the right of nums[i]
            int right = nums.length - 1; // Pointer for the last element in the array

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Calculate the current sum

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum; // Update closestSum if the current sum is closer to the target
                }

                if (sum < target) {
                    left++; // Move the left pointer to the right
                } else if (sum > target) {
                    right--; // Move the right pointer to the left
                } else {
                    return sum; // Return early if the target is achieved
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int closestSum = threeSumClosest(nums, target);
        System.out.println("Closest Sum: " + closestSum);
    }
}
