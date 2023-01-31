import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
        //task4();
        //task5();
    }



    public static void task1() {

        System.out.println("Задача 1");
        findYear(2016);

        //int year = 2020;
        //if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            //System.out.println(year + " год является високосным");
        //} else {
            //System.out.println(year + " год не является високосным");
        }
    public static int findYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return year;

    }
    public static void task2() {
        System.out.println("Задача 2");
        osYear(2, 2022);
    }
    public static void osYear (int clientOS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year >= currentYear) {
            System.out.println("Установите текущую версию приложения для iOS по ссылке");
        }
        if (clientOS == 2 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 2 && year >= currentYear) {
            System.out.println("Установите текущую версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        daysOfDelivary(95);

    }
    public static void daysOfDelivary (int deliveryDistance){
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays +1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    }
