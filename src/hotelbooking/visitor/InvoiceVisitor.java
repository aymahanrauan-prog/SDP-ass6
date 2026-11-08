package hotelbooking.visitor;

import hotelbooking.element.RoomReservation;
import hotelbooking.element.SpaBooking;
import hotelbooking.element.TransferBooking;

import java.util.Locale;

public class InvoiceVisitor implements BookingVisitor {
    private final StringBuilder invoice = new StringBuilder();

    @Override
    public void visitRoomReservation(RoomReservation room) {
        invoice.append(String.format(Locale.US, "Room %s: %d nights x %.2f%n",
                room.getRoomType(), room.getNights(), room.getPricePerNight()));
    }

    @Override
    public void visitSpaBooking(SpaBooking spa) {
        invoice.append(String.format(Locale.US, "Spa %s: %d sessions x %.2f%n",
                spa.getTreatmentName(), spa.getSessions(), spa.getPricePerSession()));
    }

    @Override
    public void visitTransferBooking(TransferBooking transfer) {
        invoice.append(String.format(Locale.US, "Transfer to %s: %.1f km x %.2f%n",
                transfer.getDestination(), transfer.getDistanceKm(), transfer.getRatePerKm()));
    }

    public String getInvoice() {
        return invoice.toString();
    }
}
