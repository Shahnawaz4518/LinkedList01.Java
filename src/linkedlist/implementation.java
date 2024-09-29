package linkedlist;

public class implementation {

    public static void insertAtEnd(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head =temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){ //empty
              //  head=tail=temp;
                insertAtEnd(val);
            }
            else{ //non-empty
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getAt(int idx){
            System.out.println("wrong idx");
            return -1;
        }
        void deleteAt(int idx){
            if(idx==0) {
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){ // O(n)
//            Node temp=head;
//            int count=0;
//            while(temp!=null){
//                count++;
//                temp=temp.next;
//            }
//            return count;
            return size;
        }
    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtHead(10);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
       // ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAtHead(18);
        ll.insertAtEnd(45);
        ll.display();
        ll.insertAt(2,15);
        ll.display();

        ll.insertAt(0,30);
        System.out.println();
        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);


        //System.out.println(ll.getAt(-8));
        System.out.println(ll.size);
        Node a=new Node(18);
        insertAtEnd(a,34);
        ll.display();
        ll.deleteAt(6);
        ll.display();
        System.out.println(ll.tail.data);
    }
}



/*

Theory

--if only head is given---> O(n)
--O(1) if ll class is then
--O(1) if tail is given
--O(n) if head is given


 */