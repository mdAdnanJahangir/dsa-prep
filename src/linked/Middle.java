package linked;

public class Middle {
     public static Node  brute(Node head){
         int count = 0;
         Node temp = head ;

         while(temp != null){
             count ++;
             //System.out.print(count);
             temp = temp.next ;
         }




         int midNode = (count/2)+1 ;
          temp = head ;

         while(temp != null){
             midNode = midNode -1 ;
             if(midNode == 0){
                 break;
             }
             temp= temp.next;
         }

         return temp;
     }


    public static Node optimal(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null & fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }

        return slow;
    }





}
