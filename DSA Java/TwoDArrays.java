import java.util.*;


public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        //input
        //rows
        for (int i = 0; i < rows; i++) {
            // cols
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                
            }
        }
        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
            
        }
    }
}
