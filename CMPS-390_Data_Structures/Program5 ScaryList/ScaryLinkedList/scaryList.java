/* This program uses a linked list to take in a file of names from the user and sort them alphabetically. It
starts with asking the user for the file name. Once they enter the name, a menu displays giving them the option to
1) display the list, 2) Display the length of the list 3) Print names that start with a specific letter,
4)Display the length of a section of the list by first letter, 5) Delete a name from the list,
and they can enter 0 to exit. The menu returns after every action the user chooses is complete until they press option
0 to exit. It uses methods called delete to delete names. It uses a method called addNode that uses methods called
addNode and addFirst to insert names alphabetically. It uses methods called convertName to convert
names into a base 26 number to insert them in order. It also uses a method called firstLetter to make an index. It has
methods showList to print it out and showIndex to print out a section of the list. The last method is display menu,
which gives the user a menu to choose their next action from.
* */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class scaryList
{
   public static void main(String[] args) throws FileNotFoundException {
      int code;
      letterIndex nameCode = new letterIndex(); // tester
      
// Scanner for user file io
      System.out.println("Enter the file name:");
      Scanner userInput = new Scanner(System.in);
      String filename = userInput.nextLine();
      File file = new File(filename);
      Scanner scan = new Scanner(file);

      list list = new list();
      list.init();

      while(scan.hasNextLine()){
      
         list.addNode(scan.nextLine());

      } //close while loop

      //Display Menu
      list.displayMenu();

   } //close main
} // close scary list class
      


