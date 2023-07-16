class Algebra{
    int a; int b;
    Algebra(int x,int y){
        System.out.println("Calling constructor");
        a=x;
        b=y;

    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
    }

}
public class constructer {
    public static void main(String[] args) {
        Algebra obj1=new Algebra(10, 11);
        System.out.println(obj1.add());
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());
        System.out.println(obj1.div());
        Algebra obj2=new Algebra(78,96);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        System.out.println(obj2.div());

    }
}
