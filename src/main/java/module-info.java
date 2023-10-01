module com.example.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenebuilder to javafx.fxml;
    exports com.example.scenebuilder;
    exports com.example.scenebuilder.todo;
    opens com.example.scenebuilder.todo to javafx.fxml;
}