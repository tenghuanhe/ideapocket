package thinkingjava;

/**
 * Created by Administrator on 2015/11/4.
 */
class Annoyance extends Exception {

}

class Sneeze extends Annoyance {

}

public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Annoyance Exception");
        } catch (Annoyance annoyance) {
            System.out.println("Caught Sneeze Exception");
        }
    }
}
