package Chapter3;

public class StringBuilderExamples {
    public static void main(String[] args) {
        String s = "";
        for(char ch = 'a'; ch <= 'z'; ch++)
            s += ch;
        System.out.println("String s: " + s);

        StringBuilder sb = new StringBuilder();
        for(char ch = 'a'; ch <= 'z'; ch++)
            sb.append(ch);
        System.out.println("StringBuilder sb: " + sb);

        //Chaining
        //s.trim().toUpperCase() -> this is new String - it is true for Strings





        StringBuilder sb1 = new StringBuilder("start");
        sb1.append("+middle");
        StringBuilder same = sb1.append("+end");
        System.out.println("StringBuilder sb1: " + sb1);
        System.out.println("StringBuilder same: " + same);
        // Both will be same because StringBuilder is mutable, and it's just reference to the memory area and is "not contain value".


        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = new StringBuilder(a.append("de"));
        b = b.append("f").append("g");
        System.out.println(a);
        System.out.println(b);
        // a and b will be different in this case because here we created two different objects and a and b are looking to different memory addresses.
    }
}