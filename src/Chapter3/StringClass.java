package Chapter3;

public class StringClass {
    public static void main(String[] args) {
        System.out.println("Creating and Manipulating Strings");
        // name variable will use String Pool while name1 doesn't.
        String name = "Rahid";
        String name1 = new String("Rahid");

        System.out.println(name);


        System.out.println("String concatenation");
        /*
        * There are 3 main rules
        *   1. If both operands are numeric, + means numeric addition.
        *   2. If either operand is a String, + means concatenation.
        *   3. The expression is evaluated left to right.
        * */
        System.out.println(1 + 3); // 4
        System.out.println(1 + "3"); // 13
        System.out.println(1 + 2 + "3"); // 33

        String s = "1";
        s += "2";
        s += 3;
        System.out.println(s); // 123


        System.out.println("Immutability");
        MutableClass mc = new MutableClass();
        System.out.println(mc.getS());
        mc.setS("Changed");
        System.out.println(mc.getS());

        System.out.println("--------------------------------");
        ImmutableClass ic = new ImmutableClass();
        System.out.println(ic.getS());

    }
}
