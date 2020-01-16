package app;

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListExample {
    public static void main(String[] args) {
        // create LinkedList
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.addLast("C");
        myLinkedList.addFirst("D");

        System.out.println(myLinkedList);

        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add("Gates");
        lastNames.add("Jobs");

        myLinkedList.addAll(lastNames); 
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        
        myLinkedList.remove("Gates");
        System.out.println(myLinkedList);

        boolean status = myLinkedList.contains("Jobs2");

        if (status) {
            System.out.println("myLinkedList have Jobs");
        } else {
            System.out.println("myLinkedList have not Jobs");
        }
        
        String firstElement = myLinkedList.getFirst();
        System.out.println(firstElement);

        // Deleting all elements
        // myLinkedList.clear();
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.indexOf("Jobs"));
    }
}
