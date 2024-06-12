package Chapter3;

import java.util.ArrayList;

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
    }
}
