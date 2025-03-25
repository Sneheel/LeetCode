package Medium;

import java.util.Arrays;

public class Rotate_Array_189 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[(i + k) % length] = nums[i];
        }
        System.arraycopy(arr, 0, nums, 0, length);
    }
}

/* Solution 2 - two groups before k and after k
public void rotate(int[] nums, int k) {
    k = k % nums.length;
    if (k != 0) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums, nums.length - k, temp, 0, k);
        System.arraycopy(nums, 0, temp, k, nums.length - k);
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}*/

/*Solution 3 - we use 3 reverse operations
public void rotate(int[] nums, int k) {
    k %= nums.length;

    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}

private void reverse(int[] nums, int left, int right) {
    while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }
} */
