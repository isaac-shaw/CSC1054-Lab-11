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
      
      //Create Scanner
      Scanner scan = new Scanner(System.in);
      //Create Variables
      String choice = "0";
      boolean reCheck = false;
      //Create new CheckoutLine
      CheckoutLine theCaf = new CheckoutLine();
      
      //Do while for menu
      do{
         //Print Menu
         System.out.println("What would you like to do with the supermarket line?\n"
            + "1 – have a customer line up\n"
            + "2 – have a customer check out\n"
            + "3 – check who is in line\n"
            + "4 – quit");
         //Makes sure the input is valid
         do{
            choice = scan.next();
            if(!choice.equals("1")&&!choice.equals("2")&&!choice.equals("3")&&!choice.equals("4")){
               System.out.println("Invaild choice");
               reCheck = true;
            }else{
               reCheck = false;
            }
         }while(reCheck);
         
         //Switch statement for user choice
         switch(choice){
            case "1":
               //Prompr User for data
               System.out.println("Enter the customer’s name and number of items:");
               String name = scan.next();
               int numOfItems = scan.nextInt();
               //Add data to line
               theCaf.enqueue(name, numOfItems);
               //Print out statement
               System.out.print(name + " with " + numOfItems + " item(s) is in the ");
               if(numOfItems > 15){
                  System.out.println("normal line.\n"); 
               }else{
                  System.out.println("express line.\n");
               }
               
               break;
            case "2":
               //Call dequeue
               theCaf.dequeue();
               System.out.println();
               break;
            case "3":
               //Print out data
               System.out.println(theCaf + "\n");
               break;
         }
         
      }while(!choice.equals("4"));
   }
}
