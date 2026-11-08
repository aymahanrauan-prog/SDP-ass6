package hotelbooking.element;

import hotelbooking.visitor.BookingVisitor;

public class TransferBooking implements BookingItem {
    private final String destination;
    private final double distanceKm;
    private final double ratePerKm;

    public TransferBooking(String destination, double distanceKm, double ratePerKm) {
        this.destination = destination;
        this.distanceKm = distanceKm;
        this.ratePerKm = ratePerKm;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    @Override
    public void accept(BookingVisitor visitor) {
        visitor.visitTransferBooking(this);
    }
}
