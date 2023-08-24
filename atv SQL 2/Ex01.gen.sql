CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classes (
    id bigint auto_increment PRIMARY KEY,
    nomeClasse varchar(250),
    skills varchar(250)
);

CREATE TABLE tb_personagens (
    id bigint auto_increment PRIMARY KEY,
    nome varchar(250),
    nivel int,
    raca varchar(250),
    classes_id bigint,
    FOREIGN KEY (classes_id) references tb_classes(id)
);


INSERT INTO tb_classes (nomeClasse, skills) values ("PALADINO", "PUNHO DIVINO");
INSERT INTO tb_classes (nomeClasse, skills) values ("ASSASINO", "ATAQUE SURPRESA");
INSERT INTO tb_classes (nomeClasse, skills) values ("GUERREIRO", "ESPADA DIAMANTE");
INSERT INTO tb_classes (nomeClasse, skills) values ("FEITICEIRO", "INVOCAR ALMA");
INSERT INTO tb_classes (nomeClasse, skills) values ("ARQUEIRO", "CHUVA DE FLECHAS");


INSERT INTO tb_personagens (nome, nivel, raca, classes_id) values ("GAREN", 18, "DEMACIA", 1);
INSERT INTO tb_personagens (nome, nivel, raca, classes_id) values ("TRYNDAMERE", 13, "NOXUS", 3);
INSERT INTO tb_personagens (nome, nivel, raca, classes_id) values ("LULU", 8, "BANDOPOLIS", 4);
INSERT INTO tb_personagens (nome, nivel, raca, classes_id) values ("KHA'ZIX", 22, "ILHAS DAS SOMBRAS", 2);
INSERT INTO tb_personagens (nome, nivel, raca, classes_id) values ("HECARIM", 28, "ILHAS DAS SOMBRAS", 3);
INSERT INTO tb_personagens (nome, nivel, raca, classes_id) values ("HEIMERDINGER", 66, "PILTOVER", 4);
INSERT INTO tb_personagens (nome, nivel, raca, classes_id) values ("VAYNE", 11, "NOXUS", 5);
INSERT INTO tb_personagens (nome, nivel, raca, classes_id) values ("VARUS", 17, "IONIA", 5);

DELETE FROM tb_personagens WHERE id IN (6,7,8);

SELECT * FROM tb_personagens;
SELECT * FROM tb_classes;

SELECT nome, nivel, raca FROM tb_personagens WHERE nivel > 18;

SELECT nome, nivel, raca FROM tb_personagens WHERE nivel BETWEEN 20 AND 66;

SELECT nome, nivel, raca FROM tb_personagens WHERE nome LIKE "%C%";

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.classes_id = tb_classes.id;
SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.classes_id = tb_classes.id WHERE nomeClasse = "GUERREIRO";












