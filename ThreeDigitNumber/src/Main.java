import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Пользователь вводит трехзначное число. Найдите:
        //Число единиц, десятков.
//Сумму цифр
        //Для решения можно использовать арифметический
        //оператор % - остаток от деления

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трех значное число: ");
        int number = scanner.nextInt();


            int units = number % 10;

            // Находим число десятков (избавляемся от единиц с помощью /10, потом берем остаток от деления на 10)
            int tens = (number / 10) % 10;

            // Находим число сотен (делим число на 100)
            int hundreds = number / 100;

            // Находим сумму цифр
            int sumOfDigits = units + tens + hundreds;

            // Вывод результата
            System.out.println("Число сотен: " + hundreds);
            System.out.println("Число десятков: " + tens);
            System.out.println("Число единиц: " + units);
            System.out.println("Сумма цифр: " + sumOfDigits);
            scanner.close();




    }
}