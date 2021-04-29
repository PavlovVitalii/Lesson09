package com.company;


import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
//        IHumanLifecycleObserver[] observers = {new Mother(), new Father()};
//        HumanLifecycle lifecycle = new HumanLifecycle(observers);
//        lifecycle.run();
        Main main = new Main();
        main.run();

    }


    IHumanLifecycleObserver lifecycleObserver = new IHumanLifecycleObserver() {

        @Override
        public void onBirth(Birth birth) {
            birth.date = LocalDate.now();
            birth.gender = true;
            birth.weight = 3.5;
            System.out.println("Рождение.");
            System.out.println("Дата: " + birth.date);
            System.out.println("Вес: " + birth.weight);
            System.out.println("Пол: " + (birth.gender ? "Мальчик" : "Девочка") + "\n");
        }

        @Override
        public void onKindergarten(Kindergarten kindergarten) {
            kindergarten.numberKindergarten = 100;
            kindergarten.numberGroup = 8;
            kindergarten.nameEducator = "Ирина Петровна";
            System.out.println("Садик.");
            System.out.println("Сад № " + kindergarten.numberKindergarten);
            System.out.println("Группа № " + kindergarten.numberGroup);
            System.out.println("Воспитатель: " + kindergarten.nameEducator + "\n");
        }

        @Override
        public void onPartyInKindergarten() {
            String holiday = "Новогодний утренник.";
            System.out.println("Праздник в детскам саду.");
            System.out.println(holiday + "\n");
        }

        @Override
        public void onOlympiad() {
            boolean plase = true;
            System.out.println("Олипиада по математике.");
            System.out.println((plase ? "Первое место." : "Второе место.") + "\n");
        }

        @Override
        public void onSchool(School school) {
            school.numberSchool = 128;
            school.numberClass = "1-B";
            school.nameTeacher = "Светлана Игоревна";
            System.out.println("Поход в школу.");
            System.out.println("Школа №" + school.numberSchool);
            System.out.println("Класс: " + school.numberClass);
            System.out.println("Учитель: " + school.nameTeacher);
            System.out.println();

        }

        @Override
        public void onUniversity(University university) {
            university.nameUnivercity = "ХПИ";
            university.specialty = "экономика предприятия";
            System.out.println("Поступление.");
            System.out.println("Университет: " + university.nameUnivercity);
            System.out.println("Специальность: " + university.specialty);
            System.out.println("");
        }

        @Override
        public void onWork(Work work) {
            work.nameCompany = "Oracle";
            work.salary = 800;
            System.out.println("Работа.");
            System.out.println("Компания: " + work.nameCompany);
            System.out.println("Зарплата: " + work.salary + " USD");
            System.out.println();
        }

        @Override
        public void onMarry(Marry marry) {
            marry.name = marry.gender ? "Маша" : "Вася";
            marry.nameRestaurant = "Арарат";
            System.out.println("Свадьба.");
            System.out.println("Имя " + (marry.gender ? "невесты " : "жениха ")
                    + marry.name);
            System.out.println("Ресторан: " + marry.nameRestaurant);
            System.out.println();
        }

        @Override
        public void onBirthChiid(Birth birth) {
            birth.date = LocalDate.of(2041, 06, 26);
            birth.weight = 3.8;
            birth.gender = false;
            System.out.println("Рождение детей.");
            System.out.println("Дата: " + birth.date);
            System.out.println("Вес: " + birth.weight);
            System.out.println("Пол: " + (birth.gender ? "Мальчик" : "Девочка") + "\n");
        }

        @Override
        public void onTheEnd() {
            System.out.println("THE END");
        }

    };

    private void run() {
        lifecycleObserver.onBirth(new IHumanLifecycleObserver.Birth());
        lifecycleObserver.onKindergarten(new IHumanLifecycleObserver.Kindergarten());
        lifecycleObserver.onPartyInKindergarten();
        lifecycleObserver.onSchool(new IHumanLifecycleObserver.School());
        lifecycleObserver.onOlympiad();
        lifecycleObserver.onUniversity(new IHumanLifecycleObserver.University());
        lifecycleObserver.onWork(new IHumanLifecycleObserver.Work());
        lifecycleObserver.onMarry(new IHumanLifecycleObserver.Marry());
        lifecycleObserver.onBirthChiid(new IHumanLifecycleObserver.Birth());
        lifecycleObserver.onTheEnd();
    }
}
