package thinkingjava;

/**
 * Created by Administrator on 2015/11/3.
 */
public class Ex1 {

    public static void main(String[] args) {
        try {
            throw new Exception("Tenghuanhe");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Coming into finally");
        }

        Ex1 ex1 = null;
        try {
            System.out.println("Referencing a null pointer.");
            System.out.print(ex1.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Testing a new msg exception");
            throw new My2Exception("This is a msg");
        } catch (My2Exception e) {
            System.out.println("Red");
            System.out.print(e.getStr());
        }
    }
}

class My2Exception extends Exception {
    private String str;

    public My2Exception() {
    }

    public My2Exception(String msg) {
        super(msg);
        this.str = msg;
    }

    public String getStr() {
        return this.str;
    }
}
