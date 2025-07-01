//Q4) Use a Sealed class  concept to create a class hierarchy

package Q5;

public class Main {

    public static void main(String[] args) {
        // Object of UserAddress that inherits the sealed class UserData that permits only UserAddress.
        UserAddress userAddress = new UserAddress();

        // processing from OrderData class that is non-sealed and can be inherited by any class in the hierarchy.
        Ecommerce orderData = new OrderData();

        // processing from PaymentData class that is final and cannot be inherited by any class.
        Ecommerce paymentData = new PaymentData();

        System.out.println(userAddress.process()); // inherited form UserData class
        System.out.println(userAddress.processAddress());
        System.out.println(orderData.process());
        System.out.println(paymentData.process());
    }
}