package com.company;


import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Pavlov Vitaliy
 */

public class HumanLifecycle {

    IHumanLifecycleObserver[] observers;
    boolean gender;

    public HumanLifecycle(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    public void run() {

        runBirth();
        runKindergarten();
        runSchool();
        runUniversity();
        runMarry();
        runBirthChild();
        // смерть
    }

    private void runBirth() {
        LocalDate dateBirth = LocalDate.now();
        gender = Math.random() > 0.5;
        double weight = 2.5 + Math.random() * 2.5;

        for (int i = 0; i < observers.length; i++) {
            observers[i].onBirth(dateBirth, gender, weight);
        }
    }

    private void runKindergarten() {
        int numberKindergarten = 1 + (int) (Math.random() * 100);
        int numberGroup = 1 + (int) (Math.random() * 10);
        String nameEducator = "Светлана Игоревна";


        for (int i = 0; i < observers.length; i++) {
            observers[i].onKindergarten(numberKindergarten, numberGroup, nameEducator);
        }
    }

    private void runSchool() {
        String[] nubersClass = {"1A", "1B", "1Г", "1Д"};
        int numberSchool = 1 + (int) (Math.random() * 200);
        String nameTeacher = "Ирана Николаевна";
        String numberClass = nubersClass[((int) Math.random() * nubersClass.length)];

        for (int i = 0; i < observers.length; i++) {
            observers[i].onSchool(numberSchool, numberClass, nameTeacher);
        }
    }

    private void runUniversity() {
        String city = "Харьков";
        String nameUniversity = "ХПИ";
        String specialty = "экономика предприятия";


        for (int i = 0; i < observers.length; i++) {
            observers[i].onUniversity(city, nameUniversity, specialty);
        }
    }

    private void runMarry() {
        String nameSpouse = gender ? "Женя" : "Юля";
        LocalDate date = LocalDate.of(2041, 7, 2);
        String nameRestaurant = "Плакучая Ива";

        for (int i = 0; i < observers.length; i++) {
            observers[i].onMarry(date, nameSpouse, nameRestaurant, gender);
        }
    }

    private void runBirthChild() {
        LocalDate dateBirth = LocalDate.of(2045, 6, 26);
        boolean gender = Math.random() > 0.5;
        double weight = 2.5 + Math.random() * 2.5;

        for (int i = 0; i < observers.length; i++) {
            observers[i].onBirthChiid(dateBirth, gender, weight);
        }
    }

    private void runTheEnd() {
        String end = "the end";

        for (int i = 0; i < observers.length; i++) {
            observers[i].onTheEnd(end);
        }
    }

}
