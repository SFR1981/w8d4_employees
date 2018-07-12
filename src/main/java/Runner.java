import db.DBHelper;
import models.Administrator;
import models.Department;
import models.Manager;

public class Runner {


    public static void main(String[] args) {


        Manager manager = new Manager("John", "123", 1000, 9999);

        Department department = new Department("computers", manager);
        manager.setDepartment(department);
        DBHelper.save(department);
        DBHelper.save(manager);
        Administrator administrator = new Administrator("harry", "123343", 400, manager);
        DBHelper.save(administrator);
        Administrator administrator2 = new Administrator("barry", "12333", 400, manager);
        DBHelper.save(administrator2);
        Administrator administrator3 = new Administrator("larry", "1233473", 400, manager);
        DBHelper.save(administrator3);
        Administrator administrator4 = new Administrator("garry", "123333343", 400, manager);
        DBHelper.save(administrator4);





    System.exit(0);
    }
}
