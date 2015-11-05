package thinkingjava;

/**
 * Created by Administrator on 2015/11/5.
 */
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Toy toy = new FancyToy();
        Class c = null;
        try {
            c = Class.forName("thinkingjava.Toy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        printInfo(c);
        printInfo(toy.getClass());

        for (Class face : toy.getClass().getInterfaces())
            printInfo(face);


        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        System.out.println(up.newInstance().getClass().getSimpleName());

        Class<Toy> up2 = (Class<Toy>) ftClass.getSuperclass();
        System.out.println(up2.newInstance().getClass().getSimpleName());
    }
}


interface HasBatteries {
}

class Toy {
    Toy() {
    }

    Toy(int i) {

    }
}

class FancyToy extends Toy implements HasBatteries {
    FancyToy() {
        super(1);
    }
}

