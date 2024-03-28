public class bubbleSort {
    static void bubbleSorting(int []a){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a={7,2,9,3,5};
        bubbleSorting(a);
        for (int i:a){
            System.out.println(i+" ");
        }
    }
}
