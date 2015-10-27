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

        // �������ַ�ʽֻ�ܵ���Ĭ�Ϲ�������û�в����Ĺ���������ʼ����������
        // �����Ҫ�������ַ�ʽ��ϣ�������ƴ�������Ĺ������ṩ����������Ҫʹ��Constructor���е�newInstance����

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

// ������ʱ������main�������౻���ء��������������Ҫ���ࡣ��Щ�����ص�����Ҫ����������Ҫ���࣬�Դ�����
// ����һ�ַ�ʽ�ǣ�ͨ������class.forName�ֹ��ؼ���������

// ���Class���������ַ�ʽ
// 1. ������Ķ���getClass()
// 2. ����Class.forName()
// 3. ���T�������Java���ͣ�T.class������ƥ��������