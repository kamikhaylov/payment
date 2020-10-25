DROP TABLE IF EXISTS Accounts;
DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
  number_Phone CHAR
);

CREATE TABLE Accounts (
  account CHAR,
  amount INT,
  сurrency CHAR,
  user_id CHAR,
  number_Phone CHAR,
    foreign key (user_id) references Users(number_Phone)
);

INSERT INTO Users (number_Phone) VALUES
  ('+79001111111'),
  ('+79002222222'),
  ('+79003333333');

INSERT INTO Accounts (account,amount,сurrency,user_id,number_Phone) VALUES
  ('1111222233334444',50000,'RUB','+79001111111','+79001111111'),
  ('1111222233335555',200000,'RUB','+79002222222','+79002222222'),
  ('1111222233336666',10000,'RUB','+79003333333','+79003333333');
