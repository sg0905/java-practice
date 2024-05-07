import java.util.*;
import java.io.*;

public class access_element {
    //main method
    public static void main(String args[]){
        
        //creating empty stack
        Stack <String> stack =new Stack<String>();
        stack.push("Shubham");
        stack.push("is");
        stack.push("student");
        stack.push("of NIT");

        //display stack

        System.out.println(stack);

        //stack peek element

        System.out.println("The peek element of stack is: "+ stack.peek());


    }
}
