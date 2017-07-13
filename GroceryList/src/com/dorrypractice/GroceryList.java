package com.dorrypractice;

import java.util.ArrayList;

/**
 * Created by dolphincat_yue on 3/14/17.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in you list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
    public void mofifyGroceryItem(String currentItem,String newItem){
        //find if the current item exist, then replace it if needed
        int position = findItem(currentItem);
        if (position >=0){
            //pass the item and its position
            modifyGroceryItem(position,newItem);
        }

    }
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position+1)+" has been modified");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position>=0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
    }
   /* public String findItem(String searchItem) {
        //use the contain function
        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }*/
}
