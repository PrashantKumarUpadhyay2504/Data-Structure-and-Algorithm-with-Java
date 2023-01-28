
import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this .data=data;
        this.next=null;
    }
}
public class Linked_List {

    public static Node<Integer> takeInput(){
       Node<Integer>head=null;
        Scanner sc=new Scanner(System.in);
        int data= sc.nextInt();
        while(data!=-1){
            Node<Integer> newnode=new Node<Integer>(data);
            if (head==null){
                head=newnode;
            }else{
                Node<Integer> temp=head;
                while(temp.next!=null){
                    temp =temp.next;
                }
                temp.next=newnode;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + "->");// 10->20->30->null
            head = head.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head=takeInput();
//        Node<Integer> node1=new Node<Integer>(10);
//        Node<Integer> node2=new Node<Integer>(20);
//        Node<Integer> node3=new Node<Integer>(30);
//        node1.next=node2; // 10->20
//        node2.next=node3; // 10->20->30
//        Node<Integer> head = node1;
        print(head);
    }
}
