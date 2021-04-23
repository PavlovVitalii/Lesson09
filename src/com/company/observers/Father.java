package com.company.observers;

import com.company.IHumanLifecycleObserver;

import java.time.LocalDate;

/**
 * @author Pavlov Vitaliy
 */

public class Father implements IHumanLifecycleObserver {

    String father = "Папа:";

    @Override
    public void onBirth(LocalDate date, boolean gender, double weight) {
        System.out.println(father);
        System.out.println(date.toString()
                + (gender ? "\nРодилась дочь." : "\nРодился сын."));
        System.out.printf("Вес: %.2f\n", weight);
        System.out.println("------------------------------------");
    }

    @Override
    public void onKindergarten(int numberKindergarten, int numberGroup, String nameEducator) {
        System.out.println(father);
        System.out.println("Сегодня нужно ребенка забрать из садика, какая група?");
        System.out.println(numberGroup + " или 11.");
        System.out.println("----------------------------------");

    }

    @Override
    public void onSchool(int numberSchool, String numberClass, String nameTeacher) {
        System.out.println(father);
        System.out.println("Я тоже учился в этой школе и мой первый класс был " + numberClass);
        System.out.println("Учителя зовут кажется " + nameTeacher);
        System.out.println("----------------------------------");

    }

    @Override
    public void onUniversity( String nameUnivercity, String specialty, boolean gender) {
        System.out.println(father);
        System.out.println(gender ? "Дочь совсем стала взрослой поступила в " :
                "Сын стал взрослым и поступил в ");
        System.out.println(nameUnivercity + " на специальность " + specialty);
        System.out.println("----------------------------------");

    }

    @Override
    public void onMarry( String name, String nameRestaurant, boolean gender) {
        System.out.println(father);
        System.out.println(name + " Будет замечательной парой для "
                + (gender ? "моей дочери.":"моего сына."));
        System.out.println("Ресторан " + nameRestaurant + " очень красивое место.");
        System.out.println("----------------------------------");

    }

    @Override
    public void onBirthChiid(LocalDate date, boolean gender, double weight) {
        System.out.println(father);
        System.out.println("Сегодня " + (gender ? "родилась наша внучка.":"родился на внук."));


    }

    @Override
    public void onTheEnd(String end) {

    }
}
