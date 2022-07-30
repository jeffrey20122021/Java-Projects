SELECT * 
FROM categorias;

SELECT nombre 
FROM categorias;

SELECT idproducto, nombre, valorbase
FROM productos;

SELECT idproducto, nombre, valorbase
FROM productos
ORDER BY nombre ASC;

SELECT idproducto, nombre, valorbase
FROM productos
ORDER BY nombre DESC;

SELECT idproducto, nombre, temperatura, valorbase
FROM productos
WHERE idproducto=5;

SELECT idproducto, nombre, temperatura, valorbase
FROM productos
WHERE idproducto=3 AND valorbase=3000;

SELECT idproducto, nombre, temperatura, valorbase
FROM productos
WHERE idproducto=3 OR valorbase=300;

SELECT idproducto, nombre, temperatura, valorbase
FROM productos
WHERE idproducto > 3;

SELECT idproducto, CONCAT(nombre,'-->',valorbase) AS nomvalor
FROM productos;

SELECT idproducto, LOWER(nombre) AS nombre, temperatura, valorbase
FROM productos;