package stack;

import java.util.Stack;

public class Pge {


    private static int[] pge(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int[] pge = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {

            while(st.peek() <= arr[i] && !st.isEmpty()  ){
                st.pop();
            }

            if(st.isEmpty()){
                pge[i] = -1;
            }else{
                pge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return pge;
    }







    public static void main(String[] args) {

        int [] arr = {4,12,5,3,1,2,5,3,1,2,4,6};

        int[] nge = pge(arr);
        for (int i : nge){
            System.out.print(" "+ i);
        }


    }

}
