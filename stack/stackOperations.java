import java.util.Stack;
class stackoperations {
    public static void main(String args[])
    {
        //Stack Initialization
        Stack <Integer> stack= new Stack<>();
        
        //Empty operation
        boolean check= stack.empty();
        System.out.println("Is Stack Empty : " + check);


        //Push operation on Integer Stack
        stack.push(20);
        stack.push(25);
        stack.push(50);
        System.out.println("Original Stack : " +stack );

        //Empty operation
        boolean checks= stack.empty();
        System.out.println("Is Stack Empty : " + checks);

        //Peek operation

        int top= stack.peek();
        System.out.println("Top Element of Stack :" + top);
 
        //search operation

        int position = stack.search(20);
        if ( position != -1)
            System.out.println("The Searching element 20 is found at :"+ position);
        else
        System.out.println("The Searching element 20 is not found ");

        // pop operation 

        int pop_element = stack.pop();
        System.out.println("The popped element from stack is : "+ pop_element);

    }
    
}
