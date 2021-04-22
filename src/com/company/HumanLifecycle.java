package com.company;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Locale;

/**
 * @author Pavlov Vitaliy
 */

public class HumanLifecycle {

    IHumanLifecycleObserver[] observers;

    public HumanLifecycle(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    public void run(){

        // родился
        // пошел в де сад
        // в школу
        // в вуз
        // создал семъю
        // рождение детей
        // смерть
    }

    private void runBirth(LocaleData data,boolean gender,double weight){
        LocalDate dateBirth = LocalDate.now();
        
    }
}
