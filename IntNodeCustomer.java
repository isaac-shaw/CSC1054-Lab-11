
//IntNode Version Customer specific to this lab, must have Customer class

public class IntNodeCustomer
{
   private Customer data;
   private IntNodeCustomer next;
   
   public IntNodeCustomer(String name, int dataIn){
      data = new Customer(name, dataIn);
   } 
   public String getName(){
      return data.getName();
   }
   public int getData(){
      return data.getData();
   }
   public void setData(int newData){
      String holdName = data.getName();
      data = new Customer(holdName, newData);
   }
   public IntNodeCustomer getNext(){
      return next;
   }
   public void setNext(IntNodeCustomer newNext){
      next = newNext;
   }
   public String toString(){
      return data.toString();
   }
}
 
