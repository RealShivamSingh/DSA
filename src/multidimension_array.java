import java.util.Scanner;

public class multidimension_array {
    static void printMatrixArray(int [][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      /* //Another way too print 2D array
        int [][] arr={
                       {4,5,6},
                      {8,9,6},
                      {6,4,5}
                        };
        printMatrixArray(arr);*/


        //User input 2D array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        System.out.println("Enter numbers of column");
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrixArray(matrix);
    }
}
