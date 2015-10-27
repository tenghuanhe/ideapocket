/**
 * Created by tenghuanhe on 2015/10/17.
 */
package arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl Cracker", 90000, 1986, 10, 1));
        staff.add(new Employee("Harry Hacker", 80000, 1987, 12, 21));
        staff.add(new Employee("Tony Tester", 75000, 1990, 3, 15));

        Employee tenghuan = new Employee("Tenghuan He", 90000, 1993, 9, 23);
        staff.set(1, tenghuan);

        staff.add(tenghuan);
        staff.remove(0);

        for (Employee e : staff)
            e.raiseSalary(5);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
    }
}
