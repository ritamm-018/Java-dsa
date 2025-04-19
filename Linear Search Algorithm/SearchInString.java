import java.util.*;

public class SearchInString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array: ");
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target : ");

        int target = sc.nextInt();

        for(int i = 0; i < 5; i++){
            if(arr[i] == target){
                System.out.println("Array exists");
            }
        }
    }
}