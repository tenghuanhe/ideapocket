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

// Java��������������ǲ��ð�ֵ���ã�Ҳ����˵�����õ��������в���ֵ��һ���������ر��ǣ����������޸Ĵ��ݸ������κβ�������������
// ���������ܹ�����������
// 1. �����������ͣ�����/�����ͣ�
// 2. ��������

// һ�������������޸�һ�������������͵Ĳ�����������������Ϊ�����Ͳ�ͬ�ģ����ݹ������൱��ָ�룬���ǲ����޸�ָ�뱾������ָ��Ŀ���
// ��ԭ����ָ��ָ�����ͬһ���ڴ���������������Ȼ���ԶԶ���������޸ģ�����Ҫע�������ָ��Ŀ�����������ָ�뱾�������C/C++
// �����кܴ������ġ���ΪJavaʼ�ն��ǰ�ֵ���ò���ֻ����һ�ַ�ʽ
