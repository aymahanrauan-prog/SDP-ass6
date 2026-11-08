package hotelbooking.structure;

import hotelbooking.element.BookingItem;
import hotelbooking.visitor.BookingVisitor;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private final String guestName;
    private final List<BookingItem> items = new ArrayList<>();

    public Reservation(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void addItem(BookingItem item) {
        items.add(item);
    }

    public void traverse(BookingVisitor visitor) {
        for (BookingItem item : items) {
            item.accept(visitor);
        }
    }
}
