/**
 * Created by tenghuanhe on 2015/10/17.
 */
package abstractClass;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return this.name;
    }
}
