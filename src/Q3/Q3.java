//Q3) Implement multiple inheritance with default method inside interface.
package Q3;

// Driver class that creates object of C and calls show() method
public class Q3 {

    // We have two interfaces A and B each with a show() method.
    // C implements both the interfaces and since there is an ambiguity then C has to override the show() method and call the method from the interface it wants to.
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}