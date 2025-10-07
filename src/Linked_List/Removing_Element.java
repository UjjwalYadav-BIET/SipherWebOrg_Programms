package Linked_List;

import java.util.LinkedList;

public class Removing_Element {
    public static void main(String[] args) {
        // We declare the Linked list of the string type.
        LinkedList<String> l = new LinkedList<>();

        // Now we start adding element in the linkedList
        l.add("Ujjwal");
        l.add("Umang");
        l.add("Sadhana");
        l.add("Ram Chandra");
        l.add("Kamla Devi");

        System.out.println(l);

        l.remove(1);
        l.remove(0);
        System.out.println(l);
    }

}
