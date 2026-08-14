module tech.octopusdragon.ultimatecheckers {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens tech.octopusdragon.ultimatecheckers to javafx.fxml;
    opens tech.octopusdragon.ultimatecheckers.control to javafx.fxml;
    opens tech.octopusdragon.ultimatecheckers.window to javafx.fxml;
    opens tech.octopusdragon.ultimatecheckers.controller to javafx.fxml;
    opens tech.octopusdragon.ultimatecheckers.model to com.google.gson;
    exports tech.octopusdragon.ultimatecheckers;
}