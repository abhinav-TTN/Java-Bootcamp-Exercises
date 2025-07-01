//Q4) Use a Sealed class  concept to create a class hierarchy

package Q4;

public class Main {

    public static void main(String[] args) {
        Ecommerce userData = new UserData();
        Ecommerce orderData = new OrderData();
        Ecommerce paymentData = new PaymentData();

        System.out.println(userData.process());
        System.out.println(orderData.process());
        System.out.println(paymentData.process());
    }
}