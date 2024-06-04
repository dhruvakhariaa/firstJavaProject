public class Kpattern
{
    public static void main(String[] args) 
    {
        int rows = 6; // Change this value to adjust the pattern height

        // Upper part of the pattern
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = 2; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}