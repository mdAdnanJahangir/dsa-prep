package arrays;

import java.util.Arrays;

public class Findmax {

    class Solution{
        static int brute(int [] arr){
            Arrays.sort(arr);
            return arr[arr.length-1];
        }


        static int optimal(int [] arr){
            int max = arr[0];
            for(int i =1;i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            return max;


        }
    }


    public static void main(String[] args) {
        int [] arr1 = {2,5,1,3,0};
        int[] arr2 = {8, 13, 5, 7, 9};


        System.out.println("The Largest element in the array is: " + Solution.brute(arr1));
        System.out.println("The Largest element in the array is: " + Solution.brute(arr2));

        System.out.println("The Largest element in the array is: " + Solution.optimal(arr1));
        System.out.println("The Largest element in the array is: " + Solution.optimal(arr2));

    }
}
