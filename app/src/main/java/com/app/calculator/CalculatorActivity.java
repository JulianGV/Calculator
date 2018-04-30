package com.app.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.calculator.model.OperationModel;
import com.app.calculator.presenter.OperationPresenter;
import com.app.calculator.view.OperationView;

public class CalculatorActivity extends AppCompatActivity {

    private OperationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        presenter = new OperationPresenter(new OperationModel(), new OperationView(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.register();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.unregister();
    }
}
