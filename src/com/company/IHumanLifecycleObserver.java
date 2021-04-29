package com.company;

import java.time.LocalDate;

/**
 * @author Pavlov Vitaliy
 */

public interface IHumanLifecycleObserver {

    class Birth {

        LocalDate date;
        boolean gender;
        double weight;

    }

    class Kindergarten {
        int numberKindergarten;
        int numberGroup;
        String nameEducator;


    }

    class School {
        int numberSchool;

        String numberClass;

        String nameTeacher;


    }

    class University {
        String nameUnivercity;
        String specialty;
        boolean gender;

    }

    class Work {
        String nameCompany;
        double salary;
        boolean gender;


    }

    class Marry {
        String name;
        String nameRestaurant;
        boolean gender;


    }

    void onBirth(Birth birth);

    void onKindergarten(Kindergarten kindergarten);

    void onPartyInKindergarten();

    void onOlympiad();

    void onSchool(School school);

    void onUniversity(University university);

    void onWork(Work work);

    void onMarry(Marry marry);

    void onBirthChiid(Birth birth);

    void onTheEnd();

}
