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

    // �Ծ�̬����г�ʼ����ʱ�򣬿���ֱ���������н��г�ʼ��
    // �����̬��ĳ�ʼ���Ƚϸ��ӣ�������ʹ�þ�̬���ĳ�ʼ����
    // ������������

    // ������е�һ�μ��ص�ʱ�򣬻���о�̬��ĳ�ʼ������ʵ����һ����������ʽ������Ϊ����ֵ��Ĭ�ϵ�ֵΪ0��null����false
    static {
        Random generator = new Random();
        nextId = generator.nextInt(1000);
    }


    private String name;
    private double salary;
    private int id;
    // private int id = 0; �����ඨ����ֱ�ӽ�һ��ֵ�����κ�field��
    // ����������ִ�й�����֮ǰ����
    // private int id = assignId(); ������ʼֵ���Բ��ǳ���

    // object initialization block
    {
        // ������������г�ʼ��

        // ��ʼ��������Ĺ���
        // 1. �������е������򱻳�ʼ��ΪĬ��ֵ��0��false����null
        // 2. �����������������ֵĴ�������ִ��������ĳ�ʼ�����ͳ�ʼ����
        // 3. �����������һ�е����˵ڶ�������������ִ�еڶ���������������
        // 4. ִ�й�����������
    }

    public Employee() {
        this.name = "";
        this.salary = 0;
        this.id = 0;

        // ֻ����û���ṩ�κι�������ʱ��ϵͳ�Ż��ṩһ��Ĭ�ϵĹ�����
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