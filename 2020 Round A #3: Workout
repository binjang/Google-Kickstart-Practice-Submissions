import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 1; i < t + 1; i++) {
            int N= sc.nextInt();
            int K= sc.nextInt();
            int[] diff = new int[N-1];
            int prev = sc.nextInt();
            int high = 0;
            
            for (int j = 0; j < N - 1; j++){
                int curr = sc.nextInt();
                diff[j] = curr - prev;
                prev = curr;
                high = Math.max(high, diff[j]);
            }
            
            int low = 1;
            int mid = (high + low) / 2;
            while(high > low){
                int cnt = 0;
                for (int j = 0; j < N - 1; j++){
                    cnt += Math.max((diff[j] - 1) / mid, 0);
                }
                if (cnt > K) {
                    low = mid + 1;
                    
                } else high = mid;
                mid = (high + low) / 2;
                
            }
            System.out.println("Case #" + i + ": " + low);
        }
    }
}
