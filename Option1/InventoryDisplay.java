package Option1;

import java.util.Map;

public class InventoryDisplay {

    public void displayInventory(Map<String, Integer> inventory) {
        System.out.println("Inventory:");
        for (String item : inventory.keySet()) {
            System.out.println(item + ": " + inventory.get(item));
        }
    }
}
