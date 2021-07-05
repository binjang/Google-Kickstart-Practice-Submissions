import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        int i = 0, j = 0, t = 0, n = 0, k = 0, p = 0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        
        for (i=1; i<=t; ++i) {
            n= sc.nextInt();
            k= sc.nextInt();
            p= sc.nextInt();
            
            int [][] stacks = new int[n+1][k+1];
            int [][] dp = new int[n+1][p+1];
            for (j = 1; j < n + 1; j++){
                
                for (int l = 1; l < k + 1; l++){
                    stacks[j][l] = sc.nextInt() + stacks[j][l - 1];
                }
                for (int P = 1; P <= p; P++){
                    for(int l = 0; l <= Math.min(k, P); l++){
                        dp[j][P] = Math.max(dp[j][P], dp [j-1][P-l] + stacks[j][l]);
                    }
                }    
            }
            System.out.println("Case #" + i + ": " + dp[n][p]);
        }
    }
}
