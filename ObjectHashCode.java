
import java.util.Objects;

class Laptops{
    String model;
    int price;

    @Override
    public String toString(){
        return model + " : " + price;
    }

    @Override
    public int hashCode() { //Custom function to get a hashcode
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.model);
        hash = 89 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) { //Custom function to check whether the values of two objects are equal or not
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptops other = (Laptops) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }
    
}

public class ObjectHashCode {
    public static void main(String[] args){
        Laptops obj1 = new Laptops();
        obj1.model = "Lenovo";
        obj1.price = 10000;
        
        //The default function to print the object is toString(), which is actually present in the Object class
        System.out.println(obj1);

        Laptops obj2 = new Laptops();
        obj2.model = "Lenovo";
        obj2.price = 10000;

        System.out.println("Both objects are equal : " + obj1.equals(obj2));
        //The equals() function is coming from Object class which has a predefined function to check if two objects are equal or not
        //To change it we can over ride the function in our own class Laptops

        System.out.println(obj1.hashCode());
        //The hashCode() function is coming from Object class which has a predefined function to get a hashcode
        //To change it we can over ride the function in our own class Laptops
    }
}
