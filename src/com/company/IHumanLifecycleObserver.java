package com.company;

import java.time.LocalDate;

/**
 * @author Pavlov Vitaliy
 */

public interface IHumanLifecycleObserver {

    void onBirth(LocalDate date,boolean gender,double weight);
    void onKindergarten(int numberKindergarten,int numberGroup,String nameEducator);
    void onSchool(int numberSchool,String numberClass,String nameTeacher);
    void onUniversity(String city,String nameUnivercity,String specialty);
    void onMarry(LocalDate date,String name,String nameRestaurant,boolean gender);
    void onBirthChiid(LocalDate date,boolean gender,double weight);
    void onTheEnd(String end);

}
