import java.util.*;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of customers: ");
        int m = sc.nextInt();

        System.out.println("Enter the number of banks: ");
        int n = sc.nextInt();

        System.out.println("Enter the wealth of each bank for each customer: ");
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxWealth = 0;

        for (int i = 0; i < m; i++) {
            int customerWealth = 0;
            for (int j = 0; j < n; j++) {
                customerWealth += arr[i][j];
            }

            // Update maxWealth using a simple comparison
            if (customerWealth > maxWealth) {
                maxWealth = customerWealth;
            }
        }

        System.out.println("The maximum wealth of a customer is: " + maxWealth);
    }
}
