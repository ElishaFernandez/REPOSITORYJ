package Project;

public class SchoolID {

    String studentName;
    String lrn;
    String gradeSection;

    //methods - what the ID lets u do

    void tapToEnter() {
        System.out.println(studentName + " tapped in at the gate.");
    }

    void showInfo(){
        System.out.println(studentName + " | LRN: " + lrn + " | " + gradeSection);
    }
    public static void main(String[] args) {
        SchoolID myID = new SchoolID(); // THE ID IS PRINTED
        myID.studentName = "Juan Dela Cruz";
        myID.lrn = "123456789";
        myID.gradeSection = "Grade 12 - TVL";

        myID.showInfo(); //prints the IDs info
        myID.tapToEnter();  //uses the ID at the gate
    }
}