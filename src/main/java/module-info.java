module com.calculodroid.calculodroid {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calculodroid.calculodroid to javafx.fxml;
    exports com.calculodroid.calculodroid;
}