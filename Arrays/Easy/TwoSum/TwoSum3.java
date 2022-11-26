package Arrays.TwoSum;
import java.util.*;

//! Time Complexity O(n)
//? Space Complexity O(n)

public class TwoSum3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = twoSum(arr,target);
        for(int i : res)
            System.out.print(i + " ");
        sc.close();
    }    
    public static int[] twoSum(int[] arr, int target) {
      
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        
        return null;
    }
}
