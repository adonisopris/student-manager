package loose.oose.fis.lab.student.manager;

public class Main {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));
        primaryStage.setTitle("Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

}
