/**
 * Created by tenghuanhe on 2015/10/17.
 */
package inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());

        // 一个对象变量可以指示多种实际类型的现象称为多态
        // 在运行时能够自动选择调用哪个方法的现象称为动态绑定
        // 在Java中不需要将方法声明为虚方法，动态绑定是默认的处理方式。
        // 如果不希望某个方法具有虚拟特征，可以将它标记为final
        // Java不支持多继承，类似功能的实现方式是接口（interface）

        // 在Java中，对象变量是多态的，一个Employee变量既可以引用Employee类对象，也可以引用Manager类对象
        // 子类可以置换超类，但是反过来超类不能置换子类
        // 超类的私有方法不可访问

        // 如果调用的是private, static, final方法或者构造器，那么编译器可以准确的知道应该调用哪个方法，这种调用方式叫做静态绑定
        // 与之对应的便是，调用方法依赖于隐式参数的实际类型，并且在运行时动态绑定。

        // 注意：返回类型不是方法签名的一部分

        // 虚拟机会预先为每个类创建一个方法表，method，其中列出了所有方法的签名和实际调用的方法，这样一来在真正调用方法的时候，虚拟机仅查找
        // 这个表就可以了

        // final方法不可以被子类覆盖，也就是说不允许子类实现这个方法
        // 如果一个类被声明为final，那么其中所有的方法都是final的，但是field域并不会称为final

        // 如果一个方法没有被覆盖而且很短，那么编译器就能够对其进行优化处理，这个过程称为内联inlining。例如内联调用e.getName()将被替换为访问
        // e.name域

        // 进行类型转换的唯一原因：在暂时忽略了对象的实际类型之后，使用对象的全部功能。

        // 只能在继承层次之内进行转换
        // 在将超类转换为子类之前，应该使用instanceof进行类型检查
        // 只要没有捕获ClassCastException异常，程序就会终止执行。一般情况下应该尽量少使用类型转换和instanceof运算符
        /**
         * if (staff[1] instanceof Manager)
         * {
         *     Manager boss = (Manager) staff[1]
         * }
         */

    }
}