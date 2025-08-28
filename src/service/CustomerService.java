package service;

import dao.CustomerDAO; //import the datbase java file
import model.Customer;
import util.FileLogger;
import java.util.List;

public class CustomerService {
    private final CustomerDAO customerDAO = new CustomerDAO();

    public boolean registerCustomer(String name, String phone) {
        Customer customer = new Customer(name, phone);
        boolean success = customerDAO.addCustomer(customer);
        if (success) {
            FileLogger.log("Registered new customer: " + customer.getName() + " (ID: " + customer.getId() + ")");
        }
        return success;
    }

    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    public Customer getCustomerById(int id) {
        return customerDAO.getCustomerById(id);
    }
}
package service;

import dao.CustomerDAO; //import the datbase java file
import model.Customer;
import util.FileLogger;
import java.util.List;

public class CustomerService {
    private final CustomerDAO customerDAO = new CustomerDAO();

    public boolean registerCustomer(String name, String phone) {
        Customer customer = new Customer(name, phone);
        boolean success = customerDAO.addCustomer(customer);
        if (success) {
            FileLogger.log("Registered new customer: " + customer.getName() + " (ID: " + customer.getId() + ")");
        }
        return success;
    }

    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    public Customer getCustomerById(int id) {
        return customerDAO.getCustomerById(id);
    }
}
