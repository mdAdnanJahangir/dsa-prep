package linked;


public class LinkedListt {

   public class Node {
        int val ;
        Node next;

        Node(int val ){
            this.val = val;

        }

    }

    Node head ;

    public void  addAtHead( int val) {

        if(head == null){
            System.out.println("nothing there ");
        };

        Node temp = new Node(val);

        temp.next = head;
        head = temp;


    }

    public void addAtTail(int val) {

        Node temp = new Node(val);
        Node curr = head;

        for(int i =0;curr.next != null ;i++){
            curr = curr.next;
        }

        curr.next = temp;
    }

    public void addAtindex( int val, int i ) {


    }


    public void deleteAtHead(){
        if(head == null){
            System.out.println("nothing there ");
        };
        head = head.next;


    }


    public void deleteAtTail(){


        Node curr = head ;

        while( curr.next.next != null ){
            System.out.print(" " + curr.val);
            curr = curr.next ;
        }

        curr.next = null;


    }



    public void deleteAtIndex(int i ){



    }

    public void print(){

        Node curr = head ;

        while( curr != null ){
            System.out.print(" " + curr.val);
            curr = curr.next ;
        }


    }



}
