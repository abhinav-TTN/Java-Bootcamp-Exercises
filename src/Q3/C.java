package Q3;

public class C implements A,B{

    @Override
    public void show() {
        // We need to override the show() method since it is present in both A and B interfaces.
        A.super.show();
    }
}
