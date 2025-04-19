import java.util.ArrayList;
import javax.swing.plaf.synth.SynthListUI;

public class ArrayList1{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(45);
        list.add(0);
        list.add(554);
        list.set(2,33);
        System.out.println(list.contains(45));
        System.out.println(list.contains(109));

        System.out.println(list);

        list.remove(3);
        System.out.println(list);

    }
    
}