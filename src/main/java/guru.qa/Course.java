package guru.qa;

import java.util.Date;

public class Course {
    String nameCourse = "qa.guru";
    byte numberFlow = 11;
    short countPeople = 150;
    int countHomeWork = 10;

    public static void dateStart(int countStudent) {
        Date currentDate = new Date();
        if (countStudent < 50) {
            System.out.println("ЖДем еще студентов");
        } else if (countStudent >= 50 && countStudent < 60) {
            System.out.println("Набираем еще студентов. Дата старта через 2 недели");
            long time = currentDate.getTime();
            long anotherDate = +14;
            time = time + (60 * 60 * 24 * 1000 * anotherDate);
            currentDate = new Date(time);
            System.out.println("Дата старта " + currentDate);
        } else if (countStudent >= 60) {
            System.out.println("Набор студентов закончен");
            long time = currentDate.getTime();
            long anotherDate = +1;
            time = time + (60 * 60 * 24 * 1000 * anotherDate);
            currentDate = new Date(time);
            System.out.println("Дата старта завтра " + currentDate);
        }

    }


    public static void accessNextLession(boolean homeWork) {
        if (homeWork == true) {
            System.out.println("Доступ открыт по ссылке ya.ru");
        } else {
            System.out.println("Необходимо выполнить домашнее задание");
        }

    }


}
