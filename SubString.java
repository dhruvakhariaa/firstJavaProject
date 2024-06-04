public class SubString {
    public static void main(String[] args) {
        String originalString = "Hello, World! This is Java.";
        String substringToReplace = "Java";
        String replacementSubstring = "Python";

        String modifiedString = originalString.replace(substringToReplace, replacementSubstring);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
