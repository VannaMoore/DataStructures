public class Evaluate{
Stack post = new Stack();
Stack op = new Stack();
int[] numStack = new int[20];
numStack num = new numStack();

char operator;
char c;
int j, k, x, y, z;
int answer;

   void eval(String eq){

         op.init();
         for(j = 0; j < eq.length(); j++){
            c = eq.charAt(j);
            
            while(op.isStackEmpty() == false){
               if(c > '0' && c < '9'){
                  post.push(c);
               }
               else if(c == '+' || c == '-' || c == '*' || c == '/'){
                  operator = op.push(c);
               }
                  
                  while(op.isStackEmpty == false){
                  y = (int)post.pop();
                  x = (int)post.pop();
                  c = op.pop();
                  
                  if (c == '+'){
                     z = x + y;
                  }
                  else if (c == '-'){
                     z = x - y;
                  }
                  else if (c == '*'){
                     z = x * y;
                  } 
                  else if (c == '/'){
                     z = x / y;
                  }                            
                  num.push(z); 
                  
           }
                  
                  if(num.isStackEmpty() == false){
                     operator = op.pop();
                     y = num.pop();
                     x = num.pop();
                        if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                           if (c == '+'){
                              z = x + y;
                           }
                           else if (c == '-'){
                              z = x - y;
                           }
                           else if (c == '*'){
                              z = x * y;
                           } 
                           else if (c == '/'){
                              z = x / y;
                           } 
                           
                           answer = z; 
                        }
                  }
               }
          }       
         }
}











/*      num.init();
      op.init();
      post.init();
   
      for(j = 0; j < eq.length(); j++){
         c = eq.charAt(j);  
         
            if(c > '0' && c < '9'){
               post.push(c);
            }
            
            else if(c == '+' || c == '-' || c == '*' || c == '/'){
               op.push(c);
            } 
            }
            
            while(op.isStackEmpty() == false){               
                  y = (int)post.pop();
                  x = (int)post.pop();
                  operator = op.pop();
               
               if(operator == '+'){
                  z = x + y;
               }
               else if(operator == '-'){
                  z = x - y;
               }
               else if(operator == '*'){
                  z = x * y;
               }
              else if(operator == '/'){
                  z = x / y;
               }
               

               
              
               
               while(num.isStackEmpty() == false){
                  y = num.pop();
                  x = num.pop();
                  if(operator == '+'){
                     z = x + y;
                  }
                  else if(operator == '-'){
                     z = x - y;
                  }
                  else if(operator == '*'){
                     z = x * y;
                  }
                 else if(operator == '/'){
                     z = x / y;
                  }
                 answer = z;
                 System.out.println("Answer: " + z);
               }
               
               
            
            }
            
                   
         
   
} */





























 /*  void eval(String eq){
      
      
        op.init();
         for(j = 0; j < equat.length(); j++){
            c = eq.charAt(j);
            if
         
            if(c > '0' && c < '9'){
               post.push(c);
            }
            else if(c == '+' || c == '-' || c == '*' || c == '/'){
               y = (int)post.pop();
               x = (int)post.pop();
               
               if (c == '+'){
                  z = x + y;
               }
               else if (c == '-'){
                  z = x - y;
               }
               else if (c == '*'){
                  z = x * y;
               } 
               else if (c == '/'){
                  z = x / y;
               }                            
               post.push(z);
            }
         
         }// close for loop
   System.out.println("\nThe answer is " + z);   
      
  */

