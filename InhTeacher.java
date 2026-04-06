public class InhTeacher extends InhPerson {
    String subject;

    public InhTeacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public void teach(){
        System.out.println(name +" is teaching "+ subject);
    }

    
}
