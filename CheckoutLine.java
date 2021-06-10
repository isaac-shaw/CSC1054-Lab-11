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
            lines = 1;
         }else{
            IntNodeCustomer customer = new IntNodeCustomer(name, inputData);
            fTail.setNext(customer);
            fTail = customer;
            lines = 1;
         }
      }else{
         if(nHead == null){
            IntNodeCustomer customer = new IntNodeCustomer(name, inputData);
            nHead = customer;
            nTail = customer;
            lines = 2;
         }else{
            IntNodeCustomer customer = new IntNodeCustomer(name, inputData);
            nTail.setNext(customer);
            nTail = customer;
            lines = 2;
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
            System.out.println(nHead.getName() + " is checking out with " + nHead.getData() + " item(s)");
            if(nHead == nTail){
               nHead = null;
               nTail = null;
            }else{
               nHead = nHead.getNext();
            }
            lines = 2;
            break;
         case 2:
            System.out.println(fHead.getName() + " is checking out with " + fHead.getData() + " item(s)");
            if(fHead == fTail){
               fHead = null;
               fTail = null;
            }else{
               fHead = fHead.getNext();
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
      int holdLines;
      
      String list = "";
      IntNodeCustomer nTemp = nHead;
      IntNodeCustomer fTemp = fHead;
            
      if(isEmpty()){
         return "There is no one in line.";
      }
      checkLines();
      holdLines = lines;
      while(nTemp != null || fTemp !=null){
         switch(holdLines){
            case 1:
               //list = list + nHead.toString() + "\n";
               list = list + nTemp.toString() + "\n";
               nTemp = nTemp.getNext();
               if(fTemp != null){
                  holdLines = 2;
               }
               break;
            case 2:
               //list = list + fHead.toString() + "\n";
               list = list + fTemp.toString() + "\n";
               fTemp = fTemp.getNext();
               if(nTemp != null){
                  holdLines = 1;
               }
               break;
         }
      }
      return "Line:\n" + list;
   }
}