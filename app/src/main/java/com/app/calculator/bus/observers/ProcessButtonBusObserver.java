package com.app.calculator.bus.observers;

public abstract class ProcessButtonBusObserver extends BusObserver<ProcessButtonBusObserver.MakeOperation> {
    public ProcessButtonBusObserver() {
        super(MakeOperation.class);
    }

    public static class MakeOperation {
    }
}