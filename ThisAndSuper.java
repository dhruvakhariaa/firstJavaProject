class A{
    public A(){
        super(); //default keyword is used before any statement in constructor
        System.out.println("A Constructor");
    }
    public A(int a){
        super(); //This is the super class so it refers to the superclass Object
        System.out.println("A paramterizeed Constructor");
    }
}

class B extends A{
    public B(){
        super(); //This is the super class so it refers to the superclass Object
        System.out.println("B Constructor");
    }
    public B(int a){
        this(); //This is the super class so it refers to the superclass Object
        System.out.println("B paramterized Constructor");
    }
}

public class ThisAndSuper {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        B obj = new B(10);
    }
}
