package Linkedlist;

<<<<<<< HEAD
import java.util.*;
=======
import java.util.Scanner;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a

public class InsertAtindex {
    
    Node head =null;
    Node tail = null;
    class  Node{
    
      int data;
      Node next;
     
      public Node(int data)
      {
     this.data=data;
     this .next=null;
     }
      }
<<<<<<< HEAD

=======
J
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
public void insertAtIndex(int data)
{
  Node temp = new Node(data);
  if(head==null)
  {
    head=temp;
  }
  else
  {
    temp.next=head;
    head=temp;
  }
}
  public  void  display(){
  Node temp = head;
{
  while (temp!=null) {
  System.out.print(temp.data +" ");
     temp=temp.next;
  }
}
 // System.out.print("null");

}
  public static void main(String []args)
<<<<<<< HEAD
    {  try (Scanner sc = new Scanner(System.in)) {
          linkedlistll list = new linkedlistll();
         // linkedlistll list2  = new linkedlistll();  
          int size =sc.nextInt();  
        for(int i=0;i<size;i++)
        {
          sc.nextInt(); // Reading but not storing since it's commented out
          //list.insertAtIndex(data);
        }
        System.out.println("before add element ");
        list.display();
        System.out.println(" after add the  element ");
        list.display();
      }
=======
    {  Scanner sc = new Scanner(System.in);
      linkedlistll list = new linkedlistll();
     // linkedlistll list2  = new linkedlistll();  
      int size =sc.nextInt();  
    for(int i=0;i<size;i++)
    {
      int data =sc.nextInt();
      list.insertAtIndex(data);
    }
    System.out.println("before add element ");
    list.display();
    System.out.println(" after add the  element ");
    list.display();
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
  } 
}



