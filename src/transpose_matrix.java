import java.util.Scanner;

public class transpose_matrix {
    static void printMatrix(int [][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    static int [][] transposeMatrix(int [][] matrix,int r,int c){
        int [][] ans =new int[c][r];// Because in resultant the row and column will be interchange
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of row");
        int r=sc.nextInt();
        System.out.println("Enter size of column");
        int c= sc.nextInt();
        int [][] matrix=new int[r][c];
        int totalElement=c*r;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("Transpose of matrix");
        int [][] kuchhBhi=transposeMatrix(matrix,r,c);
        printMatrix(kuchhBhi);
    }
}
