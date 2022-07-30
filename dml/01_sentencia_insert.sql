ALTER TABLE categorias auto_increment=1;
INSERT INTO categorias (nombre) VALUES ('TECNOLOGIA');
INSERT INTO categorias (nombre) VALUES ('LACTEOS');
INSERT INTO categorias (nombre) VALUES ('ASEO PERSONAL');
INSERT INTO categorias (nombre) VALUES ('CARNES');
INSERT INTO categorias (nombre) VALUES ('COSMETICOS');
INSERT INTO categorias (nombre) VALUES ('MEDICAMENTOS');
INSERT INTO categorias (nombre) VALUES ('CALZADO');
INSERT INTO categorias (nombre) VALUES ('ROPA');

ALTER TABLE productos auto_increment=1;
INSERT INTO productos (nombre,temperatura,valorbase) VALUES ('COMPUTADOR', 20, 1000);
INSERT INTO productos (nombre,temperatura,valorbase) VALUES ('LECHE ENTERA', 15, 2000);
INSERT INTO productos (nombre,temperatura,valorbase) VALUES ('MEMORIA USB', 20, 3000);
INSERT INTO productos (nombre,temperatura,valorbase) VALUES ('QUESO CREMA', 18, 5000);
INSERT INTO productos (nombre,temperatura,valorbase) VALUES ('DISCO SSD', 25, 100000);

ALTER TABLE relcategoriasproductos auto_increment=1;
INSERT INTO relcategoriasproductos (idcategoria,idproducto) VALUES (2,2);
INSERT INTO relcategoriasproductos (idcategoria,idproducto) VALUES (2,4);
INSERT INTO relcategoriasproductos (idcategoria,idproducto) VALUES (1,3);
INSERT INTO relcategoriasproductos (idcategoria,idproducto) VALUES (1,1);
INSERT INTO relcategoriasproductos (idcategoria,idproducto) VALUES (1,5);