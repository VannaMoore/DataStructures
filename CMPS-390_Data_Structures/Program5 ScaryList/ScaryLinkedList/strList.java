 public class strList{
  // int data;
  // String name;
  // node next;
   strNode curr;
   strNode next;
   strNode prev;
   strNode temp;
   strNode front;
   strNode tail;
   strNode newNode;
   strNode newStrNode;
   boolean isEmpty;
   String A;
   String B;
   int counter;
   int x;
   int y;
   int z;
   int letVal;
   int nameCode;
      
      public void init(){
         front = null;
      }
// make new string node      
      public strNode makeStrNode(String data){
         newStrNode = new strNode();
         newStrNode.data = data;
         newStrNode.next = null;
         
         return newStrNode;
      }
// addFront      
      public void addFront(strNode n){
         front = curr;
         temp = curr;
         front = n;
         curr.next = temp;
      }
// add AtEnd      
      public void addAtEnd(strNode spot, String data){
         strNode tail;
         strNode node = new strNode();
         
         if(front == null){
            front = node;
         }
         else {
            tail = findTail();
            tail.next = makeStrNode(data);
         }
      }
// add Before      
      public void addBefore(strNode n){
         temp = curr;
         curr = n;
         curr.next = temp;
      }
      
      public void addNext(strNode spot, String data){ 
         strNode newNode;;        
         
         newNode = makeStrNode(data);
         
         newNode.next = spot.next;
         spot.next = newNode;
      }
      
      public strNode findTail(){
         while(curr.next != null){
            curr = curr.next;   
         }
         return curr;
      }

      public void showList(){
         curr = front;
         while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;            
         }
      }
      
      public int getLetterVal(String n){
         x = n.charAt(0)-'a';
         y = n.charAt(1)-'a';
         z = n.charAt(2)-'a';
         
         nameCode = (x *(26*26)) + (y * (26)) + (z * 1);
         
         return nameCode;
      }
      
/*      public void addInOrder(strNode n){
         curr = front;
         if(curr == null){
            addNext(n);
            front = n;
         }
         while((getLetterVal(n.data)) > (getLetterVal(front.data))){
            if(curr.next == null){
               addNext(n);
            }
            else if((getLetterVal(n.data)) < (getLetterVal(curr.data))){
               curr = curr.next;           
            }
            else if((getLetterVal(n.data)) > (getLetterVal(curr.data))){
               addNext(n);
            }       
         }
      } //close add in order
*/            
      

} // close strList class




/* ********************************************

      public boolean isListEmpty(strList x){
         isEmpty = false;
         if(x.front == null){
            isEmpty = true;
         }
         return isEmpty;
      }
      
*********************************************** */      