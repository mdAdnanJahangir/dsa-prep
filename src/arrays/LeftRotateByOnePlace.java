package arrays;

public class LeftRotateByOnePlace {


    class   Solution {


        public static void brute (int[] arr, int n) {
            int[] temp = new int[n];


            for (int i = 1; i < n; i++) {
                temp[i - 1] = arr[i];
            }
            temp[n - 1] = arr[0];


            for (int i = 0; i < n; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
        }


        public  static void   optimal (int[] nums) {
            int temp = nums[0];

            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }

            nums[nums.length - 1] = temp;
        }






    }





    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        Solution.brute(arr, n);
        Solution.optimal(arr);
        System.out.println(arr[n-1]);

    }
}