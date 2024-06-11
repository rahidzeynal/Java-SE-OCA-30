package Chapter3;

public class ArraysMulti {
    public static void main(String[] args) {

        int[][] vars1;
        int vars2 [][];
        int[] vars3[];
        int[] vars4[], vars5[][];

        String [][] rectangle = new String[3][2];
        rectangle[0][0] = "a";
        rectangle[0][1] = "b";
        rectangle[1][0] = "c";
        rectangle[1][1] = "d";
        rectangle[2][0] = "e";
        rectangle[2][1] = "f";


        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j] + "; ");
            }
            System.out.println();
        }

        //Enhanced for loop
        for(String[] inner : rectangle){
            for(String character : inner){
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
