import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        int result1 = a + b * c;     
        int result2 = a * b + c;     
        int result3 = c + a / b;     
        int result4 = a % b + c;    
        System.out.println("The results of Int Operations are " 
                            + result1 + ", " 
                            + result2 + ", " 
                            + result3 + ", and " 
                            + result4);

        sc.close();
        // Operator Precedence in Java:
// 1. Multiplication (*), Division (/), and Modulus (%) have higher precedence.
// 2. Addition (+) and Subtraction (-) have lower precedence.
// 3. So *, /, % are performed before + or -.
// 4. If operators have the same precedence, they are evaluated from left to right.
// 5. Parentheses () can be used to change the default order of execution.
    }
}