create table categorias
(
	idcategoria bigint not null auto_increment,
    nombre varchar(200) not null,
    primary key (idcategoria)
);

create table productos
(
	idproducto bigint not null auto_increment,
    nombre varchar(200) not null,
    temperatura double not null,
    valorbase double not null,
    primary key (idproducto)
);

create table relcategoriasproductos
(
	idrelcategoriaproducto bigint not null auto_increment,
    idcategoria bigint not null,
    idproducto bigint not null,
    primary key (idrelcategoriaproducto)
);

alter table relcategoriasproductos add constraint fk_relcapro_ref_categorias foreign key (idcategoria) 
	references categorias (idcategoria) on delete cascade on update cascade; 
    
alter table relcategoriasproductos add constraint fk_relcapro_ref_productos foreign key (idproducto) 
	references productos (idproducto) on delete cascade on update cascade; 