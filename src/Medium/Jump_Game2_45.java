package Medium;

public class Jump_Game2_45 {
    public static void main(String[] args) {
        int[] nums = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3}; //expected - 2
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int near = 0, far = 0, jumps = 0;

        while (far < nums.length - 1) {
            int farthest = 0;
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            near = far + 1;
            far = farthest;
            jumps++;
        }

        return jumps;
    }
}

/*
public int jump(int[] nums) {
    int ans = 0;
    int end = 0;
    int farthest = 0;

    // Implicit BFS
    for (int i = 0; i < nums.length - 1; ++i) {
        farthest = Math.max(farthest, i + nums[i]);
        if (farthest >= nums.length - 1) {
            ++ans;
            break;
        }
        if (i == end) {   // Visited all the items on the current level
            ++ans;          // Increment the level
            end = farthest; // Make the queue size for the next level
        }
    }

    return ans;
}*/
