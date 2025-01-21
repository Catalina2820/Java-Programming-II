
public class Person {

    private String name;
    private String dir;

    public Person(String name, String dir) {
        this.name = name;
        this.dir = dir;
    }

    @Override
    public String toString() {
        return name + "\n  " + dir;
    }
}
