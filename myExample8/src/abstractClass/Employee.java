package abstractClass;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by tenghuanhe on 2015/10/17.
 */
public class Employee extends Person {
    private Date hireDate;
    private double salary;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        this.hireDate = calendar.getTime();

    }

    public double getSalary() {
        return this.salary;
    }

    public Date getHireDate() {
        return this.hireDate;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of %.2f", this.salary);
    }

    @Override
    public boolean equals(Object otherObject) {
//        if (!super.equals(otherObject)) return false;
        if (this == otherObject) return true;
        if (otherObject == null) return false;

        if (this.getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;
        /*return this.getName().equals(((Employee) otherObject).getName())
                && this.salary == other.salary
                && this.hireDate == other.hireDate;*/
        System.out.println(Objects.equals(this.getName(), other.getName()));
        System.out.println(this.salary);
        System.out.println(other.salary);
        System.out.println(Objects.equals(this.getHireDate(), other.getHireDate()));
        return Objects.equals(this.getName(), other.getName())
                && this.salary == other.salary
                && Objects.equals(this.getHireDate(), other.getHireDate());
    }

    @Override
    public int hashCode() {
//        return 7 * getName().hashCode()
//                + 11 * new Double(salary).hashCode()
//                + 13 * hireDate.hashCode();

        return Objects.hash(getName(), salary, hireDate);
    }
}
