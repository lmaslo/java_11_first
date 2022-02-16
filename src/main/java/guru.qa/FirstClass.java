package guru.qa;

public class FirstClass {
    public static void main(String[] args) {

        Course course = new Course();
        System.out.println("Название курса " + course.nameCourse);
        System.out.println("Номер потока " + course.numberFlow);

        int numberNextFlow = course.numberFlow + 1;
        System.out.println("Номер следующего потока " + numberNextFlow);
        int numberBackFlow = course.numberFlow - 1;
        System.out.println("Номер предыдущего потока " + numberBackFlow);

        System.out.println("Количество домашних заданий всех студентов " + course.countPeople * course.countHomeWork);

        int countALLHomeWork = course.countPeople * course.countHomeWork;
        System.out.println("Количество домашних заданий всех студентов " + countALLHomeWork);

        long countStringCode = 969655;
        System.out.println("Среднее количество (целое) строк кода на каждого студента " + countStringCode / course.countPeople);
        System.out.println("Остаток от деления от Количество строк кода на каждого студента " + countStringCode % course.countPeople);

        course.dateStart(10);
        course.dateStart(51);
        course.dateStart(60);

        course.accessNextLession(true);
        course.accessNextLession(false);

        if ((2 != 3) || (2 < 4))
        {
            System.out.println("текст");
        }


        int a=10;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);


        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);



        byte aByte; //8 bit: -128 .. 127 - попробовать переполнение в обе стороны


        byte aB =127;
        aB+= 1;
        System.out.println("Переполнение " + aB);

        byte aС =127;
        aС-= -128;
        System.out.println("Переполнение 2 " + aС);


        int count =10;
        long countLong = 100_000_000L;
        System.out.println(count+countLong);

    }


}


