class Mobile{
    int price;
    String model;
    static String name;

    static{ //This is called only once when the class is loaded, no matter how many times the object is created
        name = "Mobile";
        System.out.println("Static block");
    }

    public Mobile(){
        price = 5000;
        model = "Vivo";
        System.out.println("Constructor");
    }

    void show(){
        System.out.println(name + " : " + model + " : " + price);
    }

    static void info(Mobile obj){
        System.out.println(name + " : " + obj.model + " : " + obj.price);
    }
}

public class Static {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile"); //It loads the class Mobile without making an object of it

        Mobile obj = new Mobile();
        obj.price = 10000;
        obj.model = "Samsung";

        Mobile.name = "Mobile";

        Mobile obj1 = new Mobile();
        obj1.price = 20000;
        obj1.model = "Iphone";

        obj.show();
        Mobile.info(obj1);
    }
}
