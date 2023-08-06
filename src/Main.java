public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int firstOne = 1000000;
        byte secondOne = 100;
        short thirdOne = 10000;
        long fourthOne = 1000000000;
        float fifthOne = 1.1F;
        double sixthOne = 1.111;
        System.out.println("Значение переменной firstOne с типом int равно " + firstOne);
        System.out.println("Значение переменной secondOne с типом byte равно " + secondOne);
        System.out.println("Значение переменной thirdOne с типом short равно " + thirdOne);
        System.out.println("Значение переменной fourthOne с типом long равно " + fourthOne);
        System.out.println("Значение переменной fifthOne с типом float равно " + fifthOne);
        System.out.println("Значение переменной sixthOne с типом double равно " + sixthOne);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        short d = -159;
        short e = 569;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        int allStudents = lp + as + ea;
        int paperForStudent = paper / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");


    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte oneHour = 60;
        int twentyMinutes = oneHour / 3;
        int inTwenty = (twentyMinutes / 2) * bottles;
        System.out.println("За 20 минут машина произвела " + inTwenty + " штук бутылок");

        int oneDay = oneHour * 24;
        int inDay = (oneDay / 2) * bottles;
        System.out.println("За сутки машина произвела " + inDay + " штук бутылок");

        int threeDays = oneDay * 3;
        int inThreeDays = (threeDays / 2) * bottles;
        System.out.println("За три дня машина произвела " + inThreeDays + " штук бутылок");

        int oneMonth = threeDays * 10;
        int inMonth = (oneMonth / 2) * bottles;
        System.out.println("За три дня машина произвела " + inMonth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte allPaints = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int howManyClasses = allPaints / (whitePaint + brownPaint);
        int howManyWhite = howManyClasses * whitePaint;
        int howManyBrown = howManyClasses * brownPaint;
        System.out.println("В школе, где " + howManyClasses + " классов, нужно " + howManyWhite + " банок белой краски и " + howManyBrown + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");
        short bananaWeight = 80;
        short milkWeight = 105;
        short iceCreamWeight = 100;
        short eggWeight = 70;

        int fiveBananas = bananaWeight * 5;
        int twoMilk = milkWeight * 2;
        int twoIceCreams = iceCreamWeight * 2;
        int fourEggs = eggWeight * 4;

        float breakfastGr = fiveBananas + twoMilk + twoIceCreams + fourEggs;
        float breakfastKg = breakfastGr / 1000;

        System.out.println(breakfastGr + "гр или " + breakfastKg + "кг");

    }

}