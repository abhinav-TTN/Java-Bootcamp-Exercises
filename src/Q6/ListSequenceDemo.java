//Q6) Demonstrate the use of addFirst(), addLast, removeFirst(), removeLast, getFirst(), getLast(), reversed() in Set and List Sequenced collections.
package Q6;

import java.util.ArrayList;
import java.util.List;

public class ListSequenceDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Original List:");
        System.out.println(list);

        System.out.println("Adding to first:");
        list.addFirst(1);
        System.out.println(list);

        System.out.println("Adding to last:");
        list.addLast(11);
        System.out.println(list);

        System.out.println("Removing first:");
        list.removeFirst();
        System.out.println(list);

        System.out.println("Removing last:");
        list.removeLast();
        System.out.println(list);

        System.out.println("Get first value:");
        System.out.println(list.getFirst());

        System.out.println("Get last value:");
        System.out.println(list.getLast());

        System.out.println("Reverse List:");
        System.out.println(list.reversed());

    }
}