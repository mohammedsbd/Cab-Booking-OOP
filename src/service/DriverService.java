package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
package service;

import dao.DriverDAO;
import model.Driver;
import util.FileLogger;

import java.util.List;

public class DriverService {
    private final DriverDAO driverDAO = new DriverDAO();

    public boolean addDriver(String name, String phone, String vehicleNo) {
        Driver driver = new Driver(name, phone, vehicleNo);
        boolean success = driverDAO.addDriver(driver);
        if (success) {
            FileLogger.log("Added new driver: " + driver.getName() + " (ID: " + driver.getId() + ")");
        }
        return success;
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public List<Driver> getAvailableDrivers() {
        return driverDAO.getAvailableDrivers();
    }

    public boolean updateDriverStatus(int driverId, String status) {
        boolean success = driverDAO.updateDriverStatus(driverId, status);
        if (success) {
            FileLogger.log("Updated driver ID " + driverId + " status to " + status);
        }
        return success;
    }
}
