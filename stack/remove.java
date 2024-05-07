import java.util.*;
import java.io.*;

public class remove {
    public static void main(String args[])
    {

        //Intialize a stack
        Stack <Integer> stack = new Stack<Integer>();

        //psuh elements

        stack.push(10);
        stack.push(15);
        stack.push(40);
        stack.push(145);
        stack.push(1120);
        stack.push(14245);

        //Initial stack 

        System.out.println(stack);
        
        // Remove the elements

        System.out.println("Delete element: "+ stack.pop() );

        System.out.println("Deleted Elemnt:"+ stack.pop());


    }
}
