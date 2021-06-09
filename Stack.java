/*
Stack class specific to Card and IntNode Version Card
*/

public class Stack{
   
   private IntNodeVC head;
   
   //Constructor
   public Stack(){
      head = null;
   }
   
   //Push Method
   public void push(int inputData){
      IntNodeVC newNode = new IntNodeVC(inputData);
      newNode.setNext(head);
      head = newNode;
   }
   
   //Pop Method
   public int pop(){
      int returnData = head.getData();
      head = head.getNext();
      
      return returnData;
   }
   
   //Peek Method
   public void peek(){
      System.out.println(head);
   }
   
   //toString Method
   public String toString(){
      String list = "";
      IntNodeVC temp = head;
      
      while(temp != null){
         list = list + temp.toString() + "\n";
         temp = temp.getNext();
      }
      
      return "Stack:\n<top>\n" + list + "<bottom>";
   }
}