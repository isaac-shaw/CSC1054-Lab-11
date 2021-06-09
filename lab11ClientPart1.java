/*
Experimenting with Stacks and Queues
Lab 11
by Isaac Shaw
*/
   
import java.net.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class lab11ClientPart1{
   //Create needed Main Member Variables
   
   //Main
   public static void main(String[] args){
      Stack s = new Stack();
      
      //Add 1 through 6 to the stack
      for(int i = 1; i <= 6; i++){
         s.push(i);
      }
      
      System.out.println(s + "\n");
      
      for(int i = 0; i < 3; i++){
         s.pop();
      }
      
      s.peek();
      System.out.println();
      
      for(int i = 7; i <= 9; i++){
         s.push(i);
      }
      
      System.out.println(s);
      
   }
}
