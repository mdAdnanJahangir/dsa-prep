package stack;

import java.util.Stack;

public class Pse {


    private static int[] PSE(int[] arr) {
        int[] list = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length ; i++) {

            while( !st.isEmpty() && st.peek() >= arr[i]  ){
                st.pop();
            }

            if(st.isEmpty()){
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

        int[] nge = PSE(arr);
        for (int i : nge){
            System.out.print(" "+ i);
        }


    }


}
