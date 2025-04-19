import java.util.*;

public class MinimumNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the array: ");
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for(int i = 0; i < size; i++){
            if(arr[i] < min){
                System.out.println(arr[i] + " is the minimum number in the array.");
            }

        }
    }
}