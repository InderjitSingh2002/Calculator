package portfolio.proj.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private Button addButton;

    @FXML
    private Button backspaceButton;

    @FXML
    private Button cButton;

    @FXML
    private Button divideButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button oneButton;

    @FXML
    private TextField resultTextField;

    @FXML
    private Button sevenButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button subtractButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button zeroButton;



    String displayText = "";
    int result;
    String operator = "";
    Calculator c = new Calculator(0,0);
    @FXML
    private void onClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();


        switch(clickedButton.getText()) {
            case "+" :
                c.setNum1(c.getNum2());
                c.setNum2(Integer.parseInt(displayText));
                result = c.addFunc(c.getNum1(), c.getNum2());
                displayText = "";
                operator = "+";
                break;
            case "-" :
                c.setNum1(c.getNum2());
                c.setNum2(Integer.parseInt(displayText));
                result = c.subtractFunc(c.getNum1(), c.getNum2());
                displayText = "";
                operator = "-";
                break;
            case "*" :
                c.setNum1(c.getNum2());
                c.setNum2(Integer.parseInt(displayText));
                result = c.multiplyFunc(c.getNum1(), c.getNum2());
                displayText = "";
                operator = "*";
                break;
            case "/" :
                c.setNum1(c.getNum2());
                c.setNum2(Integer.parseInt(displayText));
                result = c.divideFunc(c.getNum1(), c.getNum2());
                displayText = "";
                operator = "/";
                break;
            case "C" :
                c.setNum1(0);
                c.setNum2(0);
                result = 0;
                displayText = "";
                break;
            case "=":
                switch (operator) {
                    case "+" :
                        c.setNum1(c.getNum2());
                        c.setNum2(Integer.parseInt(displayText));
                        result = c.addFunc(c.getNum1(), c.getNum2());
                        break;
                    case "-" :
                        c.setNum1(c.getNum2());
                        c.setNum2(Integer.parseInt(displayText));
                        result = c.subtractFunc(c.getNum1(), c.getNum2());
                        break;
                    case "*" :
                        c.setNum1(c.getNum2());
                        c.setNum2(Integer.parseInt(displayText));
                        result = c.multiplyFunc(c.getNum1(), c.getNum2());
                        break;
                    case "/" :
                        c.setNum1(c.getNum2());
                        c.setNum2(Integer.parseInt(displayText));
                        result = c.divideFunc(c.getNum1(), c.getNum2());
                        break;
                }
                displayText = String.valueOf(result);
                break;
            default :
                displayText = displayText + clickedButton.getText();
        }
        resultTextField.setText(displayText);
    }

}