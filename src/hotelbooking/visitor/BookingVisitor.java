package hotelbooking.visitor;

import hotelbooking.element.RoomReservation;
import hotelbooking.element.SpaBooking;
import hotelbooking.element.TransferBooking;

public interface BookingVisitor {
    void visitRoomReservation(RoomReservation room);

    void visitSpaBooking(SpaBooking spa);

    void visitTransferBooking(TransferBooking transfer);
}
