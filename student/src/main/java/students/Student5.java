package students;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Student5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Scene3.fxml"));
            Scene scene = new Scene(root);
            // scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    Group root = new Group();

    Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);

}
