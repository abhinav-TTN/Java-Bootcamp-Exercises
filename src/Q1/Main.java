package Q1;

public class Main {
    public static void main(String[] args) {

        GreaterInterface greater = (a,b) -> a>b;
        System.out.println("10 greater than 6? "+greater.isGreater(10,6) );

        IncrementInterface incrementInterface = i -> ++i;
        System.out.println("Incrementing 10: "+incrementInterface.increment(10));

        ConcatInterface concatInterface = (s1, s2) -> s1.concat(s2);
        System.out.println("Concatenating 'Hello' and 'World': "+concatInterface.concat("Hello ", "World"));

        ToUpperInterface toUpperInterface = s -> s.toUpperCase();
        System.out.println("Capitalizing 'hEllo': "+toUpperInterface.toUpper("hEllo"));
    }
}
