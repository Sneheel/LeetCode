package Easy;

import java.util.Arrays;

public class Remove_Element_27 {

    public static void main(String[] args) {
        int[] nums = {4,2,0,2,2,1,4,4,1,4,3,2};
        int val = 4;
        System.out.println("k = " + removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

//We are using k to store the index where non-val values can be placed.