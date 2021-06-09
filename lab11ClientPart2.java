/*
Experimenting with Stacks and Queues
Lab 11
by Isaac Shaw
*/
   
import java.net.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class lab11ClientPart2{
   //Create needed Main Member Variables
   
   //Main
   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      String choice = "0";
      
      CheckoutLine theCaf = new CheckoutLine();
      
      boolean reCheck = false;
      
      do{
         
         System.out.println("What would you like to do with the supermarket line?\n"
            + "1 – have a customer line up\n"
            + "2 – have a customer check out\n"
            + "3 – check who is in line\n"
            + "4 – quit");
            
         do{
            choice = scan.next();
            if(!choice.equals("1")&&!choice.equals("2")&&!choice.equals("3")&&!choice.equals("4")){
               System.out.println("Invaild choice");
               reCheck = true;
            }else{
               reCheck = false;
            }
         }while(reCheck);
         
         switch(choice){
            case "1":
               System.out.println("Enter the customer’s name and number of items:");
               String name = scan.next();
               int numOfItems = scan.nextInt();
               
               theCaf.enqueue(name, numOfItems);
               
               System.out.print(name + " with " + numOfItems + " item(s) is in the ");
               if(numOfItems > 15){
                  System.out.println("normal line.\n"); 
               }else{
                  System.out.println("express line.\n");
               }
               
               break;
            case "2":
               theCaf.dequeue();
               System.out.println();
               break;
            case "3":
               System.out.println(theCaf + "\n");
               break;
         }
         
      }while(!choice.equals("4"));
   }
}
