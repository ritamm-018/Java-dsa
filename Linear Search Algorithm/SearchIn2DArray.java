import java.util.*;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 2D array:");

        int[][] arr = new int[3][3];
        
        // Reading the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target:");
        int target = sc.nextInt();

        boolean found = false; // Flag to track if the target is found

        // Searching for the target in the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (target == arr[i][j]) {
                    System.out.println("Yes");
                    found = true;
                    break; // Exit inner loop as target is found
                }
            }
            if (found) {
                break; // Exit outer loop if target is found
            }
        }

        // If the target wasn't found, print "No"
        if (!found) {
            System.out.println("No");
        }
    }
}
