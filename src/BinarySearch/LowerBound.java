package BinarySearch;

public class LowerBound {
    public static  int optimal (int [] brr , int target){
        int low =0;
        int high = brr.length-1;
        int mid;
        int ans = brr.length;
        while(low <= high){
            mid = (low+high)/2;
            if(brr[mid] >= target){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int [] arr = {2,2,2,3,4,5,5,};
        int target = 3;
        int ans = LowerBound.optimal(arr,target);
        System.out.println(ans );

    }
}
