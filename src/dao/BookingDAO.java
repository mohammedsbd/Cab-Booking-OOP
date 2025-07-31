
package dao;

import model.Booking;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingDAO {

    public boolean addBooking(Booking booking) {
        String sql = "INSERT INTO bookings (customer_id, driver_id, pickup_location, drop_location, status) VALUES (?, ?, ?, ?, ?)";

        // Get a new connection every time
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setInt(1, booking.getCustomerId());

            if (booking.getDriverId() != null) {
                stmt.setInt(2, booking.getDriverId());
            } else {
                stmt.setNull(2, Types.INTEGER);
            }

            stmt.setString(3, booking.getPickupLocation());
            stmt.setString(4, booking.getDropLocation());
            stmt.setString(5, booking.getStatus());

            int rows = stmt.executeUpdate();

            if (rows > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        booking.setBookingId(rs.getInt(1));
                    }
                }
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList<>();
        String sql = "SELECT * FROM bookings";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Integer driverId = rs.getObject("driver_id") != null ? rs.getInt("driver_id") : null;

                Booking b = new Booking(
                        rs.getInt("booking_id"),
                        rs.getInt("customer_id"),
                        driverId,
                        rs.getString("pickup_location"),
                        rs.getString("drop_location"),
                        rs.getString("status")
                );
                bookings.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bookings;
    }
}

