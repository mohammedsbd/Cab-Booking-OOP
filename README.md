# 🚖 Java Cab Booking System

A simple Java-based Cab Booking System using **MySQL** and **JDBC**.  
This **CLI-based application** allows users to register customers and drivers, book rides, and view data — all while applying core **Object-Oriented Programming principles**.

---

## 📦 Database Schema

### 🧾 Customers Table
```sql
CREATE TABLE Customers (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20) NOT NULL,
    password VARCHAR(100) NOT NULL
);
🚗 Drivers Table
sql
Copy
Edit
CREATE TABLE Drivers (
    driver_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    license_number VARCHAR(50) UNIQUE NOT NULL,
    phone VARCHAR(20) NOT NULL,
    vehicle_type VARCHAR(50) NOT NULL,
    vehicle_number VARCHAR(20) UNIQUE NOT NULL,
    is_available BOOLEAN DEFAULT TRUE
);
📘 Bookings Table
sql
Copy
Edit
CREATE TABLE Bookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    driver_id INT NOT NULL,
    pickup_location VARCHAR(255) NOT NULL,
    drop_location VARCHAR(255) NOT NULL,
    booking_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    fare DECIMAL(10, 2) NOT NULL,
    status ENUM('Pending', 'Confirmed', 'Completed', 'Cancelled') DEFAULT 'Pending',
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (driver_id) REFERENCES Drivers(driver_id)
);
✅ Important: Update your DBConnection class in the util package with your MySQL username and password.

🚀 Running the Project
1. 📥 Clone the Repository
bash
Copy
Edit
git clone https://github.com/yourusername/java-cab-booking-system.git
cd java-cab-booking-system
2. 🔧 Compile the Project
Open a terminal and navigate to your src folder. Then compile:

bash
Copy
Edit
javac -d bin src/**/*.java
Or compile directly from App.java if you're using an IDE.

3. ▶️ Run the Application
bash
Copy
Edit
java -cp bin App
Or simply run App.java from your IDE (e.g., IntelliJ or VS Code).

📋 CLI Menu Functionalities
Once the application runs, you will be presented with a CLI menu offering the following features:

🧑‍💼 Add Customer
Register a new customer by providing their name, phone number, and other info.

🚕 Add Driver
Add a new driver by entering their name, phone number, vehicle info, and availability.

👥 Show All Customers
Display a list of all registered customers in the system.

👨‍✈️ Show All Drivers
View all registered drivers and their current availability status.

📲 Book a Cab
Assign an available driver to a customer with pickup and drop-off locations.

❌ Exit
Exit the application safely.

🤝 Team Contributions
Team Member	Contribution Area
Mohammed	Database design, DAO implementations
Segni	Service layer (booking service and customer service)
Nahom	File logger to log successful cab bookings
Aaron	Exception handling, and interface creation
Daniel	Integration and driver service

📄 License
This project is licensed under the MIT License — see the LICENSE file for details.

📫 Contact
Mohammed Salih
📧 Email: mohammed1112ok@gmail.com
🌐 GitHub: github.com/mohammedsbd
