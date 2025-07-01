package Q5;

public sealed class UserData implements Ecommerce permits UserAddress{
    @Override
    public String process() {
        return "Processing user data.";
    }
}
