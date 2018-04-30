package com.app.calculator.model;

public class OperationModel {

    private double firstNumber;
    private double secondNumber;
    private double result;

    public double getOperation(String operator){
        switch(operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
        }
        return  result;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
