package paper;
import java.util.Scanner;

//     public static void main(String[] args) {
// //     Tricycle tricycle = new Tricycle("TRC 456", "Kuya Ben");
    
// //     }
// //        Vehicle[] fleet = {
// //             new Jeepney("NXA 123", "Mang Ramon", "Monumento-Divisoria"),
// //            new Tricycle("TRC 456", "Mang Juan", "TODA 1"),
// //            new Bus("BUS 789", "Aling Rosa", 40)
// //          }; v
   
// // // //         for (int i = 0; i <= fleet.length; i++) {
// // //      // fleet[i].showInfo();


// // // //     }
// // // // System.out.println("End odf the fleet report.");
// // // // }
// // try {
// //     for (int i = 0; i < fleet.length; i++) {
// //      }
// //  } catch (ArrayIndexOutOfBoundsException e) {
// //      System.out.println("Problema:" + e.getMessage());
// //  }
// //    System.out.println("End of fleet report.");
//     }


// public static void main(String[] args) {

// Vehicle[] fleet = new Vehicle [3];

// // 3 empty empty slots, all null

// fleet [0] = new Jeepney ("NXA 123", "Mang Ramon", "Monumento-Divisoria");

// try {

// fleet[1].showInfo();

// // slot 1 is still empty

// } catch (NullPointerException e) {

// System.out.println("No vehicle in slot 1 yet.");

// }

// String typed = "twelve";

// // what a user might type

// try {

// int count = Integer.parseInt(typed);
// fleet[0].setPassengers(count);
// // text to number



// } catch (NumberFormatException e) {

// System.out.println("Not a number: "+ e.getMessage());

// }

// System.out.println("Done.");

// }
// import java.io.File;

// import java.util.Scanner;

// public class Main {

// public static void main(String[] args) {

// Scanner file = new Scanner(new File("drivers.txt"));

// while (file.hasNextLine()) {

// System.out.println("Driver: " +  file.nextLine());

// file.close();
//     }
// }
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
// public class Main {
// // throws: "I might fail with this. Whoever calls me must handle it."
// static void printDrivers(String fileName) throws FileNotFoundException {
// Scanner file = new Scanner(new File(fileName));
// while (file.hasNextLine()) {
// System.out.println("Driver: " + file.nextLine());
// }
// file.close();
// }
// public static void main(String[] args) {
// Jeepney jeep = new Jeepney("NXA 123", "Mang Ramon", "Monumento-Divisoria");
// try {
// if (-3 < 0) {
// throw new IllegalArgumentException("Passenger count cannot be negative: -3");
// }
// // the setter THROWS now
// jeep.showInfo();
// // skipped
// } catch (IllegalArgumentException e) {
// System.out.println("Rejected: " + e.getMessage());
// }
// try {
// printDrivers("paper/drivers.txt");
// // the caller handles it
// } catch (FileNotFoundException e) {
// System.out.println("Missing file: " + e.getMessage());
// }
// }
public class Main {
public static void main(String[] args) {
Jeepney jeep = new Jeepney("NXA 123", "Mang Ramon", "Monumento-Divisoria");
Tricycle trike = new Tricycle("TRC 456", "Kuya Ben", "Bagong Silang TODA");
try {
jeep.board(15);
jeep.showInfo();
jeep.board(10);
// 15 + 10 = 25, more than 20
jeep.showInfo();
// skipped
} catch (OverloadException e) {
System.out.println("Cannot board: " + e.getMessage());
}
try {
System.out.println("Fare: P" + trike.quoteFare(-2));
} catch (InvalidDistanceException e) {
System.out.println("Cannot quote: " + e.getMessage());
} finally {
System.out.println("Trip log saved.");
}
}
}


