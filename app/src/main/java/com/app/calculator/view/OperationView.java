package com.app.calculator.view;

import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.app.calculator.Operator;
import com.app.calculator.R;
import com.app.calculator.bus.RxBus;
import com.app.calculator.bus.observers.ProcessButtonBusObserver;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OperationView extends ActivityView  {

    @BindView(R.id.text_fisrt_number)  EditText firstNumber;
    @BindView(R.id.text_second_number) EditText secondNumber;
    @BindView(R.id.select_operator) Spinner operator;
    @BindView(R.id.text_result) TextView result;

    public OperationView(AppCompatActivity activity) {
        super(activity);
        ButterKnife.bind(this, activity);
        init();
    }

    private void init(){
        //initialize spinner
        ArrayList<String> operators = new ArrayList<>();
        operators.add(Operator.DEF.getSymbol());
        operators.add(Operator.ADD.getSymbol());
        operators.add(Operator.DIV.getSymbol());
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_item, operators);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operator.setAdapter(dataAdapter);
    }

    public void setResult(String resultNumber) {
        result.setText(resultNumber);
    }

    public String getFirstNumber() {
        return firstNumber.getText().toString();
    }

    public String getSecondNumber() {
        return secondNumber.getText().toString();
    }

    public String getOperator() {
        return operator.getSelectedItem().toString();
    }

    public void showError(String error) {
        Toast.makeText(getContext(),error,
                Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.btn_operate)
    public void makeOperation() {
        RxBus.post(new ProcessButtonBusObserver.MakeOperation());
    }
}
