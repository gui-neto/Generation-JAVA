CREATE DATABASE db_universo_geek;
USE db_universo_geek;

CREATE TABLE tb_produtos(
id bigint auto_increment,
nomeProduto varchar(100),
preco decimal,
estoque int,
primary key (id)
);

INSERT INTO tb_produtos (nomeProduto, preco, estoque) values ("Camisa Barbie", 109, 1000);
INSERT INTO tb_produtos (nomeProduto, preco, estoque) values ("Camisa Naruto", 99, 789);
INSERT INTO tb_produtos (nomeProduto, preco, estoque) values ("Camisa Jovens Titans", 70, 8764);
INSERT INTO tb_produtos (nomeProduto, preco, estoque) values ("Camisa Shingeki no Kyojin", 90, 53);
INSERT INTO tb_produtos (nomeProduto, preco, estoque) values ("Camisa Linkin Park", 799, 126);
INSERT INTO tb_produtos (nomeProduto, preco, estoque) values ("Camisa Iron Maiden", 66, 666);

SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos WHERE preco > 500;
SELECT * FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos SET estoque = 10 WHERE id = 3;