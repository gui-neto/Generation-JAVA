CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE tb_estudantes (
    id bigint auto_increment,
    nome varchar(100),
    idade int,
    nota decimal(5, 2),
    turma varchar(10),
    primary key (id)
);

INSERT INTO tb_estudantes (nome,idade,nota,turma) values  ('João Silva', 15, 8.5,'9A');
INSERT INTO tb_estudantes (nome,idade,nota,turma) values  ('Maria Souza', 16, 6.7,'10B');
INSERT INTO tb_estudantes (nome,idade,nota,turma) values  ('Pedro Santos', 15, 9.2,'9A');
INSERT INTO tb_estudantes (nome,idade,nota,turma) values  ('Ana Oliveira', 14, 7.8,'8C');
INSERT INTO tb_estudantes (nome,idade,nota,turma) values  ('Lucas Ferreira', 16, 5.5,'10A');
INSERT INTO tb_estudantes (nome,idade,nota,turma) values  ('Carla Rodrigues', 14, 8.9,'8B');
INSERT INTO tb_estudantes (nome,idade,nota,turma) values  ('Mateus Almeida', 15, 6.3,'9B');
INSERT INTO tb_estudantes (nome,idade,nota,turma) values  ('Camila Lima', 14, 9.7,'8A');

SELECT * FROM tb_estudantes;

SELECT * FROM tb_estudantes WHERE nota > 7.0;

UPDATE tb_estudantes SET nota = 7.5 WHERE id = 2;

