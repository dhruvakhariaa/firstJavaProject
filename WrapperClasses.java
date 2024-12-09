public class WrapperClasses {
    public static void main(String[] args) {
        int i = 10;

        @SuppressWarnings("UnnecessaryBoxing")
        Integer iObj = Integer.valueOf(i); //This is a depricated way of converting int to Integer object

        System.out.println(iObj);

        Integer num = i; //Autoboxing
        System.out.println(num);

        int num2 = num; //Auto - Unboxing

        System.out.println(num2);
    }
}
