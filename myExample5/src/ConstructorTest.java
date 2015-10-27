import java.util.Random;

/**
 * Created by tenghuanhe on 2015/10/16.
 */
public class ConstructorTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
    }
}

class Employee {
    private static int nextId = 1;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(1000);
    }

    private int id;
    private String name = "";
    private double salary;

    {
        id = nextId;
        nextId++;
    }

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
    }

    public Employee(double s) {
        this("Employee #" + nextId, s);
    }

    public Employee() {
        // name initialized to ""
        // salary initialized to 0
        // id initialized in initialization block
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }


}