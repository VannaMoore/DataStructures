import java.util.Stack;
public class Tree {
    public Node root;
    public Node left;
    public Node right;
    public Node addNode;
    public Node curr;
    int data;
    int occur;
    boolean searching = true;
    int compareTree;
    int total = 0;
    int temp = 0;


    //constructor to initialize tree
    public void init() {
        root = null;
    }

    public int buildSort(int num){ ///////// This works!!!!!!
        Node createdNode;
        if (root == null){
            compareTree++;
            occur++;
            root = new Node(num);
        }
        else {
            curr = root;
            searching = true;
            while(searching){
                if (num == curr.data){
                    curr.occur++;
                    compareTree++;
                    searching = false;
                }
                else if (num< curr.data){
                    if (curr.left != null){
                        compareTree++;
                        curr = curr.left;
                    }
                    else{
                        curr.left = new Node(num);
                        compareTree++;
                        searching = false;
                    }
                }
                else if (num > curr.data){
                    if (curr.right != null){
                        compareTree++;
                        curr = curr.right;
                    }
                    else{
                        compareTree++;
                        curr.right = new Node(num);
                        searching = false;
                    }
                }
            }
        }
        return compareTree;
    }
public void inOrder(Node t){
        if(t.left != null){
            inOrder(t.left);
        }
    System.out.println(t.data);
        if(t.right != null){
            inOrder(t.right);
        }
}

public void printIterative(Node t){
        Stack<Integer> s = new Stack<Integer>();
        s.push(root.data);
        curr = root;
        do{
            while(curr != null){
                s.push(curr.data);
                curr = curr.left;
            }
            if (!s.empty()){
                int num = s.pop();
                System.out.println(num);
                curr = curr.right;
            }

        }while(!s.empty()|| curr != null);
}

    public int compareTotal( int[] array){
        for (int j = 0; j < array.length; j++) {
            int num = array[j];
            if (root == null) {
                root = new Node(num);
            } else {
                curr = root;
                searching = true;
                while (searching) {
                    compareTree++;
                    if (num == curr.data) {
                        searching = false;
                    } else if (num < curr.data) {
                        if (curr.left != null) {
                            curr = curr.left;
                        } else {
                            curr.left = new Node(num);
                            searching = false;
                        }
                    } else if (num > curr.data) {

                        if (curr.right != null) {
                            curr = curr.right;
                        } else {
                            curr.right = new Node(num);
                            searching = false;
                        }
                    }
                }
            }
        }
                return compareTree;
    }
    public int compareTree(int[] array){
        for(int j = 0; j< array.length; j++) {
            compareTree = buildSort(array[j]);
            temp = compareTree + temp;
            total = temp;
        }
    return total;
    }
}


