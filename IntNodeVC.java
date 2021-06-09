
//IntNode Version Card (VC) specific to this lab, must have Card class

public class IntNodeVC
{
   private Card data;
   private IntNodeVC next;
   
   public IntNodeVC(int dataIn){
      data = new Card(dataIn);
   } 
   public int getData(){
      return data.getNum();
   }
   public void setData(int newData){
      data = new Card(newData);
   }
   public IntNodeVC getNext(){
      return next;
   }
   public void setNext(IntNodeVC newNext){
      next = newNext;
   }
   public String toString(){
      return data.toString();
   }
}
 
