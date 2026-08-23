package arrays;
import java.util.HashSet;


    public class RemoveDublicatesinplace  {
         class Solution
        {

            public static int optimal (int [] nums) {
                int x =0 ;
                for(int i =1;i<nums.length;i++)
                {
                    if(nums[x]!=nums[i]){
                        x++;
                        nums[x] = nums[i];
                    }

                }
                return x+1;


            }

            public static int brute(int[] nums) {

                HashSet<Integer> seen = new HashSet<>();


                int index = 0;


                for (int num : nums) {


                    if (!seen.contains(num)) {
                        seen.add(num);
                        nums[index] = num;
                        index++;
                    }
                }

                return index;
            }



        }


        public static void main (String[] args){
            int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};


           // int k = Solution.brute(nums);
            int j = Solution.optimal(nums);
            System.out.println("j " + j);



           // System.out.println("k = " + k);
            System.out.print("Array after removing duplicates: ");
//            for (int i = 0; i < k; i++) {
//                System.out.print(nums[i] + " ");
//            }
        }
    }


