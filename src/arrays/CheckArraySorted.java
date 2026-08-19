package arrays;


public class CheckArraySorted {
    class Solution{
        static boolean optimal(int[] arr){
          for (int i =1;i<arr.length;i++){
              if(arr[i] >= arr[i-1]){

              }else{
                  return false;
              }
          }
          return true;
        }

    }
    public static void main(String[] args) {

        int [] arr1 = {2,5,1,3,0};
        int[] arr2 = {8,9,10,12,12,13};


        System.out.println(Solution.optimal(arr1));
        System.out.println(Solution.optimal(arr2));


    }
}
