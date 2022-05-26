create table tb_worker(
   id int primary key auto_increment,
   name varchar(100) not null,
   dailyIncome varchar(100) not null
);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Bob', 200.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Maria', 300.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Alex', 250.0);