import java.util.Scanner;

public class studentgrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = { "Math", "Science", "Language Arts", "History", "Art", "Gym", "Chemistry", "Physics",
                "Computer Science", "Robotics" };

        int totalmarks = 0;

        System.out.println("Enter Students Grade for each subjects");

        for (int i = 0; i < subjects.length; i++) {
            int grade = scanner.nextInt();
            totalmarks = totalmarks + grade;
            System.out.println("Enter Next Grade");

        }

        double average = (double) totalmarks / (double) subjects.length;

        String grade = "";
        if (average > 90) {
            grade = "A";
        } else if (average >= 80 && average < 90) {
            grade = "B";
        } else if (average >= 70 && average < 80) {
            grade = "C";
        } else if (average >= 60 && average < 70) {
            grade = "D";
        } else if (average < 60) {
            grade = "F";
        }
        System.out.println("");
        System.out.println("Total Marks:" + totalmarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade Calculation: " + grade);

        scanner.close();

    }
}
