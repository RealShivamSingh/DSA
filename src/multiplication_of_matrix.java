import java.util.Scanner;

public class multiplication_of_matrix {
    static void printMatrixArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1!=r2){
            System.out.println("Miltiplication not possible-worng dimension");
            return;
        }
        int [][] mul=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    /*
                    i=1, j=0
                    mul[i][j]=ith row of a *jth col of b
                     */
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 natrices");
        printMatrixArray(mul);

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
       multiply(a,r1,c1,b,r2,c2);
    }
}
