package com.company;


import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Pavlov Vitaliy
 */

public class HumanLifecycle {

    IHumanLifecycleObserver[] observers;

    public HumanLifecycle(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    public void run() {

        runBirth();
        runKindergarten();
        runSchool();
        // в вуз
        // создал семъю
        // рождение детей
        // смерть
    }

    private void runBirth() {
        LocalDate dateBirth = LocalDate.now();
        boolean gender = Math.random() > 0.5;
        double weight = 2.5 + Math.random() * 2.5;

        for (int i = 0; i < observers.length; i++) {
            observers[i].onBirth(dateBirth, gender, weight);
        }
    }

    private void runKindergarten() {
        int numberKindergarten = 1 + (int) (Math.random() * 100);
        int numberGroup = 1 + (int) (Math.random() * 10);
        String nameEducator = "Ирина Игоревна";


        for (int i = 0; i < observers.length; i++) {
            observers[i].onKindergarten(numberKindergarten, numberGroup, nameEducator);
        }
    }

    private void runSchool() {
        Scanner in = new Scanner(System.in);
        String[] nubersClass = {"1A", "1B", "1Г", "1Д"};
        int numberSchool = 1 + (int) (Math.random() * 200);
        System.out.println("Введите имя учителя:");
        String nameTeacher = in.nextLine();
        String numberClass = nubersClass[((int) Math.random() * nubersClass.length)];
        in.close();
        for (int i = 0; i < observers.length; i++) {
            observers[i].onSchool(numberSchool, numberClass, nameTeacher);
        }
    }

    private void runUniversity() {
        String nameUniversity;
        String specialty;

    }

    private void runMarry() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести имя супруги/супруга:");
        String nameSpouse = in.nextLine();
        int year = (int) (2021 + Math.random() * 50);
        int month = (int) (1 + Math.random() * 30);
        int day = (int) (1 + Math.random() * 29);
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("Ввести название ресторана:");
        String nameRestaurant = in.nextLine();
        in.close();
    }

    private void runBirthChild() {
        // LocalDate dateBirth = this.date;
        boolean gender = Math.random() > 0.5;
        double weight = 2.5 + Math.random() * 2.5;
    }

    public void setDate(LocalDate date) {
        //this.date = date;

    }
}
