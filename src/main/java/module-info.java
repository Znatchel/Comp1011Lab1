module com.example.comp1011lab1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.comp1011lab1 to javafx.fxml;
    exports com.example.comp1011lab1;
}