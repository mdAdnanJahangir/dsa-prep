package BinarySearch;

public class FirstOccouraence {

    static int  Bs  (int[] brr,int target ){
        int s =0,e=brr.length-1;
        int mid ;
        int ans =-1;

        while(s<=e){

            mid = (s+e)/2;

            if(brr[mid] == target ){
                ans = mid;
                 e = mid -1;
            } else if(brr[mid] >  target){
                e = mid -1 ;
            } else{
                s =   mid +1;
            }

        }

        return ans;
    }


    public static void main(String[] args) {

        int [] arr ={2,3,4,4,4,6};
        int target = 4;

        int first = Bs(arr,target);
        System.out.println(first);

    }
}
