package statictest;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}

// ����һ�����ʱ��
// �����Ǹ��ྲ̬����ȥ
// ���ྲ̬������
// ���๹����
// ���๹����

// ��Ҳ������һ��ԭ��������Ȼ����ܹ��ж���
// ��̬���������࣬������ص�ʱ��ͻ����Щ�������г�ʼ��
// �����캯���������ڲ�������ģ��Ǻ;���Ķ��������һ���

// ���캯�������Ա����Ϊ��̬��
