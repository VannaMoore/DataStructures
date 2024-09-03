import java.io.PrintWriter;

public class Tree {
    public treeNode root;
    public int comp;

    public void init(){
        this.comp = 0;
        root = null;
    }

    treeNode makeTreeNode(int data){
        treeNode treeNode = new treeNode(data);
        treeNode.data = data;
        treeNode.left = null;
        treeNode.right = null;

        return treeNode;
    }

    void setLeft(treeNode t, int num){
        if(t.left != null){
            System.out.println("Error: Tree node already exists."); // might have to change to left = t.left and compare
        }
        else{
            t.left = makeTreeNode(num);
        }
    }
    void setRight(treeNode t, int num){
        if(t.right != null){
            System.out.println("Error: Tree node already exists.");
        }
        else{
            t.right = makeTreeNode(num);
        }
    }

    treeNode insertR(treeNode root, int data) {
        comp++;
        if (root == null) {
            return new treeNode(data);
        }
        if (data == root.data) {
            root.occur++;
        } else if (data < root.data) {
            root.left = insertR(root.left, data);
        } else {
            root.right = insertR(root.right, data);
        }
        return root;
    }

    public void printInOrderI(treeNode root, int writer) {
        java.util.Stack<treeNode> stack = new java.util.Stack<>();
        treeNode curr = root;
        if (root == null) {
            return;
        }
        while (curr != null || !stack.isEmpty()) {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
        curr = stack.pop();
        for (int j = 0; j < curr.occur; j++) {
            System.out.println(curr.data); /// writer.println
        }
        curr = curr.right;
    }

    //public int getCompares() {
    //    return comp;
    //}
}




}
