package Chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {

        // how to create ArrayList(older versions):
        ArrayList oldList1 = new ArrayList();
        ArrayList oldList2 = new ArrayList(10);
        ArrayList oldList3 = new ArrayList(oldList2);


        // how to create ArrayList(newer versions):
        ArrayList<Integer> newList1 = new ArrayList<Integer>();
        ArrayList<Integer> newList2 = new ArrayList<>();
        ArrayList<Integer> newList3 = new ArrayList<>(10);
        ArrayList<Integer> newList4 = new ArrayList<>(newList3);


        //Using ArrayList
        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);     //This works because we didn't specify ArrayList's type
        list.add(Boolean.FALSE);    //This works because we didn't specify ArrayList's type
        list.add(9);                //This works because we didn't specify ArrayList's type
        System.out.println(list);


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Rahid");
//        stringArrayList.add(8);                 //This doesn't work because we didn't specify ArrayList's type
//        stringArrayList.add(Boolean.TRUE);      //This doesn't work because we didn't specify ArrayList's type
        System.out.println(stringArrayList);

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1, "robin"); //h,r
        birds.add(0, "blue jay");//b,h,r
        birds.add(1, "cardinal");//b,c,h,r
        System.out.println(birds);

        //It's possible to assign add() methods return type(it's always true) to some boolean type variable:
        boolean test = birds.add("Some bird");
        System.out.println(test);
        System.out.println(birds);

//        test = birds.add(2, "test value"); // it's not possible because this add methods signature is not type of boolean!

        //romeve() method
        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk");
        birds2.add("robin");
        System.out.println(birds2.remove("hawk")); //true
        System.out.println(birds2.remove("cardinal")); //false
        System.out.println(birds2.remove(0)); //robin, because hawk has already been deleted
        System.out.println(birds2);
//        System.out.println(birds2.remove(0)); // will raise error because out List is already empty



//        set()
//        The set() method changes one of the elements of the ArrayList without changing the size.
        List<String> birds3 = new ArrayList<>();
        birds3.add("hawk");
        System.out.println(birds3 + " -> " + birds3.size());  // 1
        birds3.set(0, "robin");
        System.out.println(birds3 + " -> " + birds3.size()); // 1
        birds3.set(1, "cardinal"); // IndexOutOfBoundsException

    }
}
