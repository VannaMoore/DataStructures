public class stringToStack{
int j;
char c;
Stack s = new Stack();
char k;


void stringToStack(String eq){
   s.init();
   for(j = 0; j < eq.length(); j++){
      k = eq.charAt(j);
      s.push(k);     
   }

} // close method



}// close class