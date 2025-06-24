package Q3;//Write a program to count number of occurrences of a word in a file. The file name and word should be supplied through commandline.

import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String filename = args[0];
        String word = args[1];

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter absolute/relative path to the file name:");
//        String filename = sc.nextLine();
//        System.out.print("Enter word to find:");
//        String word = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int count = 0;
            while((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String s : words) {
                    if (s.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Can't open/read file");
        }
        catch (Exception e) {
            System.out.println("Exception caught:" + e.getMessage());
        }
    }
}
