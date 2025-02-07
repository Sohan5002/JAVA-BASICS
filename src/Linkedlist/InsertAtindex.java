package Linkedlist;

import java.util.Scanner;

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
J
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
  } 
}



