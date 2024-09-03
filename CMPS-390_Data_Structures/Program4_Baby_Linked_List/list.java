 public class list{
   int data;
   node next;
   node curr;
   node front;
   node tail;
   node newNode;
      
      public void init(){
         front = null;
      }
     
      public node makeNode(int data){
         newNode = new node();
         newNode.data = data;
         newNode.next = null;
                 
         return newNode;
      } 
      
      public node addFirst(int data){
         front = makeNode(data);
         tail = front;
         return front;
      } 
      
      public node addLast(int data){  
         if(front == null){
            front = makeNode(data);
         } 
         else{
            tail = findTail();
            tail.next = makeNode(data);
            tail = tail.next;
            tail.next = null;
         }
         return tail; 
      } 
      
      public node findTail(){
         node curr;
         curr = front;
         while(curr.next != null){
            curr = curr.next;
         } 
         return curr;
      }
      
      public void showList(){
         node curr;
         curr = front;
         while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
            }
      }
      
      public void buildList(int length){
         int j;
         init();
         
         for(j = 0; j < length; j++){
            if(j == 0){
               node front = makeNode(j);
            } 
            else{
               tail = findTail();
               tail.next = makeNode(j);
            } 
         } 
      }    
}  