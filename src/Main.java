import java.time.LocalDate;

public class Main {
    static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    // Первый вариант решения задачи №2
    static void installationSoftware_1(int clientOS, int clientDeviceYear) {
        int androidOS = 1;
        String result = "";
        if (clientOS == androidOS) {
            result += "Android";
        } else {
            result += "iOS";
        }
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для " + result + " по ссылке");
        } else {
            System.out.println("Ссылка на скачивание приложения для " + result);
        }
    }

    // Второй вариант решения задачи №2
    static String getClientOS(int clientOS) {
        int androidOS = 1;
        if (clientOS == androidOS) {
            return "Android";
        } else {
            return "iOS";
        }
    }

    static String getClientDeviceYear(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            return "облегченной версии приложения";
        } else {
            return "приложения";
        }
    }

    static void installationSoftware_2(int clientOS, int clientDeviceYear) {
        String OS = getClientOS(clientOS);
        String deviceYear = getClientDeviceYear(clientDeviceYear);
        System.out.println("Ссылка для скачивания " + deviceYear + " для " + OS);
    }

    static int calculationDeliveryDays(int deliveryDistance) {
        int amountDays = 1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            return amountDays;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return amountDays++;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            return amountDays += 2;
        }
        return amountDays;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int year = 1831;
        checkYear(year);

        System.out.println("Задача 2:");
        int clientDeviceYear = 2021;
        int clientOS = 1;
        installationSoftware_1(clientOS, clientDeviceYear);//Первый вариант решения задачи №2
        installationSoftware_2(clientOS, clientDeviceYear);//Второй вариант решения задачи №2

        System.out.println("Задача 3:");
        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставки на дальние расстояния нет");
        } else {
            System.out.println("Потребуется дней: " + calculationDeliveryDays(deliveryDistance));
        }
    }
}

