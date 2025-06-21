public class Q7 {
    public static void main(String[] args) {
        int[] arr = {12,54,88,21};

        try {
            System.out.println(arr[3]/0);
            System.out.println(arr[7]);
        }
        catch (ArithmeticException e) {
            System.out.println("Error in solving arithmetic expression. " + e.getMessage());
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Array being accessed out of bounds. " + e.getMessage());
        }
        finally {
            System.out.println("Program has been closed.");
        }

    }
}
