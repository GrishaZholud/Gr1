package sam1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller1 {

    @FXML
    public Button umnozh;

    @FXML
    public TextField textField;

    int znachFirst;
    int znachSecond;
    int umnozhenie;
    int delenie;
    int slozhenie;
    int minus;

    public void four(ActionEvent actionEvent) {
        textField.appendText("4");
    }

    public void seven(ActionEvent actionEvent) {
        textField.appendText("7");
    }

    public void one(ActionEvent actionEvent) {
        textField.appendText("1");
    }

    public void isnull(ActionEvent actionEvent) {
        textField.appendText("0");
    }

    public void eit(ActionEvent actionEvent) {
        textField.appendText("8");
    }

    public void nine(ActionEvent actionEvent) {
        textField.appendText("9");
    }

    public void five(ActionEvent actionEvent) {
        textField.appendText("5");
    }

    public void two(ActionEvent actionEvent) {
        textField.appendText("2");
    }

    public void six(ActionEvent actionEvent) {
        textField.appendText("6");
    }

    public void three(ActionEvent actionEvent) {
        textField.appendText("3");
    }

    public void AC(ActionEvent actionEvent) {
        textField.setText("");
    }

    public void umnozh(ActionEvent actionEvent) {
        znachFirst = Integer.parseInt(textField.getText());
        textField.setText("");
        umnozhenie++;
//        znachSecond = Integer.parseInt(textField.getText());
    }
    public void plus(ActionEvent actionEvent) {
        znachFirst = Integer.parseInt(textField.getText());
        textField.setText("");
        slozhenie++;
    }

    public void ravno(ActionEvent actionEvent) {
        znachSecond = Integer.parseInt(textField.getText());
        textField.setText("");
        if(umnozhenie == 1){
            textField.appendText(String.valueOf(znachFirst*znachSecond));
            umnozhenie = 0;
        }
        if(slozhenie == 1){
            textField.appendText(String.valueOf(znachFirst+znachSecond));
            slozhenie = 0;
        }
        if(delenie == 1){
            textField.appendText(String.valueOf(znachFirst/znachSecond));
            delenie = 0;
        }
        if(minus == 1){
            textField.appendText(String.valueOf(znachFirst-znachSecond));
            minus = 0;
        }

        znachFirst = 0;
        znachSecond = 0;




    }


    public void del(ActionEvent actionEvent) {
        znachFirst = Integer.parseInt(textField.getText());
        textField.setText("");
        delenie++;
    }

    public void minus(ActionEvent actionEvent) {
        znachFirst = Integer.parseInt(textField.getText());
        textField.setText("");
        minus++;
    }
}
