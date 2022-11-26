package Arrays.TwoSum;
import java.util.*;


//! Time Complexity O(nlogn)
//? Space Complexity O(n)

public class TwoSum2{
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
    public static int[] twoSum(int[] nums, int target) {
      
        Pair[] p = new Pair[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            Pair x = new Pair(nums[i], i);
            p[i] = x;
         }
        
        sort(p, p.length);
        
        int start = 0;
        int end = nums.length-1;
        
        while(start < end){
            if(p[start].a + p[end].a < target)
                start++;
            else if(p[start].a + p[end].a > target)
                end--;
            else
                return new int[] {p[start].b, p[end].b};
        }
        return null;
    }
    public static void sort(Pair[] p, int n){
        Arrays.sort(p, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2)
            {
                return p1.a - p2.a; 
            }
        });
    }
}
class Pair{
    int a;
    int b;
    
    public Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
}