
import java.util.*;
import java.io.*;

public class push {
    public static void main(String args[]){
        
        // Default stack initialization
        Stack stack1=new Stack();

        // using generics

        Stack <String> stack2=new Stack<String>();

        stack1.push("shubham");
        stack1.push("0905");
        stack1.push("NIT-Delhi");

        stack2.push("I");
        stack2.push("AM");
        stack2.push("Student");

        System.out.println(stack1);
        System.out.println(stack2);
    }
}

