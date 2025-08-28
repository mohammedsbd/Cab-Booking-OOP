package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
package model;

import Interfaces.Displayable;

public class Driver implements Displayable {
    private int id;
    private String name;
    private String phone;
    private String vehicleNo;
    private String status;

    // Constructor without ID (for new driver before DB insert)
    public Driver(String name, String phone, String vehicleNo) {
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = "Available";  // default status
    }

    // Constructor with ID (for retrieving from DB)
    public Driver(int id, String name, String phone, String vehicleNo, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
        this.status = status;
    }

    // Getter and setter for id (missing setter added)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Other getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver ID: " + id + ", Name: " + name + ", Phone: " + phone +
                ", Vehicle: " + vehicleNo + ", Status: " + status);
    }
}
