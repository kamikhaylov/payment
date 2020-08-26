package ru.bank.command;

public class CommandInput implements Command {
    public void execute() {
        //Логика получаем данные от пользователя и вводим данные получателя
        System.out.println("Введите номер телефона: ");
        System.out.println("Введите сумму: ");
        System.out.println("Выберите валюту: ");
        System.out.println("Отправка данных на сервер");
        //Передаем данные в Приложение
    }
}
