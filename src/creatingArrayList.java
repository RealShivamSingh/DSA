import java.sql.SQLOutput;
import java.util.ArrayList;

public class creatingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(56);
        l1.add(89);
        l1.add(20);
        l1.add(10);
        //Printing orignal Array
        System.out.println("Orignal Array");
        System.out.println(l1);

        //Printing from loop
        System.out.println("This printed from help of loop");
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        //Adding element at same index
        System.out.println("After adding element on same index");
        l1.add(2,56);
        System.out.println(l1);

        //Modifing element at index
        System.out.println("Modifing the element at same index");
        l1.set(3,999);
        System.out.println(l1);

        //Removing the element from index
        System.out.println("Removing element form the array");
        l1.remove(2);
        System.out.println(l1);

        //Checking if element is exits or not
        System.out.println("Checking the element is exits of not");
        boolean ans=l1.contains(56);
        System.out.println(ans);
    }
}
