package Project;

public class port {
    public static void main(String[] args) {
        SchoolID myID = new SchoolID(); // THE ID IS PRINTED
        myID.studentName = "Juan Dela Cruz";
        myID.lrn = "123456789";
        myID.gradeSection = "Grade 12 - TVL";

        myID.showInfo(); //prints the IDs info
        myID.tapToEnter();  //uses the ID at the gate
    }
}
