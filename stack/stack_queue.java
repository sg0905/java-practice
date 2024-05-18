import java.util.LinkedList;
import java.util.Queue;

public class stack_queue {
    Queue <String> q1 =new LinkedList<>();
    Queue <String> q2 =new LinkedList<>();

    // push operation

    public void push(String x){
        q1.add(x);
    }

    //pop peration

    public void pop(){
        
        // check if Queue is empty or not

        if(q1.isEmpty()){
            System.out.println(" Stack is Empty");
        }
        while( q1.size() >1){
            q2.add(q1.remove());
        }
        String pop_element = q1.remove();

        // swap elements between q1 & q2

        Queue <String> temp = q1;
        q1 = q2;
        q2 = temp;
        System.out.println("Popped Element is : " + pop_element);
        
    }


    // Peak Element

    public void peek(){
        if(q1.isEmpty()){
            System.out.println("Queue is Empty");
        }
        
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        System.out.println(" Peak element from Queue 1 : "+ q1.peek());
        System.out.println(" Peak element from Queue 2 : "+ q2.peek());
        q2.add(q1.remove());

        Queue <String> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    //Empty queue

    public void Empty(){
        if(q1.isEmpty())
            System.out.println(" Queue is Empty ");
        else 
            System.out.println(" Queue is not empty");

    }

    public static void main(String args[]){
        stack_queue sq = new stack_queue();
        
        sq.push("Hello");
        sq.push("Shubham");
        sq.push("at ");
        sq.push("my");
        sq.push("world");

        sq.peek();

        sq.pop();
       
        sq.peek();

        sq.Empty();

    

    }

    
}
