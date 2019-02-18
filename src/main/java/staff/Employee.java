package staff;

public abstract class Employee {

    protected String name;
    protected String NI;
    protected double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment){
        if(increment >= 0){
            this.salary += increment;
        }
    }

    public void setName(String name) {
        if (name != null && name != "") {
            this.name = name;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
