import java.util.*;

public class SwappingNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your array is : ");

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("Enter the first index to be swapped: ");
        int a = sc.nextInt();

        System.out.println("Enter the second index with which the first index is to be swapped : ");
        int b = sc.nextInt();

        for(int i = 0; i < size; i++){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        System.out.println("After swapping, your array is: ");

        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
 
    }
}