package Interfaces;

import exceptions.BookingException;

public interface Bookable {
    boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException;
}
