import java.util.*;

public class MaximumValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your array : ");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        

        int max = arr[0];

        for(int i = 0; i < size; i++){
            if(arr[i] > max){
                max = arr[i];

            }
        }

        System.out.println("The maximum element is: " + max);

    }
}