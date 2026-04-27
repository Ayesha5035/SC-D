public class InhHOD extends InhTeacher{
    String departments;

    public InhHOD(String name, String subject, String departments){
        super(name, subject);
        this.departments = departments;
    }

    public void manageDepartment(){
        System.out.println("HOD "+ name + " is managing the "+ departments+ " and also teach "+ subject);
    }
    
}
