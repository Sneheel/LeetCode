package Easy;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_26 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int k = removeDuplicates(nums);
        System.out.println("k = " + k);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                temp = nums[i];
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

/*Optimal solution without extra variable
public int removeDuplicates(int[] nums) {
    int k = 1;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[k - 1]) {
            nums[k] = nums[i];
            k++;
        }
    }

    return k;
}*/
