package inheritance;

/**
 * Created by tenghuanhe on 2015/10/17.
 */
public class Manager extends Employee {
    private double bonus;

    /**
     * @param n     the employee's name
     * @param s     the employee's salary
     * @param year  the hire year
     * @param month the hire month
     * @param day   the hire day
     */
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;
    }

    public void setBonus(double b) {
        this.bonus = b;
    }
}
