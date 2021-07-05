import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        int i = 0, j = 0, t = 0, n = 0, b = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (i=1; i<=t; ++i) {
            sum = 0;
            n = sc.nextInt();
            b = sc.nextInt();
            int[] arr = new int[n];
            for (j=0; j<n; ++j) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            j = 0;
            while (j < n && sum <= b) {
                sum += arr[j++];
            }
            if (sum > b) {
                --j;
            }
            System.out.println("Case #" + i + ": " + j);
        }
    }
}
