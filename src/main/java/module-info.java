module com.example.jfxvboxconlabelyboton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jfxvboxconlabelyboton to javafx.fxml;
    exports com.example.jfxvboxconlabelyboton;
}