import java.time.LocalDate;

public class Main {
    public static int identifierYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " этот год високостный");
        } else {
            System.out.println(year + " этот год не високостный");
        }
        return year;
    }
    public static void learnOS(int data, int OS) {
        if (data < 2015 && OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else if (OS == 0) {
            System.out.println("Установите  версию приложения для iOS");
        }
        if (data < 2015 && OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android");
        } else if (OS == 1) {
            System.out.println("Установите  версию приложения для Android");
        }
    }
    public static int deliveryCard(int distance) {
        int day = 1;
        if (distance < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (distance >= 20 && distance < 60) {
            day++;
            System.out.println("Потребуется дней: " + day);
        } else {
            day += 2;
            System.out.println("Потребуется дней: " + day);
        }
        return day;
    }
    public static void main(String[] args) {
        //задание 1
        identifierYear(1200);
        //Задание2
        int currentYear = LocalDate.now().getYear();
        int OS = 1;
        learnOS(currentYear, OS);
        //Задание3
        deliveryCard(45);


    }
}