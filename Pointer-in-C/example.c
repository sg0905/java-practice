#include <stdio.h>

// Function prototype that takes a pointer to an int as a parameter
void increment(int *num);

int main() {
    int a = 10;        // Declare an integer variable
    int *p;            // Declare a pointer to an integer

    p = &a;            // Assign the address of 'a' to the pointer 'p'
    
    printf("Initial value of a: %d\n", a);          // Print the initial value of 'a'
    printf("Address of a: %p\n", (void*)&a);        // Print the address of 'a'
    printf("Pointer p points to: %p\n", (void*)p);  // Print the address stored in pointer 'p'
    printf("Value pointed to by p: %d\n", *p);      // Dereference 'p' to get the value of 'a'

    // Using the increment function to modify 'a' via the pointer
    increment(p);

    printf("Value of a after increment: %d\n", a);  // Print the modified value of 'a'

    return 0;
}

// Function definition that increments the value at the given address
void increment(int *num) {
    (*num)++;   // Dereference the pointer and increment the value
}
