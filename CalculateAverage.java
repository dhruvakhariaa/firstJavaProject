public class CalculateAverage {
    public static void main(String[] args) {
        double[] numbers = { 10.5, 20.5, 30.5, 40.5, 50.5 };
        
        double average = calculateAverage(numbers);
        
        System.out.println("Average of the numbers is: " + average);
    }
    
    public static double calculateAverage(double[] array) {
        if (array == null || array.length == 0) {
            return 0; 
        }
        
        double sum = 0;
        
        // for (double num : array) {
        //     sum += num;
        // }

        for(int i=0; i<array.length; i++)
        {
            sum += array[i];
        }
        
        double average = sum / array.length;
        
        return average;
    }
}
