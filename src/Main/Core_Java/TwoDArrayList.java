package Main.Core_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDArrayList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(10, 20, 30));
        list.add(Arrays.asList(40, 50, 60));
        list.add(Arrays.asList(70, 80, 90));


        System.out.println(list);

        list.get(0).add(10);
        List<Integer> lst1 = list.get(1);
        System.out.println(lst1);

//        Creating an empty 2D ArrayList with n rows
        List<List<Integer>> graph = new ArrayList<>(5);

//        means:
//
//[
// [],
// [],
// [],
// [],
// []
//]
//
//❌ Wrong.
//
//It only creates an ArrayList with capacity 5.
//
//It is still:
//
//[]


        List<Integer> lst2 = new ArrayList<>(Arrays.asList(80,90));
        System.out.println(list.contains(lst2));


//        Inner size
        System.out.println(list.get(0).size());

//        Traversing a 2D ArrayList
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.get(i).size(); j++) {

                System.out.println(list.get(i).get(j));

            }
        }

//        enhanced for loop
        for (List<Integer> row : list) {

            for (Integer value : row) {

                System.out.println(value);

            }
        }

//        set() — changing an existing value
//  syntax list.get(row).set(column, value);
        list.get(1).set(1, 500);

//        remove()
        list.get(0).remove(1);

//        Removing an entire row

        list.remove(0);

//        add(index, value)
        list.get(0).add(1, 99);

//        isEmpty()
        System.out.println(list.isEmpty());
        System.out.println(list.get(0).isEmpty());

//        clear()
        list.get(0).clear();
        list.clear();
    }
}
