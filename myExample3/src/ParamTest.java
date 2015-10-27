import java.util.Random;

/**
 * Created by tenghuanhe on 2015/10/16.
 */
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripleValue:");

        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);


        System.out.println("\nTesting tripleSalary:");
        Employee harry = new Employee("Harry", 5000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        System.out.println("\nTesting swap:");
        Employee a = new Employee("Alice", 7000);
        Employee b = new Employee("Bob", 6000);

        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());

    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary" + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Employee {
    private static int nextId = 1;

    // 对静态域进行初始化的时候，可以直接在声明中进行初始化
    // 如果静态域的初始化比较复杂，还可以使用静态化的初始化块
    // 就像下面这样

    // 在类进行第一次加载的时候，会进行静态域的初始化。与实例域一样，除非显式地设置为其他值，默认的值为0，null或者false
    static {
        Random generator = new Random();
        nextId = generator.nextInt(1000);
    }


    private String name;
    private double salary;
    private int id;
    // private int id = 0; 可以类定义中直接将一个值赋给任何field域
    // 这样将会在执行构造器之前进行
    // private int id = assignId(); 甚至初始值可以不是常量

    // object initialization block
    {
        // 可以在这里进行初始化

        // 初始化数据域的过程
        // 1. 首先所有的数据域被初始化为默认值（0，false或者null
        // 2. 按照在类中声明出现的次序，依次执行所有域的初始化语句和初始化块
        // 3. 如果构造器第一行调用了第二个构造器，则执行第二个构造器的主体
        // 4. 执行构造器的主体
    }

    public Employee() {
        this.name = "";
        this.salary = 0;
        this.id = 0;

        // 只有类没有提供任何构造器的时候，系统才会提供一个默认的构造器
    }

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        this.id = 0;
    }

    public Employee(double s) {
        this("Employee #" + nextId, s);
        nextId++;
    }

    private static int assignId() {
        int r = nextId;
        nextId++;
        return r;
    }

    public static int getNextId() {
        return nextId;
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

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100.0;
        this.salary = this.salary + raise;
    }
}