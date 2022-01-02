import java.util.*;

public class SearchingTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rows:");

        int rows = sc.nextInt();
        System.out.println("Cols:");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        //input
        System.out.println("Enter Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();
                 
            }
            
        }
        System.out.println("Find a no: ");

        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //compare with x

                if (matrix[i][j] == x) {
                    System.out.println("no. is at ("+i+","+j+")");
                    
                }
                 
            }
            
        }


    }
}
