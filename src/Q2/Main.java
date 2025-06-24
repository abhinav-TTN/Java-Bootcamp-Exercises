package Q2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);
             BufferedWriter bw = new BufferedWriter(new FileWriter("./src/Q2/users.txt"))
        ) {
            while(true) {
                System.out.println("Enter first name:");
                String firstName = sc.next();
                System.out.println("Enter last name:");
                String lastName = sc.next();
                System.out.println("Enter age:");
                int age = sc.nextInt();
                System.out.println("Enter phone number:");
                long phoneNumber = sc.nextLong();

                User user = new User(firstName, lastName, age, phoneNumber);
                bw.write(user.toString());

                System.out.println("Do you want to continue creating users? (Type YES to continue, QUIT to exit)");
                String choice = sc.next();
                if(choice.equals("QUIT")) break;
                else if (choice.equals("YES")){
                    continue;
                }
                else break;
            }
        } catch (IOException e) {
            System.out.println("Error when opening/writing file: " + e.getMessage());
        }

    }
}
