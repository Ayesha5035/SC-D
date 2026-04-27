public class Manager extends Employee{
    double incentive;
    public Manager(String name, double baseSalary, double incentive){
        super(name, baseSalary);
        this.incentive = incentive;
    }
    @Override
    public void calculateSalary(){
        double TotalSalary = baseSalary+incentive;
        System.out.println("/nManager Information/nEmployee name: "+name+ "\n Base Salary: "+baseSalary+ "\nIncentive: "+incentive+ "\nTotal Salary: "+TotalSalary);
    }
}
