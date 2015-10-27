package test;

/**
 * Created by Administrator on 2015/10/21.
 */
public class Test {
    private static int i = 1;

    public int getNext() {
        return i++;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test testObject = new Test();
        test.getNext();
        testObject.getNext();
        System.out.println(testObject.getNext());

        Integer i = 42;
        Long l = 42l;
        Double d = 42.0;

//        System.out.println(i == l);
//        System.out.println(i == d);
//        System.out.println(d == l);
        System.out.println(i.equals(l));
        System.out.println(i.equals(d));
        System.out.println(l.equals(d));
        System.out.println(l.equals(42L));

        int j = 0;
        for (int k = 0; j + k != 10; j++, k++) {
            System.out.println(j + " " + k);
        }

/*        while ( int ii<7)
        {
            ii++
            System.out.println();
        }*/
    }
}
