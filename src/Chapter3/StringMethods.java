package Chapter3;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Creating and Manipulating Strings");
        // name variable will use String Pool while name1 doesn't.
        String name = "Rahid";
        String name1 = new String("Rahid");

        System.out.println(name);
    }
}
