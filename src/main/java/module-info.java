module portfolio.proj.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens portfolio.proj.calculator to javafx.fxml;
    exports portfolio.proj.calculator;
}