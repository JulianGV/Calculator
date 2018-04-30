package com.app.calculator.presenter;

import android.app.Activity;

import com.app.calculator.Operator;
import com.app.calculator.R;
import com.app.calculator.bus.RxBus;
import com.app.calculator.bus.observers.ProcessButtonBusObserver;
import com.app.calculator.model.OperationModel;
import com.app.calculator.view.OperationView;

public class OperationPresenter {

    private OperationModel model;
    private OperationView view;

    public OperationPresenter(OperationModel model, OperationView view) {
        this.model = model;
        this.view = view;
    }

    private void onButtonPressed() {
        if(!view.getFirstNumber().isEmpty()) model.setFirstNumber(Integer.parseInt(view.getFirstNumber()));
        else model.setFirstNumber(Integer.parseInt("0"));

        if(!view.getSecondNumber().isEmpty()) model.setSecondNumber(Integer.parseInt(view.getSecondNumber()));
        else model.setSecondNumber(Integer.parseInt("0"));

        if(!view.getOperator().equalsIgnoreCase(Operator.DEF.getSymbol())) {
            view.setResult(String.valueOf(model.getOperation(view.getOperator())));
        }
        else{
            view.showError(view.getContext().getString(R.string.error_operator_select));
        }
    }

    public void register() {
        Activity activity = view.getActivity();

        if (activity==null){
            return;
        }

        RxBus.subscribe(activity, new ProcessButtonBusObserver() {
            @Override
            public void onEvent(ProcessButtonBusObserver.MakeOperation value) {
                onButtonPressed();
            }
        });
    }

    public void unregister() {
        Activity activity = view.getActivity();

        if (activity==null){
            return;
        }
        RxBus.clear(activity);
    }
}
