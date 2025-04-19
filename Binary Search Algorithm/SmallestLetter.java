import java.util.*;

public class SmallestLetter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("Enter the array: ");
        char[] alphabets = new char[size];
        for(int i = 0; i < size; i++){
            alphabets[i] = sc.next().charAt(0);

        }

        System.out.println("Enter the target: ");
        char target = sc.next().charAt(0);

        System.out.println(SmallestLetter(alphabets, target));
    }

    public static char SmallestLetter(char[] alphabets, char target){
        int start = 0;
        int end = alphabets.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < alphabets[mid]){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }

        return alphabets[start % alphabets.length];
       
    }
}