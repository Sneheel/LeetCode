package Medium;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array2_80 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k = removeDuplicates(nums);
        System.out.println("k = " + k);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        boolean twice = false;
        for (int i = 1; i < nums.length; i++) {
            if (!twice && nums[i] == nums[i - 1]) {
                nums[k++] = nums[i];
                twice = true;
            } else if (twice && nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
                twice = false;
            } else if (!twice && nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
                twice = false;
            }
        }
        return k;
    }
}

/* Optimal Solution
public int removeDuplicates(int[] nums) {
    int k = 2;

    for (int i = 2; i < nums.length; i++) {
        if (nums[i] != nums[k - 2]) {
            nums[k] = nums[i];
            k++;
        }
    }

    return k;
}*/
