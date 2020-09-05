package ru.bank.server;

public class Server {

    private String ip;
    private String port;
    private String protocol;
    private String server;

    public Server(String ip, String port, String protocol, String server) {
        this.ip = ip;
        this.port = port;
        this.protocol = protocol;
        this.server = server;
    }

    @Override
    public String toString() {
        return "Данные о сервере базы данных: \n" +
                "IP-адрес: " + this.ip + "\n" +
                "Порт: " + this.port + "\n" +
                "Протокол: " + this.protocol + "\n" +
                "Сервер: " + this.server + "\n";
    }

}