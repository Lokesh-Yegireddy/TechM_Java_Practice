
package Arrays;

import java.util.*;

public class rightRotation {
    public static void main(String args[]) {
        System.out.println("Before Rotation");
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter Number Of Rotations");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != 0) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            n--;
        }

        System.out.println("After Rotation");
        System.out.println(Arrays.toString(arr));
    }
}

