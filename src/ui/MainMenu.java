package ui;

import dao.CustomerDAO;
import dao.DriverDAO;
import exceptions.BookingException;
import model.Customer;
import model.Driver;
import service.BookingService;

import java.util.List;
import java.util.Scanner;

public class MainMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static CustomerDAO customerDAO = new CustomerDAO();
    private static DriverDAO driverDAO = new DriverDAO();
    private static BookingService bookingService = new BookingService();

    public static void showMenu() {
        while (true) {
            System.out.println("\n=== Cab Booking System ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Driver");
            System.out.println("3. Show All Customers");
            System.out.println("4. Show Available Drivers");
            System.out.println("5. Book a Cab");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    addDriver();
                    break;
                case 3:
                    showCustomers();
                    break;
                case 4:
                    showAvailableDrivers();
                    break;
                case 5:
                    bookCab();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer phone: ");
        String phone = scanner.nextLine();

        Customer customer = new Customer(name, phone);
        if (customerDAO.addCustomer(customer)) {
            System.out.println("Customer added with ID: " + customer.getId());
        } else {
            System.out.println("Failed to add customer.");
        }
    }

    private static void addDriver() {
        System.out.print("Enter driver name: ");
        String name = scanner.nextLine();
        System.out.print("Enter driver phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter vehicle number: ");
        String vehicleNo = scanner.nextLine();

        Driver driver = new Driver(name, phone, vehicleNo);
        if (driverDAO.addDriver(driver)) {
            System.out.println("Driver added with ID: " + driver.getId());
        } else {
            System.out.println("Failed to add driver.");
        }
    }

    private static void showCustomers() {
        List<Customer> customers = customerDAO.getAllCustomers();
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }
        for (Customer c : customers) {
            c.displayInfo();
        }
    }

    private static void showAvailableDrivers() {
        List<Driver> drivers = driverDAO.getAvailableDrivers();
        if (drivers.isEmpty()) {
            System.out.println("No available drivers.");
            return;
        }
        for (Driver d : drivers) {
            d.displayInfo();
        }
    }

    private static void bookCab() {
        try {
            System.out.print("Enter customer ID: ");
            int customerId = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter pickup location: ");
            String pickup = scanner.nextLine();
            System.out.print("Enter drop location: ");
            String drop = scanner.nextLine();

            boolean booked = bookingService.bookCab(customerId, pickup, drop);
            if (booked) {
                System.out.println("Cab booked successfully!");
            } else {
                System.out.println("Failed to book cab.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for customer ID.");
        } catch (BookingException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
