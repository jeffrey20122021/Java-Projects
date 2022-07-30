create table productos
(
	idproducto bigint not null auto_increment,
    nombre varchar(200) not null,
    temperatura double not null,
    valorbase double not null,
    primary key (idproducto)
);