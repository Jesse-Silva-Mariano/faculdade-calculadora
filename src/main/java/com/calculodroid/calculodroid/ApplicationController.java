package com.calculodroid.calculodroid;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;


public class ApplicationController {

    /*
    * Criando o objeto da calculatorEngine responsável pelo sistema lógico
    * da calculadora.
     */
    CalculatorEngine calculator = new CalculatorEngine();

    //flag do reset da calculadora.
    boolean reset = false;

    private List<Integer> digit = new ArrayList();


    /////////////////////////////////////////////////////////////////////////
    //FXML///////FXML///////FXML///////FXML///////FXML///////FXML//////FXML//
    /////////////////////////////////////////////////////////////////////////

    @FXML
    private AnchorPane anpCalculator;

    @FXML
    private Button btnAC;

    @FXML
    private Button btnAddition;

    @FXML
    private Button btnBackSpace;

    @FXML
    private Button btnComma;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnMultiplication;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnParentheses;

    @FXML
    private Button btnPercentage;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnSubtraction;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnZero;

    @FXML
    private Text txtTextNumber;

    @FXML
    private Text txtArithmeticSigns;

    @FXML
    private Text txtTextNumberSecond;

    @FXML
    private VBox vboxCalculator;

    @FXML
    void btnACAction(ActionEvent event) {
        calculator.clear();
//        digit.clear();
        txtTextNumber.setText("0");
        txtTextNumberSecond.setText("");
        txtArithmeticSigns.setText("");
    }


    @FXML
    void btnPercentageAction(ActionEvent event) {

    }

    @FXML
    void btnParenthesesAction(ActionEvent event) {

    }


    @FXML
    void btnCommaAction(ActionEvent event) {


    }


    @FXML
    void btnBackSpaceAction(ActionEvent event) {
        calculator.backSpace();
//        if (calculator.getValueDouble() != calculator.getValue()){
//            txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
//        } else {
//            txtTextNumber.setText(String.valueOf(calculator.getValue()));
//        }
        reset = false;
    }


    @FXML
    void btnEqualAction(ActionEvent event) {
        calculator.calculate();
        digit.clear();
        if (calculator.getResultValue() != calculator.getResultValueDouble()){
            txtTextNumber.setText(String.valueOf(calculator.getResultValueDouble()));
        } else {
            txtTextNumber.setText(String.valueOf(calculator.getResultValue()));
        }
        txtArithmeticSigns.setText("");
//        txtTextNumberSecond.setText("");
        reset = true;
    }

    @FXML
    void btnAdditionAction(ActionEvent event) {
//        txtTextNumberSecond.setText(String.valueOf(calculator.getValue()));
        calculator.addition();
        digit.clear();
        txtTextNumber.setText("0");
        txtArithmeticSigns.setText("+");
        if (calculator.getValueDouble() != calculator.getValue()){
            txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
        } else {
            txtTextNumber.setText(String.valueOf(calculator.getValue()));
        }

        reset = false;
    }

    @FXML
    void btnSubtractionAction(ActionEvent event) {
//        txtTextNumberSecond.setText(String.valueOf(calculator.getValue()));
        calculator.subtraction();
        digit.clear();
        txtTextNumber.setText("0");
        txtArithmeticSigns.setText("-");
        if (calculator.getValueDouble() != calculator.getValue()){
            txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
        } else {
            txtTextNumber.setText(String.valueOf(calculator.getValue()));
        }
        reset = false;
    }

    @FXML
    void btnMultiplicationAction(ActionEvent event) {
//        txtTextNumberSecond.setText(String.valueOf(calculator.getValue()));
        calculator.multiplication();
        digit.clear();
        txtTextNumber.setText("0");
        txtArithmeticSigns.setText("x");
        if (calculator.getValueDouble() != calculator.getValue()){
            txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
        } else {
            txtTextNumber.setText(String.valueOf(calculator.getValue()));
        }
        reset = false;
    }

    @FXML
    void btnDivisionAction(ActionEvent event) {
        txtTextNumberSecond.setText(String.valueOf(calculator.getValue()));
        calculator.division();
        digit.clear();
        txtTextNumber.setText("0");
        txtArithmeticSigns.setText("÷");
        if (calculator.getValueDouble() != calculator.getValue()){
            txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
        } else {
            txtTextNumber.setText(String.valueOf(calculator.getValue()));
        }
        reset = false;
    }

    @FXML
    void btnOneAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(1);
            digit.clear();
            digit.add(1);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(1);
            digit.add(1);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }

    }

    @FXML
    void btnTwoAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(2);
            digit.clear();
            digit.add(2);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(2);
            digit.add(2);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }

    }

    @FXML
    void btnThreeAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(3);
            digit.clear();
            digit.add(3);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(3);
            digit.add(3);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }

    }

    @FXML
    void btnFourAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(4);
            digit.clear();
            digit.add(4);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(4);
            digit.add(4);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }
    }

    @FXML
    void btnFiveAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(5);
            digit.clear();
            digit.add(5);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(5);
            digit.add(5);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }
    }

    @FXML
    void btnSixAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(6);
            digit.clear();
            digit.add(6);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(6);
            digit.add(6);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }
    }

    @FXML
    void btnSevenAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(7);
            digit.clear();
            digit.add(7);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(7);
            digit.add(7);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }
    }

    @FXML
    void btnEightAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(8);
            digit.clear();
            digit.add(8);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(8);
            digit.add(8);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }
    }

    @FXML
    void btnNineAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(9);
            digit.clear();
            digit.add(9);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(9);
            digit.add(9);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }
    }

    @FXML
    void btnZeroAction(ActionEvent event) {
        if (reset){
            calculator.clear();
            calculator.digit(0);
            digit.clear();
            digit.add(0);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
            reset = false;
        } else {
            calculator.digit(0);
            digit.add(0);
            if (calculator.getValueDouble() != calculator.getValue()){
                txtTextNumber.setText(String.valueOf(calculator.getValueDouble()));
            } else {
                txtTextNumber.setText(String.valueOf(calculator.getValue()));
            }
        }
    }

}
