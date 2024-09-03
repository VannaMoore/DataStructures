public class isEquationValid{
     int j;
     char m;
     boolean isGood;
     
     
     boolean isValid(String eq){
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
         }
          
     if (e.isStackEmpty() == false) {
         isGood = false;
         System.out.println("Valid equation.");
     } 
     else if(e.isStackEmpty() == true)
     {
         isGood = true;
         System.out.println("Invalid equation.");
     }
 return isGood;  
}

}