package Q5;

public sealed interface Ecommerce permits UserData, OrderData, PaymentData {
    String process();
}
