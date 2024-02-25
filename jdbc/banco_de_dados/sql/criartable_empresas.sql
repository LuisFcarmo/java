create table if not exists empresas (
    id INT unsigned NOT NULL auto_increment,
    nome varchar(255) not null,
    cpnj int unsigned,
    primary key (id),
    unique key (cpnj)
);

ALTER TABLE empresas modify cpnj varchar(19);

create table if not exists empresas_unidades (
    empresa_id int UNSIGNED not null,
    cidade_id int UNSIGNED not null,
    sede TINYINT (1) not null,
    primary key (empresa_id, cidade_id)
)

insert into empresas 
    (nome, cpnj)
VALUES
('Empresa A', '12.345.678/0001-01'),
('Empresa B', '98.765.432/0002-02'),
('Empresa C', '23.456.789/0003-03'),
('Empresa D', '87.654.321/0004-04'),
('Empresa E', '34.567.890/0005-05');

select * from empresas

desc empresas

select * from empresas;
select *from cidades;

1 2
1 3
2 4
2 5

insert into empresas_unidades (empresa_id, cidade_id, sede)
values
    (1, 2, 1),
    (1, 3, 0),
    (2, 4, 1),
    (2, 5, 0);

---consultar empresas

select e.nome empresa, c.nome cidade
from empresas e, empresas_unidades eu, cidades c
WHERE e.id = eu.empresa_id
and c.id = eu.cidade_id
and sede = 1