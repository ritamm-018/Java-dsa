import java.util.*;
import java.util.ArrayList;


public class ArrayListInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the array list: ");
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());

        }

        for(int i = 0; i < 5; i++){
            System.out.print(list.get(i) + " ");
        }

        

        
    }
}
