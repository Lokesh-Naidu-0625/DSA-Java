package Main.Core_Java;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
    public static void main(String[] args) {
//        Hashset stores only unique values

//        creating a hashset
        HashSet<Integer> set = new HashSet<>();

//        adding elements into the set
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

//        what happens if we add duplicates
        set.add(20);
        System.out.println(set); //still the output remains the same


//        add() function returns boolean
        boolean bol_1= set.add(40);  //if the value is not present it will gives true
        System.out.println(bol_1);

        boolean bol_2 = set.add(20); //here it gives the false
        System.out.println(bol_2);


//        contains() function gives boolean value
        System.out.println(set.contains(30)); //true
        System.out.println(set.contains(50)); //false
//      Searching for an element it takes O(1) time complexity


//        remove() also same as add function
//        it removes the values and also returns the boolean value
        boolean bol_3= set.remove(30);
        boolean bol_4 = set.remove(70);
        System.out.println(bol_4);
        System.out.println(bol_3);



//        size() functions gives us the size of the set
        System.out.println(set.size());
//      if you keep adding duplicates dont think size will increas it will be the same


//        isEmpty() reutrns a boolean
        System.out.println(set.isEmpty());

//        clear() removes everything
//        System.out.println(set.clear());

//        iterator() which is not important to learn
//        better to know

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


//        foreachloop which we usually do

        for(int num:set)
            System.out.println(num);

        System.out.println(set);

//      toarray()
        Object[] arr = set.toArray();
//        or
        Integer[] nums = set.toArray(new Integer[0]);
//        not that important but better you should know


//        containsAll()
//        check whether this set contains all the elements of another set
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(40);
        set2.add(10);

        System.out.println(set.containsAll(set2));

        set2.add(30);
        System.out.println(set.containsAll(set2));

//        addAll()
//        add all elements from another collection
        set.addAll(set2);
        System.out.println(set);

//        removeAll()
//        remove all elements from another collection
//        set.removeAll(set2);

//        retainAll()
//        it keeps only the elements which are common in both
        HashSet<Integer> set3 = new HashSet<>();

        set3.add(20);
        set3.add(40);
        set3.add(10);
        System.out.println(set2);
        set2.retainAll(set3);
        System.out.println(set2);

//        equals()
//        containsAll() asks: "Does A contain everything that B has?"
//        equals() asks: "Are A and B exactly the same set?"
//        order of elements doesnt matter
        System.out.println(set2.equals(set3));
    }
}
