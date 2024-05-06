module com.example.filmai {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.filmai to javafx.fxml;
    exports com.example.filmai;
    exports com.example.filmai.controller;
    opens com.example.filmai.controller to javafx.fxml;
}