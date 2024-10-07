y
import java.util.*;
class Duplicate {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {0, 1, 1, 3, 10, 15, 15};
        
        
        int newLength = removeDuplicates(arr);
        
      
        System.out.println(Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
    
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;  
        
        int uniqueIndex = 0;  
        
      
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];  
            }
        }
        
        return uniqueIndex + 1;  
    }
}
