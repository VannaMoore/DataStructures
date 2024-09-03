public class Queue{
char[] queue = new char[128];
int front, rear;

void init(){
   front = 0;
   rear = -1;
}

void push(char c){
   rear = rear + 1;   
   queue[rear] = c;    
}

char pop(){
   char x;
   x = queue[front];
   front = front + 1;
   return x;
   }

boolean isQueueEmpty(){
   boolean empty;
   empty = false;
   if (rear <= front){
   empty = true;
   }
   
   return empty;
}

void showQueue(){
   int j;
   if (front >= rear)
   return;
   else
   {
   for(j = 0; j <= rear; j++){
      System.out.print(queue[j]);
   }
   }
}
}
