public class Main {
    public static void main(String[] args) {
        String [] shoppingList = {"carrots", "potatoes", "onions"};
        System.out.println(shoppingList[0]);
        System.out.println(shoppingList[1]);
        System.out.println(shoppingList[2]);

        shoppingList [0] = "Cherries";
        System.out.println(shoppingList[0]);

        System.out.println(shoppingList.length);

        //creates a new array and creates all items for it
        String[] shoppingList2 = new String [5];
        shoppingList2[0] = "Bananas";
        shoppingList2[1] = "Apples";
        shoppingList2[2] = "Pineapple";
        shoppingList2[3] = "Watermelon";
        shoppingList2[4] = "Kiwi";

        //prints out all items in the array more efficiently than a seperate System.out.println for every item in the array
        for (String item: shoppingList2) {
            System.out.println(item);
        }

        //prints out the length
        System.out.println(shoppingList2.length);
    }
}