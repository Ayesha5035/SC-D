
public class Main {
    public static void main(String[] args) {

        Employee[] staff = new Employee[2];
        staff[0] = new Developer("Ayesha", 50000, 7000);
        staff[0] = new Manager("Ayesha", 50000, 5000);

        for (Employee e : staff){
            e.calculateSalary();
        }
        
    }
    
}
