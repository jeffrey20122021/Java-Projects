SELECT *
FROM categorias c INNER JOIN relcategoriasproductos rel 
ON c.idcategoria=rel.idcategoria
INNER JOIN productos p ON rel.idproducto=p.idproducto;

SELECT p.idproducto, p.nombre AS producto, c.nombre AS categoria, 
p.temperatura, p.valorbase
FROM categorias c INNER JOIN relcategoriasproductos rel 
ON c.idcategoria=rel.idcategoria
INNER JOIN productos p ON rel.idproducto=p.idproducto;

SELECT p.idproducto, p.nombre AS producto, c.nombre AS categoria, 
p.temperatura, p.valorbase
FROM categorias c INNER JOIN relcategoriasproductos rel 
ON c.idcategoria=rel.idcategoria
INNER JOIN productos p ON rel.idproducto=p.idproducto
WHERE c.nombre = 'lacteos';

SELECT p.idproducto, p.nombre AS producto, c.nombre AS categoria, 
p.temperatura, p.valorbase
FROM categorias c INNER JOIN relcategoriasproductos rel 
ON c.idcategoria=rel.idcategoria
INNER JOIN productos p ON rel.idproducto=p.idproducto
WHERE c.nombre LIKE '%LaCteos%';