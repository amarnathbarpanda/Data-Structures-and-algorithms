package Arrays.MoveZeros;

import java.util.Scanner;

public class App2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        arr = move(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }


    //! Time  = O(n);
    //! Space = O(n);

    private static int[] move(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0)
                temp[j++] = arr[i];
        }
        return temp;
    }
}
