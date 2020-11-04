class SolutionFinal {
       
    public static int binarySearch(int[] nums, int start ,int end,int find){

    int pos = -1;
    int lo = start;int high = end ;
    int  m = (lo+high)/2;
    while(lo<=high){

        if(find==nums[m]){
            return m;
        }
        else{
            if(find > nums[m]){
                lo = m+1;
            } 
            else{
                high = m-1;

            }
        }
        m = (lo+high)/2;

    }
    return pos;

}


public static int linearSearch(int[] nums, int target){
    for(int i=0;i<nums.length;i++){

        if(target==nums[i]){
            return i;
        }

    }
    return -1;
}


  public static int search(int[] nums, int target) {
   
    int pos = -1;
    //first we have to search the pivot element 
    int lo = 0; int hi = nums.length-1;
    int mid = (lo+hi)/2;
    while(lo<=hi){
        try{
            if(nums[mid+1] < nums[mid] ){
            
                break;
            }
              
        else{
            if( nums[lo] >  nums[mid] ){
                hi = mid - 1;
            }
            else{
              lo = mid +1;
            }   
}
        }catch (Exception e) {
            return linearSearch(nums,target);
        }
     
        
        mid = (lo+hi) /  2 ;
        
    }

    //pivot element is mid
    int pivot = nums[mid+1];
    if(target >= pivot && target <= nums[nums.length-1]){
        pos = binarySearch(nums, mid+1, nums.length-1, target);
    }
    
    else{
        pos = binarySearch(nums, 0, mid, target);
    }
    
   

return pos;    
    
}

}