package compare;

import java.util.Arrays;

/**
 * Created by tenghuanhe on 2015/10/18.
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tenghuan", 210000, 2016, 9, 9);
        staff[1] = new Employee("Tenghuan", 170000, 2016, 9, 9);
        staff[2] = new Employee("Tenghuan", 190000, 2016, 9, 9);

        Arrays.sort(staff);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());


        Comparable x;
        x = new Employee("Tenghuan", 400000, 2020, 9, 9);
        if (x instanceof Comparable)
            System.out.println(x.toString() + ", implements Comparable.");
    }
}

// 接口中所有的方法都被自动设置public，接口中所有的域都被自动设置为public static final
