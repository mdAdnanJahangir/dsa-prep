
package arrays;

import java.util.Arrays;

public class Secondlargest {

    class Solution{
        static int brute(int [] arr){
            Arrays.sort(arr);
            return arr[arr.length-2];
        }



        static int optimal(int [] arr){
            int max=arr[0];
           // int sec=-1; asuming there is no negative number
            int sec = Integer.MIN_VALUE; // safer as it works for negative also
            for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    sec=max;
                    max=arr[i];

                }else{
                    if(arr[i]>sec && arr[i]!=max )// for dublicates
                        sec=arr[i];
                }

            }
            return sec;


        }
    }


    public static void main(String[] args) {
        int [] arr1 = {2,5,1,3,0};
        int[] arr2 = {8, 10, 5, 7, 9};


        System.out.println("The Largest element in the array is: " + Solution.brute(arr1));
        System.out.println("The Largest element in the array is: " + Solution.brute(arr2));

        System.out.println("The Largest element in the array is: " + Solution.optimal(arr1));
        System.out.println("The Largest element in the array is: " + Solution.optimal(arr2));

    }
}
