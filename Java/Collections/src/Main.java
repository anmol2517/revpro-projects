/*
                  Collection (interface)
                          |
                    List (interface)
             |             |           |
         ArrayList     LinkedList    Vector    >>   these are 3 are class

>> Array is better than ArrayList because everything fixed or memory allocation

>> Collection is insertion order preserved

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Size of al is : " + al.size());

        al.add("Pune");
        al.add("New Delhi");
        al.add("Jammu Kashmir");
        al.add("Chandigarh");

        System.out.println(al);
        System.out.println("After addition size of al is : " + al.size());

        al.remove(2);
        System.out.println("Rest of al is : " + al);

        System.out.println(al.size());
    }
}