create table categorias
(
	idcategoria bigint not null auto_increment,
    nombre varchar(200) not null,
    primary key (idcategoria)
);

create table productos
(
	idproducto bigint not null auto_increment,
    idcategoria bigint not null,
    nombre varchar(200) not null,
    temperatura double not null,
    valorbase double not null,
    primary key (idproducto)
);

alter table productos add constraint fk_productos_ref_categorias foreign key (idcategoria) 
	references categorias (idcategoria) on delete cascade on update cascade; 