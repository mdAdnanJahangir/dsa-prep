package BinarySearch;



class UpperBound {

    static int upperBoundOptimal(int [] brr , int target ){
        int low =0;
        int high = brr.length-1;
        int mid;
        int ans = brr.length;
        while(low <= high){
            mid = (low+high)/2;
            if(brr[mid] > target){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
         return ans ;
    }




    // Linear search method to find upper bound
    public static int upperBound(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                return i; // Return index of first element > x
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19}; // Sorted array
        int x = 9;

        int ind = upperBound(arr, x);
        int ans  = upperBoundOptimal(arr, x);


        System.out.println("The upper bound is the index: " + ind); // Output result
        System.out.println("The upper bound is the index: " + ans); // Output result

    }
}
