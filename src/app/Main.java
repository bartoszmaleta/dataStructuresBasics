package app;

import java.util.Scanner;

public class Main {
    private static GroceryList groceryList = new GroceryList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while (!quit) {
            printMenu();
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch(choice) {
                case 0:
                printMenu();
                break;

                case 1:
                groceryList.printGroceryList();
                break;  

                case 2:
                addItem();
                break;

                case 3:
                removeItem();
                break;

                case 4:
                quit = true;
                break;
            }
        }

    }

    // PRINT MENU
    private static void printMenu() {
        System.out.println("Press");
        System.out.println("0 - to print menu");
        System.out.println("1 - to print groceryList");
        System.out.println("2 - to add item to groceryList");
        System.out.println("3 - to remove item from groceryList");
        System.out.println("4 - to exit application");
    }

    private static void addItem() {
        System.out.println("Please enter the name of the item you want to add: ");
        scanner.nextLine();
        String itemToAdd = scanner.nextLine();
        groceryList.addGroceryItem(itemToAdd);
    }

    private static void removeItem() {
        System.out.println("Please enter the name of the item you want to remove: ");
        int itemNumber = scanner.nextInt();
        groceryList.removeGroceryItem(itemNumber);
    }
}