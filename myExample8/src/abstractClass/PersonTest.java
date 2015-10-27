package abstractClass;

/**
 * Created by tenghuanhe on 2015/10/17.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Harry Hacker", 80000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());

        Object obj = new Employee("He Treng", 10000, 1993, 9, 23);
        Person pers = new Employee("He Treng", 10000, 1993, 9, 23);
        Employee e = (Employee) obj;
        ((Employee) obj).getDescription();
        e.getDescription();

        System.out.println(e);
        System.out.println(obj);
        System.out.println(pers);
        System.out.println(e.toString());
        System.out.println(obj.toString());
        System.out.println(pers.toString());


        System.out.println(e.getClass().toString());
        System.out.println(obj.getClass().toString());
        System.out.println(pers.getClass().toString());

//        System.out.println(e.equals(obj));      // return true
//        System.out.println(obj.equals(e));
        System.out.println(pers.equals(e));
        System.out.println(e.equals(pers));

    }
}

// 任何生命为private的域对其他类都是不可见的，这对于子类也完全适用，即子类也不能访问超类的私有域。
// 如果将超类Employee中的hireDate域设为protected,而不是私有的，那么Manager中的方法就可以访问它了
// 但是Manager类中的方法只能访问Manager对象中的hireDate域，而不能访问其他Employee对象中的hireDate域

// 受保护的域要谨慎使用
// 在实际应用中，受保护的方法更有意义，如果要限制某个方法的使用，就可以将它声明为protected，这表明子类
// 受到信任并且可以正确的使用这个方法，而其他类则不行

// Java用于控制可见性的4个修饰符
// private——————仅对本类可见、
// public——————对所有类可见
// protected————对本包和所有子类可见
// 没有修饰符————对本包可见

/**
 * equals应该具有以下性质
 * 1. 自反性
 * 2. 对称性
 * 3. 传递性
 * 4. 一致性
 * 5. x.equals(null) = false
 */