module com.example.tpnote {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tpnote to javafx.fxml;
    exports com.example.tpnote;
}