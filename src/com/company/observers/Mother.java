package com.company.observers;

import com.company.IHumanLifecycleObserver;

import java.time.LocalDate;

/**
 * @author Pavlov Vitaliy
 */

public class Mother implements IHumanLifecycleObserver {
    String mother = "Мама:";

    @Override
    public void onBirth(LocalDate date, boolean gender, double weight) {
        System.out.println(mother);
        System.out.print("У нас " + (gender ? "родилась дочь." : "родился сын."
                + "C весом "));
        System.out.printf("%.2f кг.\n",weight);
        System.out.println("---------------------------------------");
    }

    @Override
    public void onKindergarten(int numberKindergarten, int numberGroup, String nameEducator) {
        System.out.println(mother);
        System.out.println("Неужели мы пошли в сад УРРА!!!!"
                + "\nНаш воспитатель: " + nameEducator + "\nгрупа: " + numberGroup
                + "\nСад № " + numberKindergarten);
        System.out.println("---------------------------------------");
    }

    @Override
    public void onSchool(int numberSchool, String numberClass, String nameTeacher) {
        System.out.println(mother);
        System.out.println("Портфель купили, тетради купили к школе готовы."
                + "\nНаша школа № " + numberSchool + "\nУчитель: " + nameTeacher
                + "\nКласс: " + numberClass);
        System.out.println("---------------------------------------");
    }

    @Override
    public void onUniversity( String nameUnivercity, String specialty,boolean gender) {
        System.out.println(mother);
        System.out.println("Ура мы поступили в " + nameUnivercity);
        System.out.println("---------------------------------------");

    }

    @Override
    public void onMarry( String name, String nameRestaurant, boolean gender) {
        System.out.println(mother);
        System.out.println("Как быстро летит время.\n"
                + (gender ? "Наша доч выходит за муж!" : "Наш сын женится"));
        System.out.println("Они красивая пара!");
        System.out.println("---------------------------------------");

    }

    @Override
    public void onBirthChiid(LocalDate date, boolean gender, double weight) {
        System.out.println(mother);
        System.out.println("Сегодня "
                + date.toString()
                + " один из самых счастливых дней!\n"
                + (gender ? "У нас родилась внученька!" : "Унас родился внук!"));
    }

    @Override
    public void onTheEnd(String end) {

    }
}