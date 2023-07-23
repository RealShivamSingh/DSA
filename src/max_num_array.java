class examplesOfArray{
    void max(){
        int [] mx={7,2,3,4,5,9};
        int ans=0;
        for(int i=0;i<mx.length;i++){
            if(mx[i]>ans){
                ans=mx[i];
            }
        }
        System.out.println("maximum  number is"+ans);
    }
}
public class max_num_array {
    public static void main(String[] args) {
        examplesOfArray obj=new examplesOfArray();
        obj.max();

    }
}
