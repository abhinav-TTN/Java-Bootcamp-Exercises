package Q1;

public enum House {
    oneBHK(12000), twoBHK(16000), threeBHK(23000);
    final int price;
    House (int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
