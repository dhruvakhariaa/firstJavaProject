package Arrays;
public class LinearSearch {
    public static String linearSearch(String arr[], String key)
    {
        int i;
        for(i=0; i<arr.length; i++)
        {
            if(arr[i] == key){
                return arr[i];
            }
        }
        return "false";
    }
    public static void main(String args[])
    {
        String menu[] = {"dosa", "sambhar", "chutney", "idli", "meduwada"};
        String key = "Dhinka";
        String result = linearSearch(menu, key);
        
        if(result == key)
        {
            System.out.println(key + " Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
