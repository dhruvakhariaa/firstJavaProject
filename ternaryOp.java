// Ternary operator in java
// (condition) ? expression1 : expression2
//expression1 if condition is true and expression2 if condition is false
//Check the greatest number of 3 numbers using ternary operator

public class ternaryOp {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The greatest number is: " + max);
    }
}
