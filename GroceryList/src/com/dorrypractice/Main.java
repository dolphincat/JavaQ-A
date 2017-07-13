package com.dorrypractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static GroceryList list = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); //to clear the input buffer

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    list.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        list.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Please enter the item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        list.modifyGroceryItem(itemNo - 1, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        list.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(list.findItem(searchItem) != null){
            System.out.println("Found "+searchItem + " in our grocery list!");
        }else{
            System.out.println(searchItem+" is not in the shopping list");
        }
    }

    public void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(list.getGroceryList())
    }




}