class student{
    int rollNumber;
    String subject;
}
public class Main {
    public static void main(String[] args) {
        student obj1=new student();
       obj1.rollNumber=851;
       obj1.subject="Math";
        System.out.println(obj1.rollNumber);
        System.out.println(obj1.subject);
        student obj2=new student();
        obj2.rollNumber=961;
        obj2.subject="Hindi";
        System.out.println(obj2.rollNumber);
        System.out.println(obj2.subject);


    }

}