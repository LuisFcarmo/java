select nome from cidades
insert into prefeitos 
(nome, cidade_id)
values
('rodrigos neves', (select id from cidades WHERE nome = 'niterói')),
('ai ai ai', (select id from cidades WHERE nome = 'corgi')),
('luka', (select id from cidades WHERE nome = 'eita maria')),
('neves', null)


select * from cidades inner join prefeitos p on cidades.id = p.cidade_id;

select * from cidades left join prefeitos p on cidades.id = p.cidade_id;

select * from cidades right join prefeitos p on cidades.id = p.cidade_id;


select * from cidades left join prefeitos p on cidades.id = p.cidade_id
union all
select * from cidades right join prefeitos p on cidades.id = p.cidade_id;


SELECT * from funcionarios where empresa_id = 2
SELECT * from funcionarios
SELECT * FROM empresa