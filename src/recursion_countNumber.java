public class recursion_countNumber {
    static int countDigit(int n){
        //Base case
        if (n>=0 && n<=9){
            return 1;
        }
        return 1+countDigit(n/10);
    }

    public static void main(String[] args) {
        int n=58974;
        System.out.println(countDigit(n));
    }
}
