class Laptop{
    public void show(){
        System.out.println("Laptop is showing");
    }
}

class Computer extends Laptop{
    @Override
    public void show(){
        System.out.println("Computer is showing");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        Computer obj = new Computer();
        obj.show(); //Computer is showing

        Laptop obj1 = new Laptop();
        obj1.show(); //Laptop is showing


         //Dynamic Method Dispatch is when an object is made of child class but given reference to parent class
        Laptop obj2 = new Computer();
        obj2.show(); //Computer is showing
    }
}
