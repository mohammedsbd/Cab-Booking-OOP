package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
package service;

import dao.BookingDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import Interfaces.Bookable;
import model.Booking;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class BookingService implements Bookable {

    private final BookingDAO bookingDAO = new BookingDAO();
    private final DriverDAO driverDAO = new DriverDAO();

    @Override
    public boolean bookCab(int customerId, String pickupLocation, String dropLocation) throws BookingException {
        List<Driver> availableDrivers = driverDAO.getAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            FileLogger.log("Booking failed: No drivers available for CustomerID=" + customerId);
            throw new BookingException("No drivers available at the moment.");
        }

        Driver assignedDriver = availableDrivers.get(0);

        // ✅ Use correct constructor with driverId, pickup, drop, status
        Booking booking = new Booking(customerId, assignedDriver.getId(), pickupLocation, dropLocation, "Pending");

        boolean created = bookingDAO.addBooking(booking);
        if (!created) {
            FileLogger.log("Booking failed: DB insert error for CustomerID=" + customerId);
            throw new BookingException("Booking could not be created.");
        }

        // Update driver status
        driverDAO.updateDriverStatus(assignedDriver.getId(), "On Trip");

        FileLogger.log("Booking created: BookingID=" + booking.getBookingId() +
                ", CustomerID=" + customerId +
                ", DriverID=" + assignedDriver.getId());

        return true;
    }

    // Overloaded method (polymorphism)
    public boolean bookCab(int customerId, String pickupLocation) throws BookingException {
        return bookCab(customerId, pickupLocation, "Not Specified");
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}
