package basic;

import java.util.*;

public class MergeTwoList {
    public void  twoList(){
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(9);
        list2.add(3);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        LinkedList<Integer> merge = new LinkedList<>();
        merge.addAll(list1);
        merge.addAll(list2);
        Collections.sort(merge);
        System.out.println(merge);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(4);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(3);

        ArrayList<Integer> merge2 = new ArrayList<>();
        merge2.addAll(list3);
        merge2.addAll(list4);
        Collections.sort(merge2);
        System.out.println(merge2);
    }
    public static void main(String[] args) {
        MergeTwoList test = new MergeTwoList();
        test.twoList();
    }
}
