import java.util.*;

public class FirstAndLastPosition{
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

        int first = SearchFirst(arr, target);
        int last = SearchLast(arr, target);

        if(first == -1 && last == -1){
            System.out.println("[-1,-1]");
        }

        else{
            int[] answer = {first, last};
            System.out.println(Arrays.toString(answer));
        }


    }

    public static int SearchFirst(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            

            if(target == arr[mid]){
                ans = mid;
                end = mid - 1;


            }

            else if(target > arr[mid]){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }

        }

        return ans;

    }

    public static int SearchLast(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                ans = mid;
                start = mid + 1;
            }

            else if(target > arr[mid]){
                start = mid + 1;
            }

            else{
                end = mid - 1;

            }
            

        }
        return ans;


    }
}