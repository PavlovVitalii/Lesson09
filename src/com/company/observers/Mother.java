package com.company.observers;

import com.company.IHumanLifecycleObserver;

import java.time.LocalDate;

/**
 * @author Pavlov Vitaliy
 */

//public class Mother implements IHumanLifecycleObserver {
//    String mother = "Мама:";
//
//    @Override
//    public void onBirth(Birth birth) {
//        System.out.println(mother);
//        System.out.print("У нас " + (birth.isGender() ? "родилась дочь." : "родился сын."
//                + "C весом "));
//        System.out.printf("%.2f кг.\n", birth.getWeight());
//        System.out.println("---------------------------------------");
//    }
//
//    @Override
//    public void onKindergarten(Kindergarten kindergarten) {
//        System.out.println(mother);
//        System.out.println("Неужели мы пошли в сад УРРА!!!!"
//                + "\nНаш воспитатель: " + kindergarten.getNameEducator()
//                + "\nгрупа: " + kindergarten.getNumberGroup()
//                + "\nСад № " + kindergarten.getNumberKindergarten());
//        System.out.println("---------------------------------------");
//    }
//
//    @Override
//    public void onPartyInKindergarten(String holiday, boolean gender) {
//        System.out.println(mother);
//        System.out.println("Сегодня наш первый " + holiday + ".");
//        System.out.println((gender ? "Наша доченька в костюме снежинки." : "Наш сынок в костюме пирата."));
//        System.out.println("---------------------------------------");
//
//    }
//
//    @Override
//    public void onOlympiad(boolean plase, boolean gender) {
//        System.out.println(mother);
//        System.out.print("В олимпиаде по математеке мы заняли ");
//        System.out.println((plase ? "1-ое " : "2-ое") + " место.");
//        System.out.println("---------------------------------------");
//    }
//
//    @Override
//    public void onSchool(int numberSchool, String numberClass, String nameTeacher) {
//        System.out.println(mother);
//        System.out.println("Портфель купили, тетради купили к школе готовы."
//                + "\nНаша школа № " + numberSchool + "\nУчитель: " + nameTeacher
//                + "\nКласс: " + numberClass);
//        System.out.println("---------------------------------------");
//    }
//
//    @Override
//    public void onUniversity(String nameUnivercity, String specialty, boolean gender) {
//        System.out.println(mother);
//        System.out.println("Ура мы поступили в " + nameUnivercity + ".");
//        System.out.println("---------------------------------------");
//
//    }
//
//    @Override
//    public void onWork(String nameCompany, double salary, boolean gender) {
//        System.out.println(mother);
//        System.out.print(gender ? "Это ее " : "Это его ");
//        System.out.println("первая работа и зарплата " + salary + "USD.");
//        System.out.println("---------------------------------------");
//
//    }
//
//    @Override
//    public void onMarry(String name, String nameRestaurant, boolean gender) {
//        System.out.println(mother);
//        System.out.println("Как быстро летит время.\n"
//                + (gender ? "Наша доч выходит за муж!" : "Наш сын женится"));
//        System.out.println("Они красивая пара!");
//        System.out.println("---------------------------------------");
//
//    }
//
//    @Override
//    public void onBirthChiid(LocalDate date, boolean gender, double weight) {
//        System.out.println(mother);
//        System.out.println("Сегодня "
//                + date.toString()
//                + " один из самых счастливых дней!\n"
//                + (gender ? "У нас родилась внученька!" : "Унас родился внук!"));
//        System.out.println("---------------------------------------");
//
//    }
//
//    @Override
//    public void onTheEnd(String end) {
//
//    }
//}
