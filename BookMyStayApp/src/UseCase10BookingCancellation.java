/**
 * Application entry point for UC10
 *
 * This is a Book My Stay App - Booking Cancellation & Inventory Rollback
 *
 * @author Developer
 * @version 10.0
 */

import java.util.Scanner;

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation");

        RoomInventory inventory = new RoomInventory();
        CancellationService cancellationService = new CancellationService();

        // Simulate confirmed booking
        String reservationId = "Single-1";
        cancellationService.registerBooking(reservationId, "Single");

        // Cancel booking
        cancellationService.cancelBooking(reservationId, inventory);

        // Show rollback history
        cancellationService.showRollbackHistory();

        // Show updated inventory
        System.out.println("\nUpdated Single Room Availability: "
                + inventory.getRoomAvailability().get("Single"));
    }
}