import java.util.LinkedHashMap;

public class Q7 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        System.out.println("Original Map:");
        System.out.println(map);
        System.out.println();

        // get first entry
        System.out.println("First Entry:");
        System.out.println(map.firstEntry());
        System.out.println();

        // get last entry
        System.out.println("Last Entry:");
        System.out.println(map.lastEntry());
        System.out.println();

        // remove and returns first entry
        System.out.println("Poll First Entry:");
        System.out.println(map.pollFirstEntry());
        System.out.println(map);
        System.out.println();


        // remove and returns last entry
        System.out.println("Poll Last Entry:");
        System.out.println(map.pollLastEntry());
        System.out.println(map);
        System.out.println();

        // add entry at first position
        System.out.println("putFirst:");
        map.putFirst(1,"one");
        System.out.println(map);
        System.out.println();

        // add entry at last position
        System.out.println("putLast:");
        map.putLast(7,"seven");
        System.out.println(map);
        System.out.println();

        // reverse the LinkedHashMap
        System.out.println("Reversed:");
        System.out.println(map.reversed());
        System.out.println();
    }
}
