import java.util.Scanner;

public class spiral_matrix {
    static void printMatrix(int [][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static void spiralMatrix(int [][] matrix,int r,int c){

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];
        int total=r*c;
        System.out.println("Enter "+total+" number of elements ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("Spiral Order");
        spiralMatrix(matrix,r,c);
    }
}
