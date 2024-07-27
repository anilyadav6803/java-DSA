import java.util.*;

public class twoarray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numbers:");

        // Reading input into the 2D array with validation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (sc.hasNextInt()) {
                    matrix[i][j] = sc.nextInt();
                } 
            }
        }
        sc.close();

        // Printing the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
