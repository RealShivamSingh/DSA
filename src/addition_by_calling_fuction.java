import java.util.Scanner;

class Math{
    int add(int a,int b){
        int ans=a+b;
        return ans;
    }
}
public class addition_by_calling_fuction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of input number is:-");
        Math obj1 = new Math();
        int ans=obj1.add(a,b);
        System.out.println(ans);

    }
}
