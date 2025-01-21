
public class Student extends Person {
    
    private int credits;
    
    public Student(String name, String dir){
        super(name, dir);
        this.credits = 0;
    }
    
    public int credits(){
        return this.credits;
    }
    
    public void study(){
       this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits;
    }
}
