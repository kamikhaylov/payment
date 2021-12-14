# Задача
## Смоделировать оплату номера телефона в приложении.
Реализован прототип модели оплаты номера телефона. Прототип демонстрирует взаимодействие двух SpringBoot приложений, а также взаимодействие с базой данных.

### Используемые технологии:
![image](https://user-images.githubusercontent.com/43637775/146060729-74304f86-046e-407d-aed6-c190073a42ab.png)



### Примеры запросов для тестирования в браузере или Postman



#### --- 1 ---
Запрос в приложение App: http://127.0.0.1:8080/Webs/1/users/+79001111111/accounts/1111222233334444/clients/+79002222222/transferAmount/1000

В результате формирования запроса в приложение Server - получаем ответ от Server:
responseEntityStr.getBody(){"result":"Оплата со счета пользователя: 1111222233334444 на номер телефона клиента: +79002222222 произведена успешно. Сумма платежа: 1000 RUB"}



#### --- 2 ---
Запрос в приложение App: http://127.0.0.1:8080/Webs

Локальный результат: 1 Web is ready.



#### --- 3 ---

Запрос в приложение Server: http://127.0.0.1:9090/Servers

Результат от Server: 1 Server is ready.



#### --- 4 ---

Запрос в приложение Server: http://127.0.0.1:9090/Servers/users/all

Результат из базы данных:

[{"numberPhone": "+79001111111","accountDTO": [{
                "numberPhone": "+79001111111",
                "account": "1111222233334444",
                "amount": 50000,
                "сurrency": "RUB"}]},{
        "numberPhone": "+79002222222","accountDTO": [{
                "numberPhone": "+79002222222",
                "account": "1111222233335555",
                "amount": 200000,
                "сurrency": "RUB"}]},{
        "numberPhone": "+79003333333","accountDTO": [{
                "numberPhone": "+79003333333",
                "account": "1111222233336666",
                "amount": 10000,
                "сurrency": "RUB"}]}]

![image](https://user-images.githubusercontent.com/43637775/146063542-0ea56f61-560f-49d6-abfa-ff75d20c9e94.png)



![image](https://user-images.githubusercontent.com/43637775/146063271-8d4a150b-221a-4a07-9c15-7518c556bcf7.png)



