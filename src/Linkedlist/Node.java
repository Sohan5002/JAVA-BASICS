package Linkedlist;

import java.util.Scanner;

class linkedlistll {
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
    
   public  void insertAtend( int data)
   {   


Node temp = new Node(data);
if(head==null)
{
  head=temp;
}
else
{
  tail.next=temp;
}
tail=temp;
   }
public void insertAthead(int data)
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
  while(temp != null) {
    System.out.print(temp.data + " ");
    temp = temp.next;
  }
  

}
  public static void main(String []args)
    {  Scanner sc = new Scanner(System.in);
      linkedlistll list1 = new linkedlistll();
     // linkedlistll list2  = new linkedlistll();  
      int size =sc.nextInt();  
    for(int i=0;i<size;i++)
    {
      int data =sc.nextInt();
      list1.insertAtend(data);
     // list2.insertAthead(data);
    }
    System.out.println("print linkedlist");
    list1.display();
    System.out.println("print linkedlist after recusion");
   // list1.redisplay();
   // list2.display();
    sc.close();
  } 
}

