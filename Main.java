import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HeadMaster headMaster = new HeadMaster("Harith", "0122143101");
        TuitionCenter tuitionCenter = new TuitionCenter("Wangsa Maju Center", headMaster);

        Tutor tutor1 = new Tutor("Steven Drogba", "020131140555", "Bukit Jelutong", "International Baccalaureate", 2, "2019/01/31", 2);
        Tutor tutor2 = new Tutor("Aliff Salleh", "01321020322", "Bukit Mahkota", "Computer Science Bachelor", 3, "2018/10/21", 4);
        tuitionCenter.addTutor(tutor1);
        tuitionCenter.addTutor(tutor2);

        ArrayList<Integer> scores1 = new ArrayList<Integer>();
        scores1.add(75);
        scores1.add(55);
        scores1.add(45);
        Student student1 = new Student("Yasri Ariff", "23458932", "45,Mawi Canada", 3, "Sekolah Alam Shah", scores1);
        ArrayList<Integer> scores2 = new ArrayList<Integer>();
        scores2.add(32);
        scores2.add(67);
        scores2.add(89);
        Student student2 = new Student("Haiqal", "0122143101", "Mountain Everest", 5, "Sekolah Sains Tepi Sungai", scores2);
        tuitionCenter.addStudent(student1);
        tuitionCenter.addStudent(student2);

        Report report = tuitionCenter.generateReport();
        System.out.println("Number of students: " + report.getNumStudents());
        System.out.println("Number of tutors: " + report.getNumTutors());
        System.out.println("Average marks: " + report.getAverageMarks());
        System.out.println("Minimum marks: " + report.getMinMarks());
        System.out.println("Maximum marks: " + report.getMaxMarks());
        System.out.println("Tutor backgrounds: " + report.getTutorBackgrounds());
    }
}
