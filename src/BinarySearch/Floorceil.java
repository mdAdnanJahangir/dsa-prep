package BinarySearch;

public class Floorceil {
    public static  int  floor (int [] brr , int target){
        int low =0;
        int high = brr.length-1;
        int mid;
        int ans = brr.length;
        while(low <= high){
            mid = (low+high)/2;
            if(brr[mid]  <= target){
                ans = mid;
                low = mid +1;
            }else{

                high = mid -1;
            }
        }
        return ans ;
    }
    public static  int  ciel (int [] brr , int target){
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
        int [] arr ={2,30,40,46,50,60};
        int target = 45;
        int  floor = floor(arr,target);
        int   ciel =  ciel(arr,target);
        System.out.println(" floor and ciel are " + floor + "  " + ciel);


    }
}
