package Chapter3;

public class StringMethods {
    public static void main(String[] args) {
        String s = "New String";

        //length()
        System.out.println("String length() examples");
        System.out.println(s.length());

        //charAt()
        System.out.println("String charAt() examples");
        System.out.println(s.charAt(4)); //S
        System.out.println(s.charAt(6)); //r

        //indexOf()
        System.out.println("String indexOf() examples");
        s = "animals";
        System.out.println(s.indexOf('S')); // -1 (because of case sensitivity)
        System.out.println(s.indexOf("s")); // 6
        System.out.println(s.indexOf("al")); // 4
        System.out.println(s.indexOf('a', 3)); // 4
        System.out.println(s.indexOf("im", 5)); // -1

        //substring()
        System.out.println("String substring() examples");
        System.out.println(s.substring(1)); //nimals
        System.out.println(s.substring(0,7)); //animals
        System.out.println(s.substring(3,3)); //empty list
//        System.out.println(s.substring(3,2)); //raise error because beginning is more than ending
//        System.out.println(s.substring(1,8)); //raise error because animals is 7 characters long
//        System.out.println(s.substring(1.4, 5)); //raise error because of floating point value

        System.out.println("String toUpperCase() and toLowerCase() examples");
        s.toUpperCase();
        System.out.println(s); //animals because of immutable
        System.out.println(s.toUpperCase()); //ANIMALS

        System.out.println("String equals() and equalsIgnoreCase() examples");
        System.out.println("abc".equalsIgnoreCase("abc")); //true
        System.out.println("abc".equalsIgnoreCase("AbC")); //true
        System.out.println("abc".equals("abc")); //true
        System.out.println("abc".equals("AbC")); //false


        System.out.println("String startsWith(), endsWith() and contains() examples");
        System.out.println(s.startsWith("a")); //true
        System.out.println(s.endsWith("mals")); //true
        System.out.println(s.startsWith("A")); //false
        System.out.println(s.contains("na")); //false
        System.out.println(s.contains("m")); //true

        System.out.println("String replace() and trim() examples");
        System.out.println(s.replace('a', 'A'));
        System.out.println(s.replace("mals", "----"));

        System.out.println("\t animals \t");
        System.out.println("\t animals \t".trim());
    }
}
