package Medium;

import java.util.Arrays;

public class H_Index_274 {
    public static void main(String[] args) {
        int[] citations = {7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0, len = citations.length;
        for (int i = len - 1; i >= 0; i--) {    // we traverse the array is desc order
            if (citations[i] > h)               // and we check if we can increase the value of h by 1
                h++;
            else break;
        }
        return h;
    }
}

/* without sorting, using extra space
public static int hIndex(int[] citations) {
    int n = citations.length;
    int[] counts = new int[n + 1]; // extra space to count papers with specific citation counts

    // Count papers by citation number (capped at n)
    for (int citation : citations) {
        counts[Math.min(citation, n)]++;
    }

    // Start from the max possible h-index (n) and work backwards
    int papers = 0;
    for (int i = n; i >= 0; i--) {
        papers += counts[i];
        if (papers >= i) {
            return i;
        }
    }

    return 0; // Default case, though we should never reach here
}*/