import java.util.*;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); // Input elements
        }

        // Reverse the array
        int start = 0, end = size - 1;
        while (start < end) {
            // Swap elements at 'start' and 'end'
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print the reversed array
        System.out.println("The reversed array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Close the scanner
    }
}
