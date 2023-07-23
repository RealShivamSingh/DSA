class exampleArray{
    void additionOfArray(){
        int [] add={7,8,9,5,6};
        int sum=0;
        for (int i=0;i<5;i++){
            sum+=add[i];

        }
        System.out.println(sum);
    }
}
public class addition_in_array {
    public static void main(String[] args) {
        exampleArray obj=new exampleArray();
        obj.additionOfArray();

    }
}
