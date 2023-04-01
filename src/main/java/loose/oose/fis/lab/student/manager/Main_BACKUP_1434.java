package loose.oose.fis.lab.student.manager;

public class Main {
    @Override
    public void start(Stage primaryStage) throws Exception {
<<<<<<< HEAD
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
=======
        Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));
>>>>>>> master
        primaryStage.setTitle("FIS - Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

}
