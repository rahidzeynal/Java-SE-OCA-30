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
        StringBuilder sb2 = new StringBuilder("animals");
        sb2.insert(7,"-"); //animals-
        sb2.insert(0,"-"); //-animals-
        sb2.insert(4,"-"); //-ani-mals-
        System.out.println(sb2);


        // delete() and deleteCharAt()
        StringBuilder sb3 = new StringBuilder("abcdef");
        sb3.delete(1, 3); // adef because endIndex is not included
        System.out.println(sb3);
        // sb3.deleteCharAt(4); // this will raise error because already we don't have 4th character in our new sb2 variable value.



        // reverse()
        sb3.reverse(); //feda
        System.out.println(sb3);

        // StringBuffer is the big brother of StringBuilder. StringBuffer is slower than StringBuilder. StringBuffer is "more thread safe" than StringBuilder.
    }
}
