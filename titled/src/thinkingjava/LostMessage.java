package thinkingjava;

/**
 * Created by Administrator on 2015/11/4.
 */
public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            throw new RuntimeException();
        } finally {
            return;
        }
    }
}

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important Exception";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial Exception";
    }
}


