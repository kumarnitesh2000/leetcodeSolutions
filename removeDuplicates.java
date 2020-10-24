import java.util.*;

public class removeDuplicates
{
    
    public static int newArrayLength(int a[]){
        
        return 0;
    }
    
    //assume array to be sorted
    public static List<Integer> removeDuplicates(int a[]){
        int length = a.length;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<length;i++){
            
            if(a[i]==a[i+1]){
                
                int start = i;
                int j = start;
                while(start<length-1){
                    
                    a[j] = a[start+1]; 
                    start+=1;
                    j++;
                }
                length-=1;
            }
            
            
            
        }
        
        for(int k=0;k<length;k++){
            list.add(a[k]);
        }
        
        return list;
        
    }
    //number of duplicate elements
    public static int lengthDuplicates(int a[]){
        int i = 0;
        for(int j=1;j<a.length;j++){
            
            if(a[i]!=a[j]){
                i++;
                a[i] = a[j]; 
            }
            
        }
        return i+1;
        
        
        
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
        List<Integer> removeDuplicatesArray=removeDuplicates(array);
		System.out.println("After Removing Duplicate Elements : ");
		for(int i:removeDuplicatesArray){
		    System.out.print(i+"\t");
		}
		System.out.println("\nNew Array Length is : ");
		int newLength = lengthDuplicates(array);
        System.out.print("\t"+newLength);
        System.out.println("\n");
	}
}
