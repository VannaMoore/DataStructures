import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\\Users\\vanna\\OneDrive\\Desktop\\CMPS 390\\CMPS 390 Assignments\\Program6Tree_vs_Bubble\\numbers.txt");
        Scanner scan = new Scanner(file);

        Tree tree = new Tree();
        tree.init();
        int[] arr = new int[1000];
        int treeComps;
        int bubbleComps = 0;

        /* Scans numbers from file and places them in an array */
        while (scan.hasNextInt()) {
            for(int j = 0; j< arr.length; j++) {
                int num = scan.nextInt();
                arr[j] = num;
            }
        }

        /* Method called buildSort takes pre-sorted numbers from the
        array and sorts them into a tree */
        for (int j = 0; j < arr.length; j++){
            tree.buildSort(arr[j]);
        }

        /* inOrder prints the tree out in order from low to high*/
        tree.inOrder(tree.root);

        /* Method called comparisonTotal counts the number of comparisons */
        treeComps = tree.compareTotal(arr);
        System.out.println("\nTotal number of tree comparisons: " + treeComps);
        scan.close();

        int[] bubbleArray = new int[1000];
        Random num = new Random();
        int number;
        for(int i = 0; i < 1000; i++){
            number = num.nextInt(100);
            bubbleArray[i] = number;
            //System.out.println(bubbleArray[i]);
        }

        /* Bubble Sort */
        boolean swap = true;
        while(swap) {
            swap = false;

            for (int j = 0; j < bubbleArray.length - 1; j++) {
                bubbleComps++;
                if (bubbleArray[j] > bubbleArray[j + 1]) {
                    swap = true;
                    int temp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Total number of bubble sort comparisons are: " + bubbleComps);
        System.out.println("The tree sort program is more efficient");
        System.out.println("Based on comparisons made, the tree sort is more efficient");
        System.out.println("Based on memory used, the bubble sort is more efficient.");
    }
}