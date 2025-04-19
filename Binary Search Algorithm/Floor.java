import java.util.*;

public class Ceiling{

    public static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        

        while(start <= end){

            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the array: ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        System.out.println(Search(arr, target));

        

    }
}