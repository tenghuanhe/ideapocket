package equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by tenghuanhe on 2015/10/17.
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireDay = calendar.getTime();
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

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;
        return Objects.equals(this.name, other.name)
                && this.salary == other.salary
                && Objects.equals(this.hireDay, other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.salary, this.hireDay);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + this.name + ", salary=" + this.salary + ", hireDay=" + this.hireDay + "]";
    }
}
