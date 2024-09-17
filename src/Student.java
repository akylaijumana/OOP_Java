public class Student {
    public String name;
    public String major ;
    public int  ID;
    public Double GPA;
    public Student( String name , String major ,int ID , Double GPA){
        this.name = name ;
        this.major = major ;
        this.ID = ID ;
        this.GPA = GPA;
    }
    public void displayInfo (){
        System.out.println("student's name:"+name);
        System.out.println("student's major:"+major);
        System.out.println("student's ID:" +ID);
        System.out.println("student's GPA:"+ GPA);
    }
    public static void main(String[] args) {
        // Create a new Student object
        Student student1 = new Student("Aiperi","Artificial intelligence", 12345, 3.2);
        Student student2 = new Student("Alina","Computer science", 230106015,3.5);
        Student student3 = new Student("Ruslan","Cyber Security", 23010501,4.0);
        //
        // Display the information of the student
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();
        student3.displayInfo();
    }
}