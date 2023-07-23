class exampleOfArray{
    void searchOfNumber(){
        int [] num={8,9,4,3,6,4};
        int x=6;
        int ans=-1;
        for(int i=0;i< num.length;i++){
            if (x==num[i]){
                ans=i;
            }
        }
        System.out.println("Found" +  x  + "At index" +  ans);
    }
}
public class search_number_array {
    public static void main(String[] args) {
        exampleOfArray obj=new exampleOfArray();
        obj.searchOfNumber();


    }
}
