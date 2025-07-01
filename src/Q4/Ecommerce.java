package Q4;

public sealed interface Ecommerce permits UserData, OrderData, PaymentData {
    String process();
}
