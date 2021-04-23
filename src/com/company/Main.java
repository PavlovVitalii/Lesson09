package com.company;

import com.company.observers.Father;
import com.company.observers.Mother;

public class Main {

    public static void main(String[] args) {
        IHumanLifecycleObserver[] observers = {new Mother(),new Father()};
        HumanLifecycle lifecycle = new HumanLifecycle(observers);
        lifecycle.run();
    }
}
