UPDATE productos SET temperatura=15; 

UPDATE productos SET temperatura=18 WHERE idproducto=4; 

UPDATE productos
SET temperatura=14, valorbase=75000, nombre='DISCO SOLIDO'
WHERE idproducto=5;

UPDATE productos
SET valorbase=100
WHERE idproducto IN(1,5,3);

UPDATE productos
SET valorbase=500
WHERE idproducto NOT IN(2);