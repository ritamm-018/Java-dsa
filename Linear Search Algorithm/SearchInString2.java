import java.util.*;

public class SearchInString2{

    public static boolean search(String str, char Target){
        for(int i = 0; i < str.length(); i++){
            if(Target == str.charAt(i)){
                return true;
            }

            
        }

        return false;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("Enter the target: ");
        char Target = sc.next().charAt(0);

        System.out.println(search(str, Target));

    }
}