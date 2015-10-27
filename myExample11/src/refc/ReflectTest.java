package refc;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Created by tenghuanhe on 2015/10/18.
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Date d = new Date();
        Class cl1 = d.getClass();
        System.out.println(cl1.toString());
        System.out.println(cl1.toGenericString());

        String className = "java.util.Date";
        Class cl2 = Class.forName(className);
        System.out.println(cl1 == cl2);

        Class cl3 = Date.class;
        System.out.println(cl1 == cl3);

        System.out.println(Double[].class.getName());
        System.out.println(Double.class.getName());
        System.out.println(int.class.getName());
        System.out.println(int[].class.getName());

        Employee e = new Employee("Tenghuan He", 15000, 1993, 9, 23);
        if (e.getClass() == Employee.class) {
            Employee f = e.getClass().newInstance();
            System.out.println(f);
        }

        System.out.println(e);

        String s = "java.util.Date";
        Object m = Class.forName(s).newInstance();
        System.out.println(m);
        System.out.println(m.getClass().getName());

        // 按照这种方式只能调用默认构造器即没有参数的构造器来初始化创建对象
        // 如果想要按照这种方式向希望按名称创建的类的构造器提供参数，则需要使用Constructor类中的newInstance方法

        Employee harry = new Employee("Harry Hacker", 80000, 1989, 10, 1);
        Class cl = harry.getClass();
        Field f1 = cl.getDeclaredField("name");
        f1.setAccessible(true);
        Object v = f1.get(harry);
        System.out.println(v);
        System.out.println(v.getClass().getName());
        f1.set(harry, "Tenghuan");

        Field f2 = cl.getDeclaredField("salary");
        f2.setAccessible(true);
        double dd = f2.getDouble(harry);
        System.out.println(dd);
        f2.set(harry, 100000);


        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

    }
}

// 在启动时，包含main方法的类被加载。它会加载所有需要的类。这些被加载的类又要加载它们需要的类，以此类推
// 还有一种方式是，通过调用class.forName手工地加载其他类

// 获得Class类对象的三种方式
// 1. 根据类的对象getClass()
// 2. 利用Class.forName()
// 3. 如果T是任意的Java类型，T.class将代表匹配的类对象