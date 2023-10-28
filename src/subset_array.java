public class subset_array {
    static void subsetArray(int []a1,int []b2,int n,int m){
        int cout=0;
        for (int i=0;i<n;i++){
            for (int j=0;j< m;j++){
                if (i==b2[j]){
                     cout=i;
                    break;
                }
                if(j==m){
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a1[]={11,7,1,13,21,3,7,3};
        int b2[]={11,3,7,1,7};
        int n= a1.length;
        int m= b2.length;
        subsetArray(a1,b2,n,m);
    }

}
