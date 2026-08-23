package arrays;

public class LinearSearch {


    public static void main(String[] args) {
        int [] arr ={2,3,1,44,5};
        int target = 5;
       int  ans = linear(arr,target);
        System.out.println(ans);
    }

    static  int  linear(int [] brr,int T){
        for (int i = 0; i < brr.length; i++) {
            if(brr[i]==T){
                return i ;
            }
        }
        return  -1 ;
    }

}
