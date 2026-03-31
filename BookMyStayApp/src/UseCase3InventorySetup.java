/**
 * Application entry point for UC1
 *
 * This is a Book My Stay App Centralized Room Inventory Management
 *
 * @author Developer
 * @version 3.1
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Hotel Room Inventory Status\n");

        // Room objects (for properties)
        SingleRoom single = new SingleRoom();
        DoubleRoom dbl = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        // Central inventory
        RoomInventory inventory = new RoomInventory();

        // Fetch availability
        int singleAvailable = inventory.getRoomAvailability().get("Single");
        int doubleAvailable = inventory.getRoomAvailability().get("Double");
        int suiteAvailable = inventory.getRoomAvailability().get("Suite");

        // Display
        System.out.println("Single Room:");
        single.displayRoomDetails(singleAvailable);

        System.out.println("Double Room:");
        dbl.displayRoomDetails(doubleAvailable);

        System.out.println("Suite Room:");
        suite.displayRoomDetails(suiteAvailable);
    }
}