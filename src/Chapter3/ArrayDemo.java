package Chapter3;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
//        array[1] = 2;
        array[2] = 3;
        System.out.println(array[1]); //It will print 0 as default value for int in arrays.

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
    }
}
