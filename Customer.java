/**/

public class Customer{
   
   private String name;
   private int numOfItems;
   
   public Customer(String name, int numOfItems){
      this.name = name;
      this.numOfItems = numOfItems;
   }
   
   public String getName(){
      return name;
   }
   
   public int getData(){
      return numOfItems;
   }
   
   public String toString(){
      return "Name: " + name + " / Items: " + numOfItems;
   }
}