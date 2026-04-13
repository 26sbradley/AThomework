public class Main {
    public static void main(String[] args) {

        //Part A
        System.out.println("Employee");
        Employee emp = new Employee("Jack", 50000);
        emp.displayInfo();

        System.out.println("\n Manager");
        Manager mgr = new Manager("Bob", 70000, 10000);
        mgr.displayInfo();

        System.out.println("\n Executive ");
        Executive exec = new Executive("Deric", 120000, 30000, 500);
        exec.displayInfo();

        // Part B
        System.out.println("\n Sensor is abstract (no instantiation needed)");
    }
}