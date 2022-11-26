package Arrays.MergeTwoSortedArr;

import java.util.Scanner;

//? Merge two sorted arr1 and arr2 into arr1;

// ! Time = O(n);
//! Space = O(1);

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m + n];
        int[] arr2 = new int[n];

        for(int i = 0; i < m; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        marge(arr1, m, arr2, n);        

        for (int i : arr1) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    private static void marge(int[] arr1, int m, int[] arr2, int n) {
        int i = m-1;
        int j = n-1;
        int k = arr1.length-1;

        while(i >= 0 && j >= 0){
            if(arr1[i] >= arr2[j]){
                arr1[k] = arr1[i];
                i--;
                k--;
            }else{
                arr1[k] = arr2[j];
                j--;
                k--;
            }
        }

        while(i >= 0){
            arr1[k] = arr1[i];
                i--;
                k--;
        }
        while(j >= 0){
            arr1[k] = arr2[j];
                j--;
                k--;
        }
    }
}
