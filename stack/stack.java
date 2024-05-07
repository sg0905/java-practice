import java.util.*;
import java.io.*;

class stack
{
    static void stack_push(Stack <Integer> stack, int n)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter "+n+" Elements in Stack");
        

        for(int i =0;i<n;i++)
        {
            int ele =sc.nextInt();
            stack.push(ele);
        }
    }
    static void stack_pop(Stack <Integer> stack, int n)
    {
        System.out.println("pop operation:");
        for(int i =0;i< 5; i++){
            int y= (int )stack.pop();
            System.out.println(y);
        }

    }

    // Display element on top of the stack

    static void stack_top(Stack <Integer> stack){
        int ele= (int) stack.peek();
        System.out.println("Peek element " + ele);
    }

    static void stack_search(Stack <Integer> stack, int n)
    {
        int search =125;
        int pos=(int) stack.search(search);
        if(pos == -1)
        System.out.println("Element not found");
        else
        System.out.println("Element is found at position: "+ pos);
    }
    
    public static void main(String args[])
    {
        int num=5;
        
        Stack <Integer> stack=new Stack <Integer>();
        stack_push(stack,num);
        stack_pop(stack,num);
        stack_push(stack,num);
        stack_top(stack);
        stack_search(stack,num);
    }
}


