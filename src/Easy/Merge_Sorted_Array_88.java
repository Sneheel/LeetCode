package Easy;

import java.util.Arrays;

public class Merge_Sorted_Array_88 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeArr = new int[m + n];
        int i = 0, j = 0, k = 0;
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        } else if (n != 0) {
            while (i < m && j < n) {
                if (nums1[i] <= nums2[j]) {
                    mergeArr[k++] = nums1[i++];
                } else if (nums2[j] < nums1[i]) {
                    mergeArr[k++] = nums2[j++];
                }
            }
            if (i != m) {
                System.arraycopy(nums1, i, mergeArr, k, m - i);
            }
            if (j != n) {
                System.arraycopy(nums2, j, mergeArr, k, n - j);
            }
            System.arraycopy(mergeArr, 0, nums1, 0, m + n);
        }
    }
}

/* Optimal Solution - iterate from the end
public void merge(int[] nums1, int m, int[] nums2, int n) {
    int midx = m - 1;
    int nidx = n - 1;
    int right = m + n - 1;

    while (nidx >= 0) {
        if (midx >= 0 && nums1[midx] > nums2[nidx]) {
            nums1[right] = nums1[midx];
            midx--;
        } else {
            nums1[right] = nums2[nidx];
            nidx--;
        }
        right--;
    }
}*/
