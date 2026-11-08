package hotelbooking.visitor;

import hotelbooking.element.RoomReservation;
import hotelbooking.element.SpaBooking;
import hotelbooking.element.TransferBooking;

public class LoyaltyPointsVisitor implements BookingVisitor {
    private static final int POINTS_PER_NIGHT = 10;
    private static final int POINTS_PER_SESSION = 5;
    private static final double KM_PER_POINT = 10.0;

    private int points;

    @Override
    public void visitRoomReservation(RoomReservation room) {
        points += room.getNights() * POINTS_PER_NIGHT;
    }

    @Override
    public void visitSpaBooking(SpaBooking spa) {
        points += spa.getSessions() * POINTS_PER_SESSION;
    }

    @Override
    public void visitTransferBooking(TransferBooking transfer) {
        points += (int) (transfer.getDistanceKm() / KM_PER_POINT);
    }

    public int getPoints() {
        return points;
    }
}
