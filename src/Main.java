import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void testYear(int testingYear) {
        if (testingYear % 4 == 0 && testingYear % 100 != 0 || testingYear % 400 == 0) {
            System.out.println(testingYear + " год является високосным");
        } else {
            System.out.println(testingYear + " год не является високосным");
        }
    }
    public static void supportVersion(int clientOS, int yearPhone) {
        if (clientOS == 1 && yearPhone >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");

        } else if (clientOS == 0 && yearPhone >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int deliveryNeedDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год для проверки високосного года: ");
        testYear(scanner.nextInt());
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая у вас операционная система, введите '0' если Android - '1' если IOS : ");
        int clientOS = Integer.parseInt(scanner.next());
        if (clientOS < 0 || clientOS > 1) {
            throw new RuntimeException("Недопустимое значение !");
        }
        System.out.println("Год выпуска вашего мобильного телефона: ");
        int clientDeviceYear = Integer.parseInt(scanner.next());

        supportVersion(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние для определения срока доставки карты: ");
        int deliveryDistance = Integer.parseInt(scanner.next());
        int days = deliveryNeedDays(deliveryDistance);
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет! ");
        } else if (days < 1) {
            System.out.println("Некорректное значение!");
        } else {
            System.out.println("Потребуется дней для доставки карты " + days + " сутки!");
        }
    }
}