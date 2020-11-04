class Solution {
    public int trap(int[] height) {
        int res = 0;
        int lo = 0;
        int hi = height.length-1;
        int left_max = 0;
        int right_max = 0 ;
        while(lo<=hi){
            
            if(height[lo] < height[hi]){

                if(height[lo] > left_max){
                    left_max = height[lo];

                }
                else{

                    res+=left_max-height[lo];

                }
                lo++;

                
            }
            else{

                if(height[hi]>right_max){
                    right_max = height[hi];

                }
                else{

                    res+=right_max-height[hi];
                }
                hi--;

            }
            
        }
    return res;    
    }
}