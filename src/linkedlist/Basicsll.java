package linkedlist;

public class Basicsll {
    public static void displayR(Node head){ // Recursion method
        if(head==null) return ;
        System.out.print(head.data+" ");
        displayR(head.next);
    }
    public static void displayReverse(Node head ){
        if(head==null) return;
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static int length(Node head){
        int count =0;
        while(head!=null){
          count++;
          head=head.next;
        }
        return count;
    }

    public static class Node{
        int data; // value
        Node next; //address of next node

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5); //head Node
      //System.out.println(a.next);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
       // Node f=new Node(20);

        // 5->3->9->8->16

        a.next=b;// 5->3 9 8 16
//        System.out.println(a); //linkedlist.Basicsll$Node@6acbcfc0
//        System.out.println(a.next); //linkedlist.Basicsll$Node@5f184fc6
//        System.out.println(b); //linkedlist.Basicsll$Node@5f184fc6
//        System.out.println(c); //linkedlist.Basicsll$Node@3feba861
        b.next=c;// 5->3->9 8 16
        c.next=d;// 5->3->9->8 16
        d.next=e;// 5->3->9->8->16
       // e.next=f;
        System.out.println(length(a));


        display(a);
        System.out.println();
        displayR(a);
        System.out.println();
        displayReverse(a);

//        Node temp=a;
//        while(temp!=null){ //this the code for printing the list
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }

//        5->3->9->8->16-null


//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);




    }

}



/*Theory

linked list limitations: memory 2 gunna jayada
kharcha hota hai apan int aur jisse connect hota hai
 uska address


 Benifits: insertion 2nd idx --> 10
       5-3-6-8-9  =10=> 5-3-10-6-8-9  same address hota hai

 List Node:

 p s class Node{
 int data;
 Node next;
 Node(Int data){
 this.data=data;
 }

 Types of linked list

 1- singly
 2-doubly
 3-circular





 */