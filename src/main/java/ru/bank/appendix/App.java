package ru.bank.appendix;

public class App {

    private String ip;
    private String port;
    private String protocol;
    private String server;

    public App(String ip, String port, String protocol, String server) {
        this.ip = ip;
        this.port = port;
        this.protocol = protocol;
        this.server = server;
    }

    @Override
    public String toString() {
        return "Данные о сервере обработки запроса об оплате: \n" +
                "IP-адрес: " + this.ip + "\n" +
                "Порт: " + this.port + "\n" +
                "Протокол: " + this.protocol + "\n" +
                "Сервер: " + this.server + "\n";
    }

    //Через CommandInput получаем данные от пользователя
    //Вызываем CommandOperationPay
    //Ожидает результат операции
}