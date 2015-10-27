package arra;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by tenghuanhe on 2015/10/16.
 *
 * @author Tenghuan He
 * @version 0.01
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;


    public Employee() {
        this.name = "";
        this.salary = 0;
        this.hireDay = new Date();
    }

    public Employee(String n, double s, int year, int month, int day) {
        this.name = n;
        this.salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getHireDay() {
        return this.hireDay;
    }

    /**
     * Raises the salary of an employee.
     *
     * @param byPercent the percentage by which to raise the salary (e.g. 10 means 10%)
     */
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public String toString() {
        return "name=" + this.name + ",salary=" + this.salary + ",hireDay=" + this.hireDay;
    }
}
