import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Employee;
import models.Manager;

import java.util.List;

public class Runner {


    public static void main(String[] args) {


        Manager manager = new Manager("John", "123", 1000, 9999);
        DBHelper.save(manager);

        Department department = new Department("computers", manager);
//        manager.setDepartment(department);
        DBHelper.save(department);

        Administrator administrator = new Administrator("harry", "123343", 400, manager);
        DBHelper.save(administrator);
        Administrator administrator2 = new Administrator("barry", "12333", 400, manager);
        DBHelper.save(administrator2);
        Administrator administrator3 = new Administrator("larry", "1233473", 400, manager);
        DBHelper.save(administrator3);
        Administrator administrator4 = new Administrator("garry", "123333343", 400, manager);
        DBHelper.save(administrator4);


        List<Employee> result = DBManager.getEmployeesFromManager(manager);

       Department x = manager.getDepartment();


       Department department3 = DBManager.getDepartmentFromManager(manager);





    System.exit(0);
    }
}
