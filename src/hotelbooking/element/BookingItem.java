package hotelbooking.element;

import hotelbooking.visitor.BookingVisitor;

public interface BookingItem {
    void accept(BookingVisitor visitor);
}
