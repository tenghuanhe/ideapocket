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

// �κ�����Ϊprivate����������඼�ǲ��ɼ��ģ����������Ҳ��ȫ���ã�������Ҳ���ܷ��ʳ����˽����
// ���������Employee�е�hireDate����Ϊprotected,������˽�еģ���ôManager�еķ����Ϳ��Է�������
// ����Manager���еķ���ֻ�ܷ���Manager�����е�hireDate�򣬶����ܷ�������Employee�����е�hireDate��

// �ܱ�������Ҫ����ʹ��
// ��ʵ��Ӧ���У��ܱ����ķ����������壬���Ҫ����ĳ��������ʹ�ã��Ϳ��Խ�������Ϊprotected�����������
// �ܵ����β��ҿ�����ȷ��ʹ�����������������������

// Java���ڿ��ƿɼ��Ե�4�����η�
// private���������������Ա���ɼ���
// public��������������������ɼ�
// protected���������Ա�������������ɼ�
// û�����η����������Ա����ɼ�

/**
 * equalsӦ�þ�����������
 * 1. �Է���
 * 2. �Գ���
 * 3. ������
 * 4. һ����
 * 5. x.equals(null) = false
 */