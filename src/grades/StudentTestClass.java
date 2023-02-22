package grades;

public class StudentTestClass {

    public static void main(String[] args) {
        Student student1 = new Student("Janice Suever");
        Student student2 = new Student("Nickolas Solley");

        student1.addGrade(96);
        student1.addGrade(69);
        student1.addGrade(77);
        student1.addGrade(26);
        student1.addGrade(100);

        student2.addGrade(69);
        student2.addGrade(45);
        student2.addGrade(89);
        student2.addGrade(99);
        student2.addGrade(88);

        System.out.println(student1.getName() + " Has an average of  " + student1.getGradeAverage() + " % ");
        System.out.println(student2.getName() + " Has an average of  " + student2.getGradeAverage() + " % ");
    }
}
