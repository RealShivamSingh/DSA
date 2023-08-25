import java.util.Scanner;

public class addition_2D_array {
        static void printMatrixArray(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    static void sumOfArray(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Worng Input : Addition not possible");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of matrix 1 and matrix 2 is:");
        printMatrixArray(sum);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and cloumn for matrix 1");
        System.out.println("Enter number of rows ");
        int r1=sc.nextInt();
        System.out.println("Enter number cloumn");
        int c1=sc.nextInt();
        int [][]a=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and cloumn for matrix 2");
        System.out.println("Enter number of rows ");
        int r2=sc.nextInt();
        System.out.println("Enter number cloumn");
        int c2=sc.nextInt();
        int [][] b=new int[r2][c2];
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]= sc.nextInt();
            }
        }
        sumOfArray(a,r1,c1,b,r2,c2);
    }
}


