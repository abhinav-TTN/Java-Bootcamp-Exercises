//Q1) Write Java code to define List. Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1  {
    public static void main(String[] args) {
        float sum = 0.0f;
        List<Float> list = new ArrayList<>(5);
        list.add(5.98f);
        list.add(23.87f);
        list.add(232.0f);
        list.add(165.5f);
        list.add(98.0f);

        Iterator<Float> itr = list.iterator();

        while(itr.hasNext()) {
            sum += itr.next();
        }

        System.out.println("Sum = " + sum);
    }
}


