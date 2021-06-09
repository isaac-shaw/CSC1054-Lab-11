/*
Queue class specific to Customer and IntNode Version Customer
*/

public class CheckoutLine{
   
   private IntNodeCustomer nHead = null, fHead = null, nTail = null, fTail = null;
   private int lines = 0;
   
   //Constructor
   public CheckoutLine(){
   }
   
   //Enqueue Method
   public void enqueue(String name, int inputData){
      
      if(inputData <= 15){
         if(fHead == null){
            IntNodeCustomer customer = new IntNodeCustomer(name, inputData);
            fHead = customer;
            fTail = customer;
            lines = 2;
         }else{
            IntNodeCustomer customer = new IntNodeCustomer(name, inputData);
            fTail.setNext(customer);
            fTail = customer;
            lines = 2;
         }
      }else{
         if(nHead == null){
            IntNodeCustomer customer = new IntNodeCustomer(name, inputData);
            nHead = customer;
            nTail = customer;
            lines = 1;
         }else{
            IntNodeCustomer customer = new IntNodeCustomer(name, inputData);
            nTail.setNext(customer);
            nTail = customer;
            lines = 1;
         }
      }      
   }
   
   //Line Status Checker
   public void checkLines(){
      if(nHead == null && fHead == null){
         lines = 0;
      }else if(nHead != null && fHead == null){
         lines = 1;
      }else if(nHead == null && fHead != null){
         lines = 2;
      }
   }
   
   //Dequeue Method
   public void dequeue(){
      checkLines();
      switch(lines){
         case 0:
            System.out.println("There is no one in line to check out!");
            break;
         case 1:
            nHead.setNext(nHead.getNext());
            if(nHead == nTail){
               nHead = null;
            }
            lines = 2;
            break;
         case 2:
            fHead.setNext(fHead.getNext());
            if(fHead == fTail){
               fHead = null;
            }
            lines = 1;
            break;
      }
   }
   
   //Peek Method
   public void peek(){
      checkLines();
      switch(lines){
         case 0:
            System.out.println("There is no one in line.");
            break;
         case 1:
            System.out.println(nHead.toString());
            break;
         case 2:
            System.out.println(fHead.toString());
            break;
      }
   }
   
   public boolean isEmpty(){
      checkLines();
      if(lines == 0){
         return true;
      }else{
         return false;
      }
   }
   
   //toString Method
   public String toString(){
      checkLines();
      int holdLines = lines;
      
      String list = "";
      IntNodeCustomer nTemp = nHead;
      IntNodeCustomer fTemp = fHead;
      
      if(isEmpty()){
         return "There is no one in line.";
      }
      
      while(nTemp != null && fTemp !=null){
         switch(holdLines){
            case 1:
               list = list + nTemp.toString() + "\n";
               nTemp = nTemp.getNext();
               holdLines = 2;
               break;
            case 2:
               list = list + fTemp.toString() + "\n";
               fTemp = fTemp.getNext();
               holdLines = 1;
               break;
         }
      }
      
      return "Line:\n" + list;
   }
}