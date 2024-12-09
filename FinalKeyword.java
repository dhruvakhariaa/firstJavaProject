final class P{   //This class cannot be inherited
    int price; 
    void showPrice(){
        System.out.println(price);
    }
}

class Dhruv{
    final void show(){   //This method cannot be overridden
        System.out.println("By Dhruv");
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        final int a = 10; //This value can never be changed from now onwards 
        //a = 99;  //This line would throw an error
        System.out.println(a);

        Dhruv obj = new Dhruv();
        obj.show();
        obj.add(4,5);

        P obj1 = new P();
        obj1.price = 10000;
        obj1.showPrice();
    }
}
