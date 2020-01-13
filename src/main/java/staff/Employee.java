package staff;

public abstract class Employee {
    protected String name;
    protected String ni;
    protected int salary;

    public Employee(String name, String ni, int salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return ni;
    }

    public int getSalary() {
        return salary;
    }

    public int raiseSalary(double increment_value) {
        return salary += increment_value; //might break
    }

    public int payBonus(){
        return salary / 100; 
    }
}
