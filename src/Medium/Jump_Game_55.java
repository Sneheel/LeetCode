package Medium;

public class Jump_Game_55 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int i = 1, l = nums.length, r = nums[0];
        while (i <= r && r < l) {
            if ((i + nums[i]) > r) {
                r = i + nums[i];
            }
            i++;
        }
        return r >= l - 1;
    }
}

/* The idea is to use a "goal" that starts at the last index and moves backward whenever a preceding index can reach or surpass it.
If we can move the goal to the first index, the last index is reachable.

public boolean canJump(int[] nums) {
    int goal = nums.length - 1;

    for (int i = nums.length - 2; i >= 0; i--) {
        if (i + nums[i] >= goal) {
            goal = i;
        }
    }

    return goal == 0;
}*/
