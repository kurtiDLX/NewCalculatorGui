package sample;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

        private String splitResultField[], resultFieldNew;

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button additionBut;

        @FXML
        private Button clearBut;

        @FXML
        private Button divisionBut;

        @FXML
        private Button eightBut;

        @FXML
        private Button fiveBut;

        @FXML
        private Button fourBut;

        @FXML
        private Button interestBut;

        @FXML
        private Button multiplicationBut;

        @FXML
        private Button nineBut;

        @FXML
        private Button oneBut;

        @FXML
        private Button resultBut;

        @FXML
        private TextArea resultField;

        @FXML
        private Button sevenBut;

        @FXML
        private Button sixBut;

        @FXML
        private Button subtractionBut;

        @FXML
        private Button threeBut;

        @FXML
        private Button twoBut;

        @FXML
        private Button zeroBut;

//        private String res = resultField.getText();
//        private String parts[] = res.split( "\\+");

        @FXML
        void initialize() {


         clearBut.setOnAction(actionEvent -> {
           resultField.clear();
         });

            oneBut.setOnAction(e -> resultField.appendText("1"));
            twoBut.setOnAction(e -> resultField.appendText("2"));
            threeBut.setOnAction(e -> resultField.appendText("3"));
            fourBut.setOnAction(e -> resultField.appendText("4"));
            fiveBut.setOnAction(e -> resultField.appendText("5"));
            sixBut.setOnAction(e -> resultField.appendText("6"));
            sevenBut.setOnAction(e -> resultField.appendText("7"));
            eightBut.setOnAction(e -> resultField.appendText("8"));
            nineBut.setOnAction(e -> resultField.appendText("9"));
            zeroBut.setOnAction(e -> resultField.appendText("0"));


            additionBut.setOnAction(e ->{
                resultField.appendText(" + ");
            });
            subtractionBut.setOnAction(e ->{
              resultField.appendText(" - ");
            });
            multiplicationBut.setOnAction(e ->{
              resultField.appendText(" x ");
            });
            divisionBut.setOnAction(e ->{
              resultField.appendText(" ÷ ");
            });



            resultBut.setOnAction(e -> {
                resultFieldNew = resultField.getText();
                splitResultField = resultFieldNew.split("\\+|-|x|÷");

                String operation = "";
                for (char c : resultFieldNew.toCharArray()) {
                    if (c == '+') {
                        operation = "+";
                        break;
                    } else if (c == '-') {
                        operation = "-";
                    } else if (c == 'x') {
                        operation = "x";
                    } else if (c == '÷'){
                        operation = "÷";
                    }
                }
                if (operation.equals("+")) {
                    double num1 = Double.parseDouble(splitResultField[0]);
                    double num2 = Double.parseDouble(splitResultField[1]);

                    double result = num1 + num2;
                    resultField.setText(Double.toString(result));
                } else if (operation.equals("-")) {
                    double num1 = Double.parseDouble(splitResultField[0]);
                    double num2 = Double.parseDouble(splitResultField[1]);

                    double result = num1 - num2;
                    resultField.setText(Double.toString(result));
                } else if (operation.equals("x")) {
                    double num1 = Double.parseDouble(splitResultField[0]);
                    double num2 = Double.parseDouble(splitResultField[1]);

                    double result = num1 * num2;
                    resultField.setText(Double.toString(result));
                } else if (operation.equals("÷")){
                    double num1 = Double.parseDouble(splitResultField[0]);
                    double num2 = Double.parseDouble(splitResultField[1]);

                    double result = num1 / num2;
                    if (num2 == 0) {
                        resultField.setText("ERROR");
                    } else {
                        resultField.setText(Double.toString(result));
                    }
                }
            });
        }

    }
