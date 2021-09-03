package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    public TextField textFieldName;

    public void sendMessage(ActionEvent actionEvent) {
        String name = textFieldName.getText() + textFieldName.getStylesheets();
        textArea.appendText(name + "\n" + textField.getText() + "\n");
    }

    public void getname(ActionEvent actionEvent) {
        textFieldName.setVisible(false);

    }



}
