package wrapper;

import java.util.ArrayList;

/**
 * Created by tenghuanhe on 2015/10/18.
 */
public class WrapperTest {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;

        System.out.println(a.toString() == b.toString());   //false
        System.out.println(a == b);   //false
        // == ������������������Ƿ�ָ���ͬһ��洢����

        int aa = 10;
        int bb = 10;
        System.out.println(aa == bb);

        a++; // �Զ�������Զ�װ��
        b++;
        System.out.println(a);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(aa);
        list.add(bb);

        for (Integer i : list) System.out.println(i);
        for (int i : list) System.out.println(i);
    }
}
