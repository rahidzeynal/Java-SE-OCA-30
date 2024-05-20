package Chapter3;


public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        //charAt(), indexOf(), length(), substring()

        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        System.out.println(sub); //anim

        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(len + " " + ch);

        //appends
        //append(String str)
        StringBuilder sb1 = new StringBuilder().append(1).append('c');
        sb1.append("-").append(true);
        System.out.println(sb1);


        String x = "a" + true;
        System.out.println(x);

        // insert()

    }
}
