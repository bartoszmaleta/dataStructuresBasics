package app;

import java.util.ArrayList;
// import java.util.List;

public class CreateMyFirstArrayList {
    public static void main(String[] args) {
        //Create ArrayList
        ArrayList<String> animals = new ArrayList<>();

        //Add
        animals.add("Lion");
        System.out.println(animals);
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        animals.add(2, "Bird");
        System.out.println(animals);

        ArrayList<Integer> firstArrayWithNumbers = new ArrayList<>();
        firstArrayWithNumbers.add(1);
        firstArrayWithNumbers.add(3234);
        ArrayList<Integer> secondArrayListWithNumbers = new ArrayList<>(firstArrayWithNumbers);
        
        System.out.println("firstArray = " + firstArrayWithNumbers);
        System.out.println("secondArray = " + secondArrayListWithNumbers);

        secondArrayListWithNumbers.add(3);
        System.out.println("firstArray = " + firstArrayWithNumbers);
        System.out.println("secondArray = " + secondArrayListWithNumbers);

        firstArrayWithNumbers.remove(0);
        System.out.println("After removing");
        System.out.println("firstArray = " + firstArrayWithNumbers);
        System.out.println("secondArray = " + secondArrayListWithNumbers);


        // Iterating
        for (int i = 0; i < secondArrayListWithNumbers.size(); i++) {
            System.out.print(secondArrayListWithNumbers.get(i) + " ");
        }

        // Third ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Stevie");
        names.add("Bill");

        // Finding the index of element!
        System.out.println();
        System.out.println("Finding index of John = " + names.indexOf("John"));

        // Convert ArrayList to Array
        String[] namesArray = names.toArray(new String[names.size()]);
    }
}