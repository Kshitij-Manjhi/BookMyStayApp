/**
 * Application entry point for UC6
 *
 * This is a Book My Stay App - Reservation Confirmation & Room Allocation
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        // Queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Add requests
        bookingQueue.addRequest(new Reservation("Abhi", "Single"));
        bookingQueue.addRequest(new Reservation("Subha", "Single"));
        bookingQueue.addRequest(new Reservation("Vanmathi", "Suite"));

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Allocation service
        RoomAllocationService allocationService = new RoomAllocationService();

        // Process FIFO
        while (bookingQueue.hasPendingRequests()) {
            Reservation r = bookingQueue.getNextRequest();
            allocationService.allocateRoom(r, inventory);
        }
    }
}