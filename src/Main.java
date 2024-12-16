import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача 1
//Реализуйте метод, который получает в качестве параметра год, проверяет,
//является ли он високосным, и выводит результат в консоль.
//Эту проверку вы уже реализовывали в задании по условным операторам.
//Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
//Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
//«...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
        checkYear(2024);
        checkYear(1985);
        checkYear(1500);

//Задача 2
//Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
//Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
//Если устройство старше текущего года, предложите ему установить облегченную версию.
//Текущий год можно получить таким способом:
//int currentYear = LocalDate.now().getYear();
//Или самим задать значение вручную — ввести в переменную числовое значение.
//В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.

        checkAppVersion(1,2014);
        checkAppVersion(0,2024);
//Задача 3
//Возвращаемся к задаче на расчет дней доставки банковской карты.
//Ваша задача — доработать код, а именно написать метод, который на вход принимает
//дистанцию и возвращает итоговое количество дней доставки.

        System.out.println("Количество дней доставки:"+ checkDeliveryDistance(50));
        System.out.println("Количество дней доставки:"+ checkDeliveryDistance(10));
        System.out.println("Количество дней доставки:"+ checkDeliveryDistance(150));

    }
    public static void checkYear (int year) {
        if ((year > 1584 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
                System.out.println(year + " год является високосным");

            }else {
                System.out.println(year + " год не является високосным");
            }

        if (year <= 1584) {
            System.out.println(year + " год не является високосным тк грегорианского каленаря еще не существовало");
        }
    }
    public static void checkAppVersion (int OS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < 2015 && OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientDeviceYear < 2015 && OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }
    public static int checkDeliveryDistance (int deliveryDistance) {
        int deliveryDays;
        
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        }
        else if (deliveryDistance>=20 && deliveryDistance<60){
            deliveryDays = 2;
            } else if (deliveryDistance>=60 && deliveryDistance<100) {
            deliveryDays = 3;
        }
        else {
            deliveryDays = 365;
        }
        return deliveryDays;
    }

}