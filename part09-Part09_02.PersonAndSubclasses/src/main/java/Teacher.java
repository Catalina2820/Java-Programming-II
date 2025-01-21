
public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String dir, int salary) {
        super(name, dir);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + salary + " euro/month";
    }
}
