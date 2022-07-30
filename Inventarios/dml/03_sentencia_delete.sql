DELETE FROM categorias;
DELETE FROM productos;
DELETE FROM relcategoriasproductos;

DELETE FROM productos WHERE idproducto=2;
DELETE FROM productos WHERE idproducto=4 AND valorbase=5000;

DELETE FROM productos WHERE idproducto IN(1,5);
DELETE FROM productos WHERE idproducto NOT IN(3);

