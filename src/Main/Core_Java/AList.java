package Main.Core_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AList {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

//        ADDING ELEMENTS
        lst.add(48);
        lst.add(28);
        lst.add(39);
        lst.addFirst(44);
        lst.addLast(11);
        System.out.println(lst);


//        ADD AT A PARTICULAR INDEX

        lst.add(2,33);
        System.out.println(lst);



//       ACCESSING ELEMENTS
//        accessing elements via index lst.get.(index)
        int val = lst.get(2);

//        accessing index via value lst.indexOf(object value)
        int ind = lst.indexOf(33);

        System.out.println(val + " "+ ind);


//     UPDATING ELEMENTS
        lst.set(1,100);



//      REMOVING ELEMENTS
//        1. by the index
        lst.remove(1);
//        2. by the object
        lst.remove(Integer.valueOf(33));
//        converts 33 into an Integer object.
//So Java chooses the remove(Object) version of remove()
// and searches for the value 33



//        FINDING THE SIZE OF THE ARRAY LIST
        System.out.println(lst.size());


//        SEARCHING
//        check whether an element exists or not
        lst.contains(29);
//        find the index
        lst.indexOf(33);
//         last occurance
        lst.lastIndexOf(44);



//        ITERATING THROUGH LIST
        for (int value : lst) {
            System.out.println(value);
        }


//          SORTING
//        ascending order
        Collections.sort(lst);
//        descending order
        Collections.sort(lst, Collections.reverseOrder());


//        CONVERTING ARRAY <--> ARRAYLIST
//        array -> arraylist
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(10,20,30));

//        arraylist -> array
        Integer[] arr = lst.toArray(new Integer[0]);




//        2D-ARRAY_LIST
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());

        matrix.get(0).add(10);
        matrix.get(0).add(20);

        matrix.get(1).add(30);
        matrix.get(1).add(40);

        System.out.println(matrix);
    }
}
