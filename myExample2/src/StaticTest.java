/**
 * Created by tenghuanhe on 2015/10/16.
 */
public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tome", 4000);
        staff[1] = new Employee("Dick", 6000);
        staff[2] = new Employee("Harry", 6500);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
        staff[2].setId();
        int n2 = staff[1].getNextId();
        System.out.println("Next next available id=" + n2);
    }
}

class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        this.id = 0;
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

    public void setId() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}

// Java程序设计语言总是采用按值调用，也就是说方法得到的是所有参数值的一个拷贝，特别是，方法不能修改传递给他的任何参数变量的内容
// 方法参数总共有两种类型
// 1. 基本数据类型（数字/布尔型）
// 2. 对象引用

// 一个方法不可能修改一个基本数据类型的参数，而对象引用作为参数就不同的，传递过来的相当于指针，我们不能修改指针本身，但是指针的拷贝
// 和原来的指针指向的是同一块内存区域，所以我们仍然可以对对象本身进行修改，但是要注意的是是指针的拷贝，而不是指针本身，这个和C/C++
// 还是有很大的区别的。因为Java始终都是按值调用并且只有这一种方式
