package hotelbooking.element;

import hotelbooking.visitor.BookingVisitor;

public class RoomReservation implements BookingItem {
    private final String roomType;
    private final int nights;
    private final double pricePerNight;

    public RoomReservation(String roomType, int nights, double pricePerNight) {
        this.roomType = roomType;
        this.nights = nights;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public void accept(BookingVisitor visitor) {
        visitor.visitRoomReservation(this);
    }
}
