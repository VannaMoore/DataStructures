/*For this program, I created classes for Stack, Queue, IsEquationValid, Translate, and Evaluate.
I used methods from those classes to validate and translate the equations. I couldn't get the evaluate to work.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StackQueue{
   public static void main(String[] args) throws FileNotFoundException{
   String A;
   File file = new File("C:\\Users\\vanna\\OneDrive\\Desktop\\CMPS 390\\Program2StacksQueues\\mathFile.txt");
   Scanner scan = new Scanner(file);
   isEquationValid eqStack = new isEquationValid();
   Translate infix = new Translate();
  // Evaluate ans = new Evaluate();
   
         String eqA = scan.nextLine();
         System.out.print(eqA + ": ");
         eqStack.isValid(eqA);
         infix.translate(eqA);
         //ans.eval(eqA);        
                                     
         String eqB = scan.nextLine();
         System.out.print("\n" + eqB + ": ");
         eqStack.isValid(eqB);
         infix.translate(eqB);
         //ans.eval(eqB); 
                
         String eqC = scan.nextLine();
         System.out.print("\n" + eqC + ": ");
         eqStack.isValid(eqC);
         infix.translate(eqC);
        
         String eqD = scan.nextLine();
         System.out.print("\n" + eqD + ": ");
         eqStack.isValid(eqD);
         infix.translate(eqD);
        // ans.eval(eqD); 
             
         String eqE = scan.nextLine();
         System.out.print("\n" + eqE + ": "); 
         eqStack.isValid(eqE);
         infix.translate(eqE);
         //ans.eval(eqE); 
          
         String eqF = scan.nextLine();
         System.out.print("\n" + eqF + ": ");
         eqStack.isValid(eqF);
         infix.translate(eqF);
              
         String eqG = scan.nextLine();
         System.out.print("\n" + eqG + ": ");
         eqStack.isValid(eqG);
         infix.translate(eqG);
           
         String eqH = scan.nextLine();
         System.out.print("\n" + eqH + ": ");
         eqStack.isValid(eqH);
         infix.translate(eqH);
         //ans.eval(eqH);          
   } 
} 