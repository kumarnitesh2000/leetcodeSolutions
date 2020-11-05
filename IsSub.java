public class IsSub {
    public static boolean isSubsequence(String s, String t) {
        int count = 0;
        int current = 0 ; 
        for(int i=0;i<s.length();i++){
            
            int total = t.length()-current;
            int c=0;
            boolean isBreak = false;
            for(int j=current;j<t.length();j++){
                
                if(s.charAt(i)==t.charAt(j)){
                    current = j+1;
                    count+=1;
                    isBreak = true;
                    break;
                }
                else{
                    c+=1;
                }
                
                
            }
            //check
            if(total!=c && isBreak==false)
                count+=1;
            }
        
        
        if(count==s.length()){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        
        System.out.println(isSubsequence("axc", "ahbgdc"));

    }
}
