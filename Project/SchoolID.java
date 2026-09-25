package Project;

public class SchoolID {

    String studentName;
    String lrn;
    String gradeSection;

    //methods - what the ID lets u do

    void tapToEnter() {
        System.out.println(studentName + "tapped in at the gate.");

    }

    void showInfo(){
        System.out.println(studentName + " | LRN: " + lrn + " | " + gradeSection);
    }

}