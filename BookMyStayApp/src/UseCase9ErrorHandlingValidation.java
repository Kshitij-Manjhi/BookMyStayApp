/**
 * Application entry point for UC9
 *
 * This is a Book My Stay App - Error Handling & Validation
 *
 * @author Developer
 * @version 9.0
 */

import java.util.Scanner;

public class UseCase9ErrorHandlingValidation {

    public static void main(String[] args) {

        System.out.println("Booking Validation");

        Scanner scanner = new Scanner(System.in);

        RoomInventory inventory = new RoomInventory();
        ReservationValidator validator = new ReservationValidator();
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        try {
            // Input
            System.out.print("Enter guest name: ");
            String name = scanner.nextLine();

            System.out.print("Enter room type (Single/Double/Suite): ");
            String roomType = scanner.nextLine();

            // Validate
            validator.validate(name, roomType, inventory);

            // If valid → add booking
            Reservation reservation = new Reservation(name, roomType);
            bookingQueue.addRequest(reservation);

            System.out.println("Booking request added successfully!");

        } catch (InvalidBookingException e) {
            System.out.println("Booking failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}