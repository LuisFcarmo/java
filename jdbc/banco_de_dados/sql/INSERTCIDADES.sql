INSERT INTO cidades (nome, area, estado_id)
VALUES ('campinas', 795, 19)

insert into cidades (nome, area, estado_id)
values (
    'caruaru', 920, 
    (select id from estados where sigla = "pe")
)

select * from empresa



"INSERT INTO funcionarios
VALUES (
    (?, ?, ?, ?, ?)
    (?)
)"

create table if not exists empresa (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	nome VARCHAR(45) NOT NULL,
	PRIMARY KEY(id),
	UNIQUE KEY(nome)
)
SELECT id FROM empresa WHERE nome = ?;
drop table empresa


"id INT UNSIGNED NOT NULL AUTO_INCREMENT,"
					+ "nome VARCHAR(45) NOT NULL,"
					+ "salario DECIMAL(5, 2) UNSIGNED NOT NULL,"
					+ "status TINYINT(1) NOT NULL,"
					+ "funcao ENUM('OPERARIO', 'MAQUINISTA', 'SOLDADOR', 'CAIXA', 'VENDEDOR') NOT NULL,"
					+ "tempo_de_contrato INT UNSIGNED NOT NULL,"
					+ "empresa_id INT UNSIGNED NOT NULL,"
					+ "PRIMARY KEY(id),"
					+ "FOREIGN KEY (empresa_id) REFERENCES empresa(id)"
					+ ")";

select * from empresa
drop table funcionarios

INSERT INTO funcionarios
VALUES(
    ("nome", 1000, 1, "VENDEDOR", 1),
    (1)
)