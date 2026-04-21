/*

Ты выиграл тендер - разработать для Ивана Цыгановича (бизнес-коуча по денежной энергетике)
программу для системы допуска на закрытую бизнес-встречу.

У посетителя есть:
    1. возраст *
    2. сумма денег на счёте *
    3. приглашение *
    4. статус в чёрном списке *

Чек-лист что сделать:
     Сгенерируй с помощью класса Random:
        1. Возраст посетителя (целое число) *
        2. Сумму денег на счете (вещественное число) *

Задай вручную переменные:
    1. Есть ли у посетителя приглашение *
    2. Находится ли посетитель в черном списке *
    3. Выведи в консоль результат - проходит пользователь или нет (достаточно вывести булевое значение true/false)

Посетитель проходит, если:
    1. Ему есть 18 лет
    2. У него есть приглашение или на счёте больше 50000
    3. Не в черном списке
        Каждое из этих значений должно быть сохранено в свою булевую (логическую) переменную.

---------------------------
Посчитай и выведи "обязательный добровольный взнос" участника за участие в мероприятии (7.5% от суммы на его счете)*/

import java.util.Random;

public class Tender_ {
    public static void main(String[] args) {

        int age;
        double amountOfCash;
        boolean invite = true;
        boolean blackListStatus = true;
        boolean accessIsPossible = false;

        Random random = new Random();

        //генерируем возраст
        age = random.nextInt(0, 110);

        //генерируем сумму на счёте, нижняя граница и верхняя граница
        amountOfCash = random.nextDouble(0,10_999_999);

        System.out.println("Кандидат: Василий");
        System.out.println("Возраст = " + age);
        System.out.print("Сумма денях = ");
        System.out.printf("%.2f",amountOfCash, "%n");
        System.out.println("\n");
        System.out.println("Наличие приглашения - " + invite);


        if (age >= 18 & !blackListStatus){
            if(amountOfCash > 50000 || invite){
                accessIsPossible = true;
            }

            }

        if (accessIsPossible == true){
            double tax;
            tax = (amountOfCash * 7.5)/ 100;
            System.out.print("Доступ разрешён. " + "Сумма взноса = ");
            System.out.printf("%.2f",tax);

        }else{
            System.out.println("Доступ запрещён");

        };







    }

}























