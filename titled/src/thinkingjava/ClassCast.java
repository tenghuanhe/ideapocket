package thinkingjava;

/**
 * Created by Administrator on 2015/11/5.
 */
class Building {
}

class House extends Building {

}

public class ClassCast {

    public static void main(String[] args) {
        Building b = new House();

        Class<House> houseType = House.class;
        House h = houseType.cast(b); // 1
        h = (House) b;              // 2        1 and 2, both will work
    }
}
