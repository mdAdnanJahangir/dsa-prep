package arrays;

public class MoveZerosToEnd {


    class Solution {

        static void brute (int [] arr){
            int[] temp = new int[arr.length];
            int k=0;
            for(int i =0;  i < arr.length;i++){
                if(arr[i] != 0){
                    temp[k] = arr[i];
                    k++;
                }
            }

            for(int i = 0;i<arr.length;i++){
                arr[i]=temp[i];
            }




        }

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        Solution.brute(arr);


        for(int i :arr){
            System.out.println(i);

        }

    }
}
