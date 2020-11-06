public class median_2_Sorted {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //note that num1 should be small and num2 should be big
        if(nums1.length> nums2.length){

            return findMedianSortedArrays(nums2, nums1);

        }
        //nums1 is small array
        int x = nums1.length;int y = nums2.length;
        int low = 0; int high = x;
        while(low<=high){
            int partX = (low+high)/2;int partY = (x+y+1)/2  - partX;
            int max_left_x = (partX==0) ? (Integer.MIN_VALUE) : (nums1[partX-1]);
            int min_right_x = (partX==x) ? (Integer.MAX_VALUE) : (nums1[partX]);
            int max_left_y = (partY==0) ? (Integer.MIN_VALUE) : (nums2[partY-1]);;
            int min_right_y = (partY==y) ? (Integer.MAX_VALUE) : (nums2[partY]);
            if(max_left_x<=min_right_y && max_left_y <= min_right_x){

                 
                if((x+y)%2!=0){
                    return ((double) Math.max(max_left_x,max_left_y));
                }
            
                else{
                    return ((double) (Math.max(max_left_x,max_left_y) + Math.min(min_right_x, min_right_y))/2);
                }

            }
            //then we are to far so reduce high
            else if(max_left_x>min_right_y){
                high = partX-1;
            }
            else{
                low = partX+1;
            }

        }

        return 0;
        
    }
    public static void main(String[] args) {
        int[] arr1 = {2};int[] arr2 = {};
        System.out.println(findMedianSortedArrays(arr1, arr2));


    }
}
