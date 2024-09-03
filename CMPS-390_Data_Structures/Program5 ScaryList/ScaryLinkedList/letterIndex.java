public class letterIndex{


int charNum;
int charCurr;
int charNext=0;
int x;
int y;
int z;
int letVal;
int nameCode;

   public int getLetterVal(String n){
      x = n.charAt(0)-'a';
      y = n.charAt(1)-'a';
      z = n.charAt(2)-'a';
      
      nameCode = (x *(26*26)) + (y * (26)) + (z * 1);
      
      return nameCode;
   }// close method convertName
   
   
   
}// close letterIndex class


/*
int a = 0;
int b = 1;
int c = 2;
int d = 3;
int e = 4;
int f = 5;
int g = 6;
int h = 7;
int i = 8;
int j = 9;
int k = 10;
int l = 11;
int m = 12;
int n = 13;
int o = 14;
int p = 15;
int q = 16;
int r = 17;
int s = 18;
int t = 19;
int u = 20;
int v = 21;
int w = 22;
int x = 23;
int y = 24;
int z = 25;
*/