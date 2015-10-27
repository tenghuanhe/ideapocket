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

    public static final double PII = 3.1415926; // ��̬���������еĶ������������
    private static int nextId = 1;  // ��̬�� ��ô���nextId������������ֻ��һ��
    public final double PIII = 3.1415;  // ֻ�����һ��ʵ����ÿ������ʵ������ʱ�򶼻����Լ���һ�ݿ���
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
        // �����һ����̬��������̬���Զ�������в�����������Ϊ��̬������û��this�����ķ�����
        // ��Ϊ��̬�������ܲ����������Բ����ھ�̬�����з���ʵ���򣬵��Ǿ�̬�������Է����������еľ�̬��


        // ע�⣺�κζ��󶼿��Ե��þ�̬����������harry��Employee���󣬿�����harry.getNextId()����Employee.getNextId()
        // ����������������ɻ�������ΪgetNextId����Ľ�������harry���޹�ϵ

        //���������������ʹ�þ�̬����
        // 1�� һ����������Ҫ���ʶ����״̬��Ҳ�������ʵ���򣩣�������Ҫ�Ĳ�������ͨ����ʽ�����ṩ�ı���Math.pow(x, a).
        // 2. һ����ֻ��Ҫ������ľ�̬��

        // 3. ��̬��������һ�ֳ�������;��NumberFormat��ʹ�ù�������������ͬ���ĸ�ʽ����
//        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
//        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
//        double x = 0.1;
//        System.out.println(currencyFormatter.format(x));    print $0.10
//        System.out.println(percentFormatter.format(x));     print 10%
    }

    public String getName() {
        System.out.println();   // out������System�б�����Ϊfinal static PrintStream������������PrintStream��ֵ����
        // ����System������һ��setOut�����������Խ�System.out����Ϊ��ͬ����������Ϊʲô�������
        // �����޸�final������ֵ��ԭ������setOut������һ�����ط�������������Java����ʵ�ֵġ�����
        // ���������ƹ�Java���ԵĴ�ȡ���ƻ��ơ�
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getBirthday() {
        return (Date) this.birthday.clone();

        // ���ݾ������֪���������Ҫ����һ���ɱ�������Ŀ�������Ӧ��ʹ��clone
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public boolean equals(Employee other) {
        return name.equals(other.name);
    }   // һ���������Է�������������ж����˽�����ݣ������ȷʵͦ��ֵ�


}

// Java�������Ĺ�����ʽ��һ���ġ�����Ҫ��ס���е�Java���԰��Ǹ������ڶ��й���ģ����������ǰ�����new������һ��ʹ�á�
// final���η������ڻ��������򣬻��߲��ɱ������
// ������εĿɱ����Ļ���ʹ��final���η����ܻ������ɻ��� private final Date hiredate;������ζ�Ŵ洢��
// hiredate�����еĶ��������ڶ�����֮���ܱ��ı䣬��������ζ��hiredate������һ���������κη��������Զ�hiredate
// ���õĶ������setTime������

// static�ĺ��壺�������Ҳ����ڶ���ı����ͺ���
