import java.util.*;

public class Twosum {
    public  static int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }

    public static int[] twoSum(int[] nums,int target){

        int[] arr = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(var i=0;i<nums.length;i++){
                    if(mp.containsKey(target-nums[i])){
                        arr[0] = i;arr[1] = mp.get(target-nums[i]); 
                        return arr;

                    }
                    mp.put(nums[i],i);
                
        }
        return arr;

    }
    public static List<List<Integer>> threeSum(int[] nums,int target){

        Set<List<Integer>> ansSet = new HashSet<>();
        
        //algo here
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
                int low=i+1;int high = nums.length-1;
                while(low<high){
                    int sum = nums[i] + nums[low] + nums[high] ;
                    if(sum==target){
                        ansSet.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
                    }
                    else if(sum<target){
                        low++;
                    }
                    else{
                        high--;
                    }
                }

        }
        return new ArrayList<>(ansSet);

        

    }
    public static void printArray(int[] output) {
        System.out.println("Output is \n");
        for(int o : output){
            System.out.print(o+"\t");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        //number of element in array
        System.out.println("Enter the No. of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new int[n];
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int[] output = twoSum(array, target);
        printArray(output);
        System.out.println("Total SubArrays with sum , "+target);
        int result = subarraySum(array,target);  System.out.println(result);
        System.out.println("SubArrays with Sum "+target);
        List<List<Integer>> list = threeSum(array, target);
        System.out.println(list);

    }
}
