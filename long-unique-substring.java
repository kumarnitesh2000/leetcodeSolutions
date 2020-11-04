class Solution {
    
    public static int lengthOfLongestSubstring(String s) {
        
        int res = 0 ;
    
        for(int i=0;i<s.length();i++){
            boolean[] visited = new boolean[256];
            for(int j=i;j<s.length();j++){
                
                int ascii = (int) s.charAt(j);
                
                if(visited[ascii] == true){
                    break;
                }

                else{
                    res=Math.max(res,j-i+1);
                    visited[ascii] = true;
                }

            }

        visited[(int) s.charAt(i)] = false;    


        }
        return res;



    }
}