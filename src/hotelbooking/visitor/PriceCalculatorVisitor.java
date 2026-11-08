package hotelbooking.visitor;

import hotelbooking.element.RoomReservation;
import hotelbooking.element.SpaBooking;
import hotelbooking.element.TransferBooking;

public class PriceCalculatorVisitor implements BookingVisitor {
    private double totalPrice;

    @Override
    public void visitRoomReservation(RoomReservation room) {
        totalPrice += room.getNights() * room.getPricePerNight();
    }

    @Override
    public void visitSpaBooking(SpaBooking spa) {
        totalPrice += spa.getSessions() * spa.getPricePerSession();
    }

    @Override
    public void visitTransferBooking(TransferBooking transfer) {
        totalPrice += transfer.getDistanceKm() * transfer.getRatePerKm();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
