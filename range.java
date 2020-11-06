public class range {
    public static boolean isPalindrome(int x) {
        
        
        
        int num = x;
        int num2 = x;
        int check = 0;
        int tot = 0;
        while(num2 > 0){
            tot++;
            num2 = num2/10;
        }
        tot--;
        while(num > 0){ 
            check += (num%10)*Math.pow(10,tot);
            tot--;
            num/=10;
            
        }
       
        if(x==check && x!=Integer.MAX_VALUE){
            return true;
        }
        return false;
        
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(2147483647));
    }
}
