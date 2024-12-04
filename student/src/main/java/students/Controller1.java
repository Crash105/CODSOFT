package students;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller1 implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private TextField myTextField1;

    @FXML
    private TextField myTextField2;

    @FXML
    private TextField myTextField3;

    @FXML
    private TextField myTextField4;

    @FXML
    private TextField myTextField5;

    @FXML
    private TextField myTextField6;

    @FXML
    private TextArea textArea1;

    @FXML
    private Button myButton;

    @FXML
    private ChoiceBox<String> dropdown;

    @FXML
    private ChoiceBox<String> dropdown2;

    String name;
    String rollnumber;
    double gpa;
    StudentMain student1;

    public void submit(ActionEvent event) {
        name = myTextField1.getText();
        rollnumber = myTextField2.getText();
        try {
            gpa = Double.parseDouble(myTextField3.getText());
        } catch (NumberFormatException e) {
            myLabel.setText("Enter only numbers or Fill out GPA Field");
            return;

        } catch (Exception e) {
            System.out.println(e);

        }

        if (myTextField1.getText().length() == 0 || myTextField2.getText().length() == 0
                || myTextField3.getText().length() == 0) {
            myLabel.setText("Make sure all values are filled in");
            return;

        }
        // gpa = Double.parseDouble(myTextField3.getText());
        student1 = new StudentMain(name, rollnumber, gpa);
        textArea1.setText(student1.displayStudents());
        // myLabel.setText("Student Has Been Added");
        dropdown.getItems().add(student1.getRollNumber());
        dropdown2.getItems().add(student1.getRollNumber());

    }

    public void submit2(ActionEvent event) {
        String choice = dropdown.getValue();
        System.out.println(choice);
        student1.removeStudent(choice);
        textArea1.setText(student1.displayStudents());
        dropdown.getItems().remove(choice);
        dropdown2.getItems().remove(choice);

    }

    public void submit3(ActionEvent event) {

        String choice1 = dropdown2.getValue();
        int index = student1.getIndex(choice1);

        name = myTextField4.getText();
        if (myTextField4.getText().length() != 0) {
            student1.students.get(index).setName(name);
        }

        try {
            gpa = Double.parseDouble(myTextField6.getText());
            if (myTextField6.getText().length() != 0) {
                student1.students.get(index).setGPA(gpa);
            }
        } catch (NumberFormatException e) {
            myLabel.setText("Enter only numbers or Fill out GPA Field");

        }

        student1.students.get(index).setName(name);
        rollnumber = myTextField5.getText();
        try {
            gpa = Double.parseDouble(myTextField6.getText());
        } catch (NumberFormatException e) {
            myLabel.setText("Enter only numbers or Fill out GPA Field");

        } catch (Exception e) {
            System.out.println(e);

        }

        // gpa = Double.parseDouble(myTextField3.getText());

        textArea1.setText(student1.displayStudents());
        // myLabel.setText("Student Has Been Added");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (student1.students != null) {
            for (StudentMain student1 : student1.students) {
                dropdown.getItems().add(student1.getRollNumber());
            }
        } else {
            System.out.println("students is null!");
        }

        if (student1.students != null) {
            for (StudentMain student1 : student1.students) {
                dropdown2.getItems().add(student1.getRollNumber());
            }
        } else {
            System.out.println("students is null!");
        }
    }

}
