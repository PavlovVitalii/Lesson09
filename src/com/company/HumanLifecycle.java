package com.company;


import java.time.LocalDate;

/**
 * @author Pavlov Vitaliy
 */

public class HumanLifecycle {

//    IHumanLifecycleObserver[] observers;
//    boolean gender;
//
//    public HumanLifecycle(IHumanLifecycleObserver[] observers) {
//        this.observers = observers;
//    }
//
//    public void run() {
//
//        runBirth();
//        runKindergarten();
//        runPartyInKindergarten();
//        runSchool();
//        runOlympiad();
//        runUniversity();
//        runWork();
//        runMarry();
//        runBirthChild();
//        runTheEnd();
//    }
//
//    private void runBirth() {
//        LocalDate dateBirth = LocalDate.now();
//        gender = Math.random() > 0.5;
//        double weight = 2.5 + Math.random() * 2.5;
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onBirth(dateBirth, gender, weight);
//        }
//    }
//
//    private void runKindergarten() {
//        int numberKindergarten = 1 + (int) (Math.random() * 100);
//        int numberGroup = 1 + (int) (Math.random() * 10);
//        String nameEducator = "Светлана Игоревна";
//
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onKindergarten(numberKindergarten, numberGroup, nameEducator);
//        }
//    }
//
//    private void runSchool() {
//        String[] nubersClass = {"1A", "1B", "1Г", "1Д"};
//        int numberSchool = 1 + (int) (Math.random() * 200);
//        String nameTeacher = "Ирана Николаевна";
//        String numberClass = nubersClass[((int) Math.random() * nubersClass.length)];
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onSchool(numberSchool, numberClass, nameTeacher);
//        }
//    }
//
//    private void runUniversity() {
//        String nameUniversity = "ХПИ";
//        String specialty = "экономика предприятия";
//
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onUniversity(nameUniversity, specialty, this.gender);
//        }
//    }
//
//    private void runMarry() {
//        String nameSpouse = gender ? "Женя" : "Юля";
//        String nameRestaurant = "Плакучая Ива";
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onMarry(nameSpouse, nameRestaurant, gender);
//        }
//    }
//
//    private void runBirthChild() {
//        LocalDate dateBirth = LocalDate.of(2045, 6, 26);
//        boolean gender = Math.random() > 0.5;
//        double weight = 2.5 + Math.random() * 2.5;
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onBirthChiid(dateBirth, gender, weight);
//        }
//    }
//
//    private void runPartyInKindergarten() {
//        String holyday = "Новогодний утренник";
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onPartyInKindergarten(holyday, gender);
//        }
//    }
//
//    private void runOlympiad() {
//        boolean plase = Math.random() > 0.5;
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onOlympiad(plase, gender);
//        }
//    }
//
//    private void runWork() {
//        String nameCompany = "Google";
//        double salary = 2000.0;
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onWork(nameCompany, salary, gender);
//        }
//    }
//
//    private void runTheEnd() {
//        String end = "the end";
//        System.out.println("The end");
//
//        for (int i = 0; i < observers.length; i++) {
//            observers[i].onTheEnd(end);
//        }
//    }

}
