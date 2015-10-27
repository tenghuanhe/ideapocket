package animals;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class Animal {
    private String name;

    public Animal() {
        System.out.println("Making an Animal...");
    }

    public Animal(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
