package com.example.listadenomes;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField nameField;
    @FXML
    private CheckBox alimentoCheck;
    @FXML
    private CheckBox bebidaCheck;
    @FXML
    private CheckBox frutaCheck;
    @FXML
    private ListView listFrutas;
    @FXML
    private ListView listAlimentos;
    @FXML
    private ListView listBebidas;

    @FXML
    protected void addName() {
        String  name = nameField.getText();
        if (alimentoCheck.isSelected()){
            listAlimentos.getItems().add(name);
        } else if (bebidaCheck.isSelected()) {
            listBebidas.getItems().add(name);
        } else if (frutaCheck.isSelected()) {
            listFrutas.getItems().add(name);
        }
        nameField.clear();
        alimentoCheck.setSelected(false);
        bebidaCheck.setSelected(false);
        frutaCheck.setSelected(false);
    }
}