package Recursion;

public class PrintArray {

    static void f (int [] arr ,int idx){
        if(idx>= arr.length) return ;

        System.out.println(arr[idx]);
        f(arr,idx+1);
        //System.out.println(arr[idx]);

    }


    public static void main(String[] args) {
        int [] arr = {2,22,1,3,4,5};
        int idx = 0;

        f(arr,idx);
    }
}
