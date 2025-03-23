package Medium;

import java.util.HashMap;

public class Majority_Element_169 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int key = nums[0], value = 1;

        for (int i = 0; i < nums.length; i++) {
            map.computeIfPresent(nums[i], (k, v) -> v + 1);
            map.putIfAbsent(nums[i], 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > value) {
                value = entry.getValue();
                key = entry.getKey();
            }
        }

        return key;
    }
}

/* In single loop
public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> hash = new HashMap<>();
    int res = 0;
    int majority = 0;

    for (int n : nums) {
        hash.put(n, 1 + hash.getOrDefault(n, 0));   //Finds value on basis of key, if not found uses Default value
        if (hash.get(n) > majority) {
            res = n;
            majority = hash.get(n);
        }
    }

    return res;
}*/

/* Boyer-Moore Majority Vote algorithm
public int majorityElement(int[] nums) {
    int res = 0;
    int majority = 0;

    for (int n : nums) {
        if (majority == 0) {
            res = n;
        }

        majority += n == res ? 1 : -1;
    }

    return res;
}*/
