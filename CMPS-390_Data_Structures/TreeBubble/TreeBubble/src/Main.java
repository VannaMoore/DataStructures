import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {
   public static void main(String[] args) throws FileNotFoundException {
   File file = new File("\\Users\\vanna\\OneDrive\\Desktop\\CMPS 390\\CMPS 390 Assignments\\Program6Tree_vs_Bubble\\numbers.txt");
   Scanner scan = new Scanner(file);


   int[] arrayOccur = new int[100];

   Tree t = new Tree();
   t.init();

        while(scan.hasNextLine()){
            int x = scan.nextInt();

                treeNode m = t.makeTreeNode(x);
                t.insertR(m,x);
                t.printInOrderI(m,x);

                //t.printInOrderR(t.root);


                }

            } // close main method
        } // close main class
