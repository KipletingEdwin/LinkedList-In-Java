import java.util.Iterator;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(98);
        linkedList.add(56);
        linkedList.add(22);

        linkedList.remove();
//        linkedList.clear();


        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.isEmpty());

        for (Integer integer : linkedList) {
            if ((int) integer == 22) {
                System.out.println("We found 22");
            }

        }

    }
}