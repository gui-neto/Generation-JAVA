CREATE DATABASE db_empresa;
USE db_empresa;

CREATE TABLE tb_colaboradores(
id bigint auto_increment,
nome varchar(250) not null,
cargo varchar(100) not null,
data_contrato date,
salario decimal not null,
primary key (id)
);

INSERT INTO tb_colaboradores (nome,cargo,data_contrato,salario) values ("Guilherme Martins", "CEO", "2001-07-05", 35000);
INSERT INTO tb_colaboradores (nome,cargo,data_contrato,salario) values ("Rosangela Oliveira", "Gerente", "2006-12-10", 10000);
INSERT INTO tb_colaboradores (nome,cargo,data_contrato,salario) values ("Luis Guerreiro", "Desenvolvedor", "2010-01-05" , 8500);
INSERT INTO tb_colaboradores (nome,cargo,data_contrato,salario) values ("Ana Paula", "Analista Financeiro", "2008-11-02", 7000);
INSERT INTO tb_colaboradores (nome,cargo,data_contrato,salario) values ("Carlos Alberto", "Gerente de Vendas", "2009-05-12", 5500);
INSERT INTO tb_colaboradores (nome,cargo,data_contrato,salario) values ("Francisco Neto", "Segurança", "2002-02-02", 1900);

SELECT * FROM tb_colaboradores;

SELECT * FROM tb_colaboradores WHERE salario>2000;
SELECT * FROM tb_colaboradores WHERE salario<2000;

UPDATE tb_colaboradores SET salario = 6000 WHERE id = 5;
