package model;

import abstracts.Person;

public class Booking extends Person {
    private int bookingId;
    private int customerId;
    private Integer driverId; // nullable
    private String pickupLocation;
    private String dropLocation;
    private String status;

    // Constructor for fetching from DB
    public Booking(int bookingId, int customerId, Integer driverId, String pickupLocation, String dropLocation, String status) {
        super("N/A", "N/A"); // Dummy values for Person's name and phone
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.driverId = driverId;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = status;
    }

    // Constructor for creating new bookings
    public Booking(int customerId, Integer driverId, String pickupLocation, String dropLocation, String status) {
        super("N/A", "N/A"); // Dummy values for Person's name and phone
        this.customerId = customerId;
        this.driverId = driverId;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = status;
    }

    // Implement abstract method from Person
    @Override
    public void displayInfo() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Driver ID: " + driverId);
        System.out.println("Pickup: " + pickupLocation);
        System.out.println("Drop: " + dropLocation);
        System.out.println("Status: " + status);
    }

    // Getters and setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
package model;

import abstracts.Person;

public class Booking extends Person {
    private int bookingId;
    private int customerId;
    private Integer driverId; // nullable
    private String pickupLocation;
    private String dropLocation;
    private String status;

    // Constructor for fetching from DB
    public Booking(int bookingId, int customerId, Integer driverId, String pickupLocation, String dropLocation, String status) {
        super("N/A", "N/A"); // Dummy values for Person's name and phone
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.driverId = driverId;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = status;
    }

    // Constructor for creating new bookings
    public Booking(int customerId, Integer driverId, String pickupLocation, String dropLocation, String status) {
        super("N/A", "N/A"); // Dummy values for Person's name and phone
        this.customerId = customerId;
        this.driverId = driverId;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = status;
    }

    // Implement abstract method from Person
    @Override
    public void displayInfo() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Driver ID: " + driverId);
        System.out.println("Pickup: " + pickupLocation);
        System.out.println("Drop: " + dropLocation);
        System.out.println("Status: " + status);
    }

    // Getters and setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
