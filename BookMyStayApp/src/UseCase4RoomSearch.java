/**
 * Application entry point for UC1
 *
 * This is a Book My Stay App - Room Search & Availability Check
 *
 * @author Developer
 * @version 4.0
 */

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Room objects
        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Search service
        RoomSearchService searchService = new RoomSearchService();

        // Perform search
        searchService.searchAvailableRooms(inventory, single, dbl, suite);
    }
}