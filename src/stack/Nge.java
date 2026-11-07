package stack;
import java.util.Stack;

public class Nge {

    public static  int[] NGE(int [] arr){
        int n = arr.length ;
        int[] list = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n-1; i>=0 ; i --){

            while(  !st.isEmpty()   &&   st.peek() <= arr[i] ){
                st.pop();
            }

            if(st.isEmpty()) {
                list[i] = -1;
            }else{
                list[i] = st.peek();
            }

            st.push(arr[i]);

       }



        return list;
    }


    public static void main(String[] args) {

        int [] arr = {4,12,5,3,1,2,5,3,1,2,4,6};

        int[] nge = NGE(arr);
        for (int i : nge){
            System.out.print(" "+ i);
        }

    }
}
