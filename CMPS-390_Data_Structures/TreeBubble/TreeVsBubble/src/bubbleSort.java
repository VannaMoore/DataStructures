public class bubbleSort {
    boolean swapping = true;
    int j;
    int bubbleComp = 0;



    public int bubbleSort(int[] array){
        while(swapping){
            swapping = false;
            for(j=1; j < array.length - 1; j++){
                if(array[j-1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                    swapping = true;
                    bubbleComp++;
                }
            }
        }
    return bubbleComp;
    }

    public void printBubble(int[] array){
        for(j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }

    }



    /******* Bubble sort ******
     int bubItemCount;
     int[] bubArr = new int[1000];
     File bubFile = new File("\\Users\\vanna\\OneDrive\\Desktop\\CMPS 390\\CMPS 390 Assignments\\Program6Tree_vs_Bubble\\numbers.txt");
     Scanner bubScan = new Scanner(bubFile);


     int itemCount = tree.itemCount(tree.root);
     System.out.println(itemCount);
     */


}
