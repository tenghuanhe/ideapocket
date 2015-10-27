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

        // һ�������������ָʾ����ʵ�����͵������Ϊ��̬
        // ������ʱ�ܹ��Զ�ѡ������ĸ������������Ϊ��̬��
        // ��Java�в���Ҫ����������Ϊ�鷽������̬����Ĭ�ϵĴ�����ʽ��
        // �����ϣ��ĳ�����������������������Խ������Ϊfinal
        // Java��֧�ֶ�̳У����ƹ��ܵ�ʵ�ַ�ʽ�ǽӿڣ�interface��

        // ��Java�У���������Ƕ�̬�ģ�һ��Employee�����ȿ�������Employee�����Ҳ��������Manager�����
        // ��������û����࣬���Ƿ��������಻���û�����
        // �����˽�з������ɷ���

        // ������õ���private, static, final�������߹���������ô����������׼ȷ��֪��Ӧ�õ����ĸ����������ֵ��÷�ʽ������̬��
        // ��֮��Ӧ�ı��ǣ����÷�����������ʽ������ʵ�����ͣ�����������ʱ��̬�󶨡�

        // ע�⣺�������Ͳ��Ƿ���ǩ����һ����

        // �������Ԥ��Ϊÿ���ഴ��һ����������method�������г������з�����ǩ����ʵ�ʵ��õķ���������һ�����������÷�����ʱ�������������
        // ������Ϳ�����

        // final���������Ա����า�ǣ�Ҳ����˵����������ʵ���������
        // ���һ���౻����Ϊfinal����ô�������еķ�������final�ģ�����field�򲢲����Ϊfinal

        // ���һ������û�б����Ƕ��Һ̣ܶ���ô���������ܹ���������Ż�������������̳�Ϊ����inlining��������������e.getName()�����滻Ϊ����
        // e.name��

        // ��������ת����Ψһԭ������ʱ�����˶����ʵ������֮��ʹ�ö����ȫ�����ܡ�

        // ֻ���ڼ̳в��֮�ڽ���ת��
        // �ڽ�����ת��Ϊ����֮ǰ��Ӧ��ʹ��instanceof�������ͼ��
        // ֻҪû�в���ClassCastException�쳣������ͻ���ִֹ�С�һ�������Ӧ�þ�����ʹ������ת����instanceof�����
        /**
         * if (staff[1] instanceof Manager)
         * {
         *     Manager boss = (Manager) staff[1]
         * }
         */

    }
}