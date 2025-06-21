//Q2) Write a program to read user input until user writes XDONE and then show the entered text by the user on command line
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your input (Type 'XDONE' to stop):");
        while (true){
            String st = sc.nextLine();
            if (st.equals("XDONE")){
                break;
            }
            sb.append(st).append("\n");
        }

        System.out.println("Your input:");
        System.out.println(sb);
    }
}
