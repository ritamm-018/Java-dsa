//Q. Find the number of elements having even number of digits.

import java.util.*;

public class EvenDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("Enter the array: ");

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            int numDigits = Integer.toString(Math.abs(arr[i])).length();
            if(numDigits % 2 == 0){
                System.out.println(arr[i] + " has even number of digits.");
            }
        }

    
    }
}