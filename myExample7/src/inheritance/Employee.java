package inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by tenghuanhe on 2015/10/17.
 */
public class Employee {
    private static int nextId;

    private String name;
    private double salary;
    private Date hireDate;

    public Employee(String n, double s, int year, int month, int day) {
        this.name = n;
        this.salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireDate = calendar.getTime();
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getHireDate() {
        return this.hireDate;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary = this.salary + raise;
    }
}
