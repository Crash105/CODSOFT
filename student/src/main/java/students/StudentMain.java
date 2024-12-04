package students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentMain {

    // attributs name roll number, grade
    // methods to add a student, remove a student, search for a student, and display
    // all students

    private String name;
    private String rollnumber;
    private double gpa;
    public static ArrayList<StudentMain> students = new ArrayList<>();

    public StudentMain(String name, String rollnumber, double gpa) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.gpa = gpa;
        students.add(this);
    }

    public void removeStudent(String rollnumber) {
        Iterator<StudentMain> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getRollNumber().equals(rollnumber)) {
                iterator.remove();
            }
        }

    }

    public int getIndex(String rollnumber) {
        Map<String, Integer> rollNumberIndexMap = new HashMap<>();

        for (int i = 0; i < students.size(); i++) {
            rollNumberIndexMap.put(students.get(i).getRollNumber(), i);
        }
        return rollNumberIndexMap.get(rollnumber);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return gpa;
    }

    public ArrayList<StudentMain> getStudents() {
        return students;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String getRollNumber() {
        return rollnumber;
    }

    public void setRollNumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String displayStudents() {
        StringBuilder result = new StringBuilder();
        for (StudentMain acc : students) {
            result.append(acc.toString()).append("\n");
        }
        return result.toString();
    }

    public String toString() {
        return "Student: " + name + " rollnumber: " + rollnumber + " GPA: " + gpa;
    }

}
