package Chapter3;

public class UnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Test");
        StringBuilder s2 = new StringBuilder("Test");

        System.out.println(s1); // output: Test
        System.out.println(s2); // Test
        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2)); //Line 1 output: false
        System.out.println(s1.toString().equals(s2.toString())); //Line 2 output: false


        System.out.println("-----------------------------");
        StringBuilder s3 = new StringBuilder("Test");
        StringBuilder s4 = s3;

        System.out.println(s3); // output: Test
        System.out.println(s4); // Test
        System.out.println(s3==s4); // false
        System.out.println(s3.equals(s4)); //Line 1 output: false
        System.out.println(s3.toString().equals(s4.toString())); //Line 2 output: false



        System.out.println("-----------------------------");
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;

        System.out.println(t3.equals(t1));




        System.out.println("-----------------------------");
        String s5 = new String("test");
        String s6 = s5;
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));
    }
}
class Tiger{

}