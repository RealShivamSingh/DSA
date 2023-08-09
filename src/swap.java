public class swap {
    static void elementSwap(int a,int b){
        System.out.println("Before swap a:-"+a);
        System.out.println("Before swap b:-"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap a:"+a);
        System.out.println("After swap b:"+b);
    }

    public static void main(String[] args) {
        int a=3;
        int b=9;
        int [] arr={1,2,3,4,5};
        elementSwap(a,b);
    }
}
