import java.util.*;
import java.io.*;
public class empty {
    public static void main(String args[])
    {
        Stack <String> stack =new Stack<String>();
        stack.push("JAVA");
        stack.push("is");
        stack.push("my");
        stack.push("love");

        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());

        }

    }
    
}
