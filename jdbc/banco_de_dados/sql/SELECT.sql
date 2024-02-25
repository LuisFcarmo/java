--select * from estados!
--select nome from estados!
--select nome, id from estados
--select nome, id as 'id do estados' from estados!
--este where busca os estados com uma condição!
--WHERE regiao = 'Sul'!

select regiao, populacao as 'população' from estados
WHERE populacao >= 1
order by populacao asc

--asc crescente desc decrescente 

-- consultar com agregação

select
    regiao as 'regiao',
    sum (populacao) as total
from estados
GROUP BY regiao
order by total desc


-- sum () soma parametros
-- avg () faz a media dos dados
select
    avg (populacao) as total    
from estados

--consultas com duas tabelas diferentes

--filtrando as tabelas atraves do select
select 
   c.nome as cidade, 
   e.nome as estado, 
   regiao as regiao

from estados e, cidades c
WHERE e.id = c.estado_id
 

--tipos de join


