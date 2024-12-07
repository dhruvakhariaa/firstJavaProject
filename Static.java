class Mobile{
    int price;
    String model;
    static String name;;

    void show(){
        System.out.println(name + " : " + model + " : " + price);
    }

    static void info(Mobile obj){
        System.out.println(name + " : " + obj.model + " : " + obj.price);
    }
}

public class Static {
    public static void main(String[] args) {
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
