package inheritance;

/**
 * Created by tenghuanhe on 2015/10/17.
 */
public abstract class Person {

    private String name;

    public Person(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getDescription();
}
