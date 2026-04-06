public class InhStudent extends InhPerson {
 
    String rollNo;

    public InhStudent(String name, String rollNo){
        super(name);
        this.rollNo = rollNo;
    }

    public void learn(){
        System.out.println("Student ID of "+ name +" is "+ rollNo);
    }
    
}
