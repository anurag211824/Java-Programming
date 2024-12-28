// Java program to demonstrate Operators, Literals, and Keywords
// Keywords: 'public', 'class', 'static', 'void', etc.
public class C_program_Operators_Literals_KeyWord {

    // 'static' keyword for class-level method
    public static void main(String[] args) {
        
        // --- LITERALS ---
        // Integer literal
        int a = 10; // 10 is a literal
        System.out.println("Integer literal: " + a);
        // Floating-point literal
        double b = 5.5; // 5.5 is a literal
        System.out.println("Floating-point literal: " + b);
        // Character literal
        char c = 'A'; // 'A' is a literal
        System.out.println("Character literal: " + c);
        // String literal
        String str = "Hello"; // "Hello" is a literal
        System.out.println("String literal: " + str);
        // Boolean literal
        boolean isJavaFun = true; // true is a literal
        System.out.println("Boolean literal: " + isJavaFun);

        // --- OPERATORS ---
        // Arithmetic Operators
        int sum = a + 5;  // Addition (+)
        System.out.println("Sum: " + sum);
        int difference = a - 3; // Subtraction (-)
        System.out.println("Difference: " + difference);
        int product = a * 2;  // Multiplication (*)
        System.out.println("Product: " + product);
        int quotient = a / 2; // Division (/)
        System.out.println("Quotient: " + quotient);
        int remainder = a % 3; // Modulus (%)
        System.out.println("Remainder: " + remainder);

        // Relational Operators
        boolean isEqual = (a == 10); // Equal to (==)
        System.out.println("Is Equal: " + isEqual);
        boolean isNotEqual = (a != 5); // Not equal to (!=)
        System.out.println("Is Not Equal: " + isNotEqual);
        boolean isGreater = (a > 5); // Greater than (>)
        System.out.println("Is Greater: " + isGreater);
        boolean isLess = (a < 15); // Less than (<)
        System.out.println("Is Less: " + isLess);

        // Logical Operators
        boolean andResult = (a > 5 && b < 6); // Logical AND (&&)
        System.out.println("Logical AND: " + andResult);
        boolean orResult = (a > 15 || b < 6); // Logical OR (||)
        System.out.println("Logical OR: " + orResult);
        boolean notResult = !(a > 5); // Logical NOT (!)
        System.out.println("Logical NOT: " + notResult);

        // Assignment Operators
        a += 5; // Equivalent to a = a + 5
        System.out.println("a += 5: " + a);
        a -= 3; // Equivalent to a = a - 3
        System.out.println("a -= 3: " + a);

        // Increment and Decrement Operators
        a++; // Increment by 1 (Post-increment)
        System.out.println("a++: " + a);
        a--; // Decrement by 1 (Post-decrement)
        System.out.println("a--: " + a);

        // Bitwise Operators
        int bitwiseAnd = 5 & 3; // Bitwise AND (&)
        System.out.println("Bitwise AND: " + bitwiseAnd);
        int bitwiseOr = 5 | 3;  // Bitwise OR (|)
        System.out.println("Bitwise OR: " + bitwiseOr);
        int bitwiseXor = 5 ^ 3; // Bitwise XOR (^)
        System.out.println("Bitwise XOR: " + bitwiseXor);
        int bitwiseNot = ~5;   // Bitwise NOT (~)
        System.out.println("Bitwise NOT: " + bitwiseNot);

        // Shift Operators
        int leftShift = 5 << 1;  // Left shift (<<)
        System.out.println("Left Shift: " + leftShift);
        int rightShift = 5 >> 1; // Right shift (>>)
        System.out.println("Right Shift: " + rightShift);

        // --- KEYWORDS ---
        // 'if' and 'else' are keywords used for conditional statements
        if (isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun!");
        }

        // 'for' is a keyword used for loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // 'return' is a keyword used to exit a method
        return;
    }
}