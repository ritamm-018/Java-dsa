//Q. Check if the integer 10 is present in the range [1, 4] of the array.


public class SearchInRange{
    public static void main(String[] args){
        int[] arr = {12, 41, -5, 31, 10, 26, -17};
        int target = 10;
        System.out.println(Search(arr, target));
    }

    public static boolean Search(int[] arr, int target){
        for(int i = 1; i <= 4; i++ ){
            if(target == arr[i]){
                return true;
            }
        }

        return false;
    }
}