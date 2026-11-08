package hotelbooking;

import hotelbooking.element.RoomReservation;
import hotelbooking.element.SpaBooking;
import hotelbooking.element.TransferBooking;
import hotelbooking.structure.Reservation;
import hotelbooking.visitor.InvoiceVisitor;
import hotelbooking.visitor.LoyaltyPointsVisitor;
import hotelbooking.visitor.PriceCalculatorVisitor;

public class Main {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("Aigerim");
        reservation.addItem(new RoomReservation("Deluxe", 3, 120.0));
        reservation.addItem(new SpaBooking("Massage", 2, 45.0));
        reservation.addItem(new TransferBooking("Airport", 25.0, 1.2));

        InvoiceVisitor invoiceVisitor = new InvoiceVisitor();
        reservation.traverse(invoiceVisitor);
        System.out.println("Guest: " + reservation.getGuestName());
        System.out.print(invoiceVisitor.getInvoice());

        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();
        reservation.traverse(priceVisitor);
        System.out.printf("Total price: %.2f%n", priceVisitor.getTotalPrice());

        LoyaltyPointsVisitor pointsVisitor = new LoyaltyPointsVisitor();
        reservation.traverse(pointsVisitor);
        System.out.println("Loyalty points: " + pointsVisitor.getPoints());
    }
}
