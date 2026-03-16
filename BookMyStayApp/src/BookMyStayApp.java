/**
 * Application entry point for UC1
 *
 * This is a Book My Stay App Basic Room Types & Static Availability
 *
 * @author Developer
 * @version 2.0
 */

public class BookMyStayApp {
    public static void main(){

        System.out.println("Hotel Room Initialization\n");
        SingleRoom single = new SingleRoom();
        DoubleRoom dbl = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("Single Room:");

        single.displayRoomDetails(singleAvailable);

        System.out.println("Double Room:");

        dbl.displayRoomDetails(doubleAvailable);

        System.out.println("Suit Room:");

        suite.displayRoomDetails(suiteAvailable);
    }
}