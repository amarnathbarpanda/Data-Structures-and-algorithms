package Arrays.MoveZeros;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        move(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    //! Time Complexity = O(n);
    //! space Complexity = O(1);

    public static void move(int[] arr){
        int i = 0;
        int j = 0; 

        while(j < arr.length){
            if(arr[j] != 0){
                swap(arr, i, j);
                i++;
                j++;
            }else{
                j++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
