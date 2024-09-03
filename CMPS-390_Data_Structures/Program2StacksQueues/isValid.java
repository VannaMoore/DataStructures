public class isEquationValid{
     int j;
     char m;
     boolean isGood = true;
     String invalid = "Invalid equation";
     
     String isValid(String eq){
     Stack e = new Stack();
     
     e.init();
     for(j = 0; j < eq.length(); j++){
         m = eq.charAt(j);
         if (m == 40){
         e.push(m);
         }
         if (m == 41){
            e.pop();
            }
            
         } // end for loop
     
     
     if (e.isStackEmpty() == false) {
         isGood = false;
         System.out.println("Valid equation.");
     } 
   
    


}
