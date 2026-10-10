package linked;



public class Linkedlistuser {
    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();


            ll.addAtHead(5);
            ll.addAtHead(4);
            ll.addAtHead(3);
            ll.addAtHead(2);
            ll.addAtHead(1);

           ll.print();
            Node head = ll.rh();
           Node ans =  Middle.optimal(head);
        System.out.println(ans.val);


    }
}
