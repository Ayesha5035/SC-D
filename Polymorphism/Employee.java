
public class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void calculateSalary(){
        System.out.println(name+"'s Salary "+ baseSalary);
    }
}
