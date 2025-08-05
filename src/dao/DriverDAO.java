package dao;

import model.Driver;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DriverDAO {

    // Add a new driver to the database
    public boolean addDriver(Driver driver) {
        String sql = "INSERT INTO drivers (name, phone, vehicle_no, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

                //These lines set the values for the prepared SQL statement’s placeholders (?, ?, ?, ?).

            stmt.setString(1, driver.getName());
            stmt.setString(2, driver.getPhone());
            stmt.setString(3, driver.getVehicleNo());
            stmt.setString(4, driver.getStatus());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        driver.setId(rs.getInt(1));  // sets driverId in your Driver model
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Get a list of drivers whose status is 'Available'
    public List<Driver> getAvailableDrivers() {
        List<Driver> drivers = new ArrayList<>();
        String sql = "SELECT * FROM drivers WHERE status = 'Available'";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Driver driver = new Driver(
                        rs.getInt("driver_id"),  // match your DB column
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("vehicle_no"),
                        rs.getString("status")
                );
                drivers.add(driver);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return drivers;
    }

    // Update the status of a driver by driver_id
    public boolean updateDriverStatus(int driverId, String status) {
        String sql = "UPDATE drivers SET status = ? WHERE driver_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, status);
            stmt.setInt(2, driverId);

            int updated = stmt.executeUpdate();
            return updated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Get a list of all drivers in the database
    public List<Driver> getAllDrivers() {
        List<Driver> drivers = new ArrayList<>();
        String sql = "SELECT * FROM drivers";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Driver driver = new Driver(
                        rs.getInt("driver_id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("vehicle_no"),
                        rs.getString("status")
                );
                drivers.add(driver);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return drivers;
    }
}
