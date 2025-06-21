import java.util.Scanner;

// Q4) Create a two-dimensional array of integers and display: 1. sum of all elements of each column 2. sum of all elements of each row.
public class Q4 {
    public static void main(String[] args) {
        // User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        Find Sum of elements in each row
        int sum =0;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                sum += arr[i][j];
            }
            System.out.printf("Sum of row%d is: %d\n",i,sum);
            sum=0;
        }

//        Find sum of elements in each column
        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                sum += arr[j][i];
            }
            System.out.printf("Sum of column%d is: %d\n",i,sum);
            sum=0;
        }
    }
}
