public class Main {
    public static void main(String[] args) {
        transient1();
        transient2();
        transient3();
        transient4();
        transient5();
    }

    public static void transient1() {
        System.out.println("HomeWork-1!");
        int clientOS = 0;
        if (clientOS <= 1) {
            System.out.printf(" Если операционная система равна " + clientOS + ", то установите версию " +
                    " приложения для IOS по ссылке. " + " А если операционная система больше " + clientOS +
                    ", то установите версию приложения для Android по ссылке ");
        }
    }

    public static void transient2() {
        System.out.println("HomeWork-2!");
        int clientDeviceYear = 2015;
        int clientOS = 0;
        if (clientDeviceYear <= 2015 && clientOS <= 1) {
            System.out.printf(" Если операционная система выпускалась раньше " + clientDeviceYear + " года и равнялась " +
                    +clientOS + " , то необходимо установить облегченную версию приложения для iOS по ссылке. "
                    + " А если операционную систему выпустили позже " + clientDeviceYear +
                    " года и она больше " + clientOS +
                    " , то необходимо установить облегченную версию приложения для Android по ссылке");
            if (clientDeviceYear > 2015);
            System.out.printf(" Для пользователей телефонов " + clientDeviceYear + " года выпуска и позже необходимо " +
                    "установить обычные версии приложений для iOS и Android по ссылке");
        }
    }

    public static void transient3() {
        System.out.println("HomeWork-3!");
        int year = 2021;
        if (year >= 2020) {
            System.out.printf(+year + " год не является високосным. ");
        }
        if (year <= 2021) {
            System.out.printf(" 2020 год является високосным ");
        }
    }

    public static void transient4() {
        System.out.println("HomeWork-4!");
        int deliveryDistance = 95;
        int deliveryDistance1 = 20;
        int deliveryDistance2 = 60;
        if (deliveryDistance <= 95 || deliveryDistance2 <= 60 || deliveryDistance1 <= 20) {
            System.out.printf(" На доставку до " + deliveryDistance + " киллометров, потребуется 3 дня " +
                    ", на доставку до " + deliveryDistance2 + " киллометров, потребуется 2 дня, " + "а на доставку до "
                    + deliveryDistance1 + " киллометров потребуется 1 день.");
        }
    }

    public static void transient5() {
        System.out.println("HomeWork-5!");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.printf(" Декабрь - принадлежит к сезону зима ");
            case 2:
                System.out.printf(" Январь - принадлежит к сезону зима ");
            case 3:
                System.out.printf(" Февраль - принадлежит к сезону зима ");
            case 4:
                System.out.printf(" Март - принадлежит к сезону весна ");
            case 5:
                System.out.printf(" Апрель - принадлежит к сезону весна ");
            case 6:
                System.out.printf(" Май - принадлежит к сезону весна ");
            case 7:
                System.out.printf(" Июнь - принадлежит к сезону лето ");
            case 8:
                System.out.printf(" Июль - принадлежит к сезону лето ");
            case 9:
                System.out.printf(" Август - принадлежит к сезону лето ");
            case 10:
                System.out.printf(" Сентябрь - принадлежит к сезону осень ");
            case 11:
                System.out.printf(" Октябрь - принадлежит к сезону осень ");
            case 12:
                System.out.printf(" Ноябрь - принадлежит к сезону осень ");
            default:
                System.out.printf(" 13-го и последующих месяцев больше нет ");
        }
    }
}