package Chapter3;

public class ArrayDemo {

    public static void main(String[] args) {

        //The most common way to create an array looks like this:
        int[] array = new int[3];
        array[0] = 1;
//        array[1] = 2;
        array[2] = 3;
        System.out.println(array[1]); //It will print 0 as default value for int in arrays.

        //Actually new int[] part is count as redundant by Java.
        int [] array2 = new int[] {1,2,3};
        System.out.println(array2[2]);

        int [] array3 = {1,2,3};
        System.out.println(array3[1]);



        //declaring multiple arrays
        int[] ids = {1, 2}, types = {1}; //they both are arrays, because their data type is int[] not int
        int idss[] = {2}, typess; //This time idss is array but typess is not array.



        String [] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(bugs==alias);
        System.out.println(bugs.toString());


        String[] strings = {"Z.Rahid"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        System.out.println(againStrings[0]);

//        againStrings[0] = new StringBuildes();  //Doesn't compile
//        objects[0] = new StringBuilder();       //Does compile, but raises run time exception.

        System.out.println(array2.length);
        System.out.println(array2[1]);


        String [] words = new String[] {"Some", "words."};
        String [] words2 = new String[] {"Some", "words."};
        System.out.println(words.equals(words2)); // Will return false because it looks for references are same or not
    }
}
