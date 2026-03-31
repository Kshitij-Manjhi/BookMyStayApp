/**
 * Application entry point for UC12
 *
 * This is a Book My Stay App - Data Persistence & System Recovery
 *
 * @author Developer
 * @version 12.0
 */

import java.util.Scanner;

public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("System Recovery");

        String filePath = "inventory.txt";

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        // Load previous state
        persistenceService.loadInventory(inventory, filePath);

        // Display current inventory
        System.out.println("\nCurrent Inventory:");
        System.out.println("Single: " + inventory.getRoomAvailability().get("Single"));
        System.out.println("Double: " + inventory.getRoomAvailability().get("Double"));
        System.out.println("Suite: " + inventory.getRoomAvailability().get("Suite"));

        // Save current state
        persistenceService.saveInventory(inventory, filePath);
    }
}