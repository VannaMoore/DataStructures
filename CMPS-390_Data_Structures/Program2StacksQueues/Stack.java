public class Stack{
   char[] stack = new char[20];
   int top;
        
    void init(){
        int top = -1; 
    }
    
    public void push (char c){
        top = top + 1;
        stack[top] = c;
    }
    
    public char pop(){
    char c;
    c = stack[top];
    top = top-1;
    return c;
    }
    
    boolean isStackEmpty(){ 
    boolean empty = false;
      if (top == -1){
         empty = true;
      }
         return empty;      
    }
    
    void showStack(){
    int j;
      for(j = 0; j <= top; j++){
      System.out.print(stack[j]);
      }
    }
}
