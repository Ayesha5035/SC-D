public class InhMain {

    public static void main(String[] args) {
        
    InhTeacher teacher1 = new InhTeacher("Mariam","SCD");
    InhStudent student1 = new InhStudent("Ayesha Farooq", "BSSE012315035");
    InhHOD h1 = new InhHOD("Adill Butt","Advance Programming ","Computer Science Department");
    h1.manageDepartment();
    teacher1.teach();
    student1.learn();
    }
    
}
