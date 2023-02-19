package com.example.calculator.controller;

import com.example.calculator.model.CsvReader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MainController {

    @FXML
    private Label cutting_liners;

    @FXML
    private TextField density_liners;

    @FXML
    private TextField density_tape;

    @FXML
    private TextField diameter_liner;

    @FXML
    private Label embossing_tape;

    @FXML
    private RadioButton epe_liners;

    @FXML
    private RadioButton epe_tape;

    @FXML
    private RadioButton evoh_liners;

    @FXML
    private Label foil_liners;

    @FXML
    private Label glindining_tape;

    @FXML
    private RadioButton laminated_tape;

    @FXML
    private Label ldpe_tape;

    @FXML
    private Label nucleating_tape;

    @FXML
    private RadioButton pe_liners;

    @FXML
    private Label regranulate_tape;

    @FXML
    private TextField regranulate_tape_set;

    @FXML
    private ToggleGroup rodzaj_pianki;

    @FXML
    private ToggleGroup rodzaj_uszczelki;

    @FXML
    private Label roller_liners;

    @FXML
    private RadioButton saranex_liners;

    @FXML
    private TextField thickness_liners;

    @FXML
    private TextField thincknes_tape;

    @FXML
    private Label weight_liners;

    @FXML
    void calculate_liners(ActionEvent event) {

    }

    @FXML
    void calculate_tape(ActionEvent event) {

    }

    @FXML
    void clear_liners(ActionEvent event) {

    }

    @FXML
    void clear_tape(ActionEvent event) {

    }

}