import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int rows = 0 , cols = 0 ,sum = 0;
        System.out.println("Enter no of rows");
        rows = sc.nextInt();
        System.out.println("Enter no of columns");
        cols = sc.nextInt();
        int [][] matrix = new int [rows][cols];
        int transpose [][] = new int [rows][cols];

        if(rows!=cols){
            System.err.println("Sorry! only Square matrix is allowed");

        }else{
            System.out.println("Enter the elements of matrix");
            for(int i = 0; i<rows ; i++){
                for (int j = 0 ; j<cols ; j++){
                    matrix[i][j] = sc.nextInt();
                }

            }

            System.out.println("The given matrix is:");
            for(int i = 0; i < rows ; i++){
                for (int j = 0 ; j < cols ; j++){
                    System.out.println(matrix[i][j]);
                }
                System.out.println("\n");

            }


            for(int i = 0 ; i<rows ; i++){
                for(int j = 0 ; j<cols ; j++){
                    transpose[j][i] = matrix[i][j];
                    
                    if(i == j){
                        sum = sum+matrix[i][j];
                    }
                }
            }

            System.out.println("Trace of given matrix:"+sum);
            System.out.println("Transpose:");
            for(int i = 0;  i<rows ; i++){
                for(int j = 0 ; j<cols ; j++){
                    System.out.println(transpose[i][j]);
                }
                System.out.println("\n");
            }

        }
       

    }
}
