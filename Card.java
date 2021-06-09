public class Card{
   
   int num;
   //Constructor
   public Card(int dataIn){
      num = dataIn;
   }
   
   public int getNum(){
      return num;
   }
   
   public String toString(){
      return "Card: " + num;
   }
}