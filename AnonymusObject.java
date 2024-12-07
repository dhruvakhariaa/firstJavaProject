class A{

    A(){
        System.out.println("Constructor");
    }

    public void show(){
        System.out.println("Hello World");
    }
}

public class AnonymusObject {
    public static void main(String[] args) {
        new A(); // creating object of A and this object can be used only once 
        new A().show(); // creating object of A and calling show method
    }    
}
