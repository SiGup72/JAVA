# Java Exception Handling Assignment

This folder contains Java programs that demonstrate core concepts of exception handling, including custom exceptions, try–catch blocks, exception hierarchy, and command-line validation.

The assignment demonstrates:

- Creating and throwing user-defined exceptions
- Handling exceptions using try, catch, and finally
- Validating command-line arguments
- Building multi-level exception hierarchies
- Printing custom error messages
- Understanding exception flow in Java

## Programs
- **ExceptionExample** - Throws an exception with a custom message inside a try block, catches it to display the message, and uses a finally block to confirm execution.
- **CustomException** - Creates a user-defined exception class with a string parameter stored inside the object.
Includes a separate method to print the stored string and uses a try–catch block to test the exception.
- **ExceptionHierarchy** - Implements a three-level exception hierarchy using three classes (A, B, C).
Each overridden method throws a different level of exception, demonstrating multi-level inheritance and exception overriding.
- **CheckArgumentSingle** - Takes 5 integer command-line arguments, checks the number of inputs, and throws a user-defined exception CheckArgumentException if fewer than five arguments are entered. Otherwise, it calculates and displays the sum of all five integers.
