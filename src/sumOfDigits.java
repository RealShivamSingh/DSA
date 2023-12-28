public class sumOfDigits {
    static int sumOfDigits(int n){
        //Base Case
        if (n>=0 && n<=9) return n;
        return sumOfDigits(n/10)+n%10;

    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
