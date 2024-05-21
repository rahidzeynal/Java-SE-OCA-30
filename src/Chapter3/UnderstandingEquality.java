package Chapter3;

public class UnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder tree = one.append("a");

        System.out.println(one == two); // false, because one and tree pointing to the separate heap memory address
        System.out.println(one == tree); // true, because one and tree pointing to the same heap memory address

        StringBuilder four = new StringBuilder();
        StringBuilder five = new StringBuilder();
        four = five.append("a");
        System.out.println(four == five);

        // The lesson is to never use  == to compare String objects, always use the equals() or the equalsIgnoreCase() functions(methods).

        System.out.println("---------------------");
        Lion l1 = new Lion();
        Lion l2 = new Lion();
        Lion l3 =  l1;
        System.out.println(l1==l1); //true
        System.out.println(l1==l2); //false
        System.out.println(l1==l3); //true
        System.out.println(l1.equals(l1)); //true
        System.out.println(l1.equals(l2)); //false
        System.out.println(l1.equals(l3)); //true

    }
}

class Lion {

}
