public class Developer extends Employee{
    double bonus;
    public Developer(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public void calculateSalary(){

        double TotalSalary = baseSalary+bonus;
        System.out.println("Developer Information/nEmployee name: "+name+ "\n Base Salary: "+baseSalary+ "\nBonus: "+bonus+ "\nTotal Salary: "+TotalSalary);
    }
}