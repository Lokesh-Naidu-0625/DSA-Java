package Main.Core_Java;

import java.util.HashSet;

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






    }
}
