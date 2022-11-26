package Arrays.TwoSum;

import java.util.Scanner;

//! Time Complexity O(n^2)
//? Space Complexity O(1)
public class TwoSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = twoSum(arr, target);
        for (int i : res)
            System.out.print(i + " ");
        sc.close();
    }

    public static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[] { i, j };
            }
        }

        return null;
    }
}
