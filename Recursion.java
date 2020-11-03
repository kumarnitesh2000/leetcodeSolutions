import java.util.*;



public class Recursion {
    /*
        You are climbing a stair case. It takes n steps to reach to the top.
        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    */
    public List<List<Integer>> permutation(int[] nums,int k,List<List<Integer>> result){


        for(int i=k;i<nums.length;i++){

            //swap

            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;

            //permute

            permutation(nums, k+1,result);

            //swap

            temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;

        }
        if(k==nums.length-1){
            List<Integer> arr = new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++){
                    arr.add(nums[i]);
            }
            result.add(arr);
        }
        return result;

    } 
    public List<List<Integer>> permute(int[] nums){

        return permutation(nums, 0,new ArrayList<List<Integer>>());

    }

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
