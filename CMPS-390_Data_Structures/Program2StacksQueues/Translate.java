public class Translate{
char stack[] = new char[128];
int top;
int num, x, y, z;
String s;
char c; 
char m;
char myOp;

   void translate(String eq){
      Stack post = new Stack();
      Stack op = new Stack();
      Stack postfix = new Stack();
      int j;
      post.init();
      op.init();
      
      for(j = 0; j < eq.length(); j++){
         m = eq.charAt(j);
         if(m > '0' && m < '9'){
            postfix.push(m);            
         }
         else if(m == '+' || m == '/' || m == '-' || m == '*'){
               op.push(m);
            }
         else if (m == '('){
         }
         else if(m == ')'){
               while(op.isStackEmpty() == false){
               myOp = op.pop();
               postfix.push(myOp);        
           } 
         }    
      }
        postfix.showStack();    
   }
}