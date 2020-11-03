import java.util.*;



public class Recursion {
    /*
        You are climbing a stair case. It takes n steps to reach to the top.
        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    */
    
    public static int recursiveSol(int n){
        
        if(n<=1)return n;
        return recursiveSol(n-1)+recursiveSol(n-2);
    }
    public static int dpApproach(int n){
        int[] fib = new int[n+1];fib[0] = 0;fib[1] =1;
        if(n<=1){
            return n;
        }
        for(int i=2;i<=n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];

    }
    public static int climbStairs(int n){   
        //return recursiveSol(n+1);
        return dpApproach(n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Steps : ");
        System.out.println("Total No. of Ways to climb stairs "+climbStairs(sc.nextInt()));
    }
}
