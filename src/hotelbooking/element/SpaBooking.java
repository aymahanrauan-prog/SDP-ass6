package hotelbooking.element;

import hotelbooking.visitor.BookingVisitor;

public class SpaBooking implements BookingItem {
    private final String treatmentName;
    private final int sessions;
    private final double pricePerSession;

    public SpaBooking(String treatmentName, int sessions, double pricePerSession) {
        this.treatmentName = treatmentName;
        this.sessions = sessions;
        this.pricePerSession = pricePerSession;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public int getSessions() {
        return sessions;
    }

    public double getPricePerSession() {
        return pricePerSession;
    }

    @Override
    public void accept(BookingVisitor visitor) {
        visitor.visitSpaBooking(this);
    }
}
