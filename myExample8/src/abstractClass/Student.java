package abstractClass;

/**
 * Created by tenghuanhe on 2015/10/17.
 */
public class Student extends Person {
    private String Major;

    public Student(String name, String major) {
        super(name);
        this.Major = major;
    }

    @Override
    public String getDescription() {
        return String.format("a student majoring in " + this.Major);
    }
}
