//Code to declare a string buffer with some value and preform operations 
//such as append and reversing it to string

public class Stringbuffer {
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Hello, ");

        int i = 7;
        // String appendString = "Java";
        sb.insert(i, "Java");

        String modifiedString = sb.toString();
        System.out.println("Modified String: " + modifiedString);

        String reverseString = sb.reverse().toString();
        System.out.println("Reverse of Modified String: " + reverseString);
    }
}
