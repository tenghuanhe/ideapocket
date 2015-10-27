import java.text.NumberFormat;
import java.util.Date;

/**
 * Created by tenghuanhe on 2015/10/16.
 */
public class EmployeeTest {
    public static void main(String[] args) {
    }
}

class Employee {

    public static final double PII = 3.1415926; // 静态常量，所有的对象共享这个常量
    private static int nextId = 1;  // 静态域， 那么这个nextId域在整个类中只有一个
    public final double PIII = 3.1415;  // 只是类的一个实例域，每个对象实例化的时候都会有自己的一份拷贝
    private String name;
    private double salary;
    private Date birthday;
    private int id;

    public Employee(String n, double s, Date b) {

        this.name = n;
        this.salary = s;
        this.birthday = b;
    }

    public static int getNextId() {
        return nextId;
        // 这个是一个静态方法，静态不对对象本身进行操作，可以认为静态方法是没有this参数的方法。
        // 因为静态方法不能操作对象，所以不能在静态方法中访问实例域，但是静态方法可以访问自身类中的静态域。


        // 注意：任何对象都可以调用静态方法，比如harry是Employee对象，可以用harry.getNextId()代替Employee.getNextId()
        // 不过这样很容易造成混淆，因为getNextId计算的结果与对象harry毫无关系

        //在下面两种情况下使用静态方法
        // 1。 一个方法不需要访问对象的状态（也就是类的实例域），它所需要的参数都是通过显式参数提供的比如Math.pow(x, a).
        // 2. 一方法只需要访问类的静态域

        // 3. 静态方法还有一种常见的用途。NumberFormat类使用工厂方法产生不同风格的格式对象。
//        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
//        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
//        double x = 0.1;
//        System.out.println(currencyFormatter.format(x));    print $0.10
//        System.out.println(percentFormatter.format(x));     print 10%
    }

    public String getName() {
        System.out.println();   // out变量在System中被定义为final static PrintStream，不允许其他PrintStream赋值给它
        // 但是System类中有一个setOut方法，它可以将System.out设置为不同的流，至于为什么这个方法
        // 可以修改final变量的值，原因在于setOut方法是一个本地方法，而不是用Java语言实现的。本地
        // 方法可以绕过Java语言的存取控制机制。
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getBirthday() {
        return (Date) this.birthday.clone();

        // 根据经验可以知道，如果需要返回一个可变数据域的拷贝，就应该使用clone
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public boolean equals(Employee other) {
        return name.equals(other.name);
    }   // 一个方法可以访问所属类的所有对象的私有数据！！这个确实挺奇怪的


}

// Java构造器的工作方式是一样的。但是要记住所有的Java对性爱那个都是在堆中构造的，构造器总是伴随着new操作符一起使用。
// final修饰符大都用于基本类型域，或者不可变类的域。
// 如果修饰的可变的类的话，使用final修饰符可能会读者造成混乱 private final Date hiredate;仅仅意味着存储在
// hiredate变量中的对象引用在对象构造之后不能被改变，而并不意味着hiredate对象是一个常量。任何方法都可以对hiredate
// 引用的对象调用setTime更改器

// static的含义：属于类且不属于对象的变量和函数
