-- auto incremente funciona assim se vc não passar um id ele zera um e vai incrementando!
-- UNSIGNED apenas valores positivos!
create table estados (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    sigla VARCHAR(2) NOT NULL,
    regiao ENUM('NORTE', 'NORDESTE', 'CENTRO-OESTE', 'SUDESTE', 'SUL') NOT NULL,
    populacao DECIMAL(5, 2) NOT NULL,
    PRIMARY KEY(id),
    UNIQUE KEY (nome),
    UNIQUE KEY (sigla)
);


create table if not exists cidades (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    estado_id int  UNSIGNED NOT NULL,
    area DECIMAL(10, 2),
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) REFERENCES estados (id)
);

--aqui eu faço a conexão das duas tabelas
create table if not exists cidades (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY
);
--dropando a tabela teste resumindo apagando a tabela
drop table if exists cidades;

CREATE TABLE IF NOT EXISTS funcionarios (
					id INT UNSIGNED NOT NULL AUTO_INCREMENT,
					nome VARCHAR(45) NOT NULL,
					salario DECIMAL(5, 2) UNSIGNED NOT NULL,
					status TINYINT(1),
					funcao ENUM('OPERARIO', 'MAQUINISTA', 'SOLDADOR', 'CAIXA', 'VENDEDOR'),
					tempo_de_contrato INT,
					empresa_id = INT UNSIGNED NOT NULL,
					PRIMARY KEY(id),
					FOREIGN KEY (empresa_id) REFERENCES empresa(id)
					)