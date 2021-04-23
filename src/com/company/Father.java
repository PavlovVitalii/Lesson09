package com.company;

import java.time.LocalDate;

/**
 * @author Pavlov Vitaliy
 */

public class Father implements IHumanLifecycleObserver{

    String father = "Папа:";

    @Override
    public void onBirth(LocalDate date, boolean gender, double weight) {
        System.out.println(father);
        System.out.println(date.toString()
        + (gender ? "\nРодилась дочь.":"\nРодился сын."));
    }

    @Override
    public void onKindergarten(int numberKindergarten, int numberGroup, String nameEducator) {

    }

    @Override
    public void onSchool(int numberSchool, String numberClass, String nameTeacher) {

    }

    @Override
    public void onUniversity(String city, String nameUnivercity, String specialty) {

    }

    @Override
    public void onMarry(LocalDate date, String name, String nameRestaurant, boolean gender) {

    }

    @Override
    public void onBirthChiid(LocalDate date, boolean gender, double weight) {

    }

    @Override
    public void onTheEnd(String end) {

    }
}
