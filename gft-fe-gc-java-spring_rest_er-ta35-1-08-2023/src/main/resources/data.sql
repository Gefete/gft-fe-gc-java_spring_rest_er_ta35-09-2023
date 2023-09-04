DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;

create table fabricantes(
	codigo int AUTO_INCREMENT,
    nombre nvarchar(100),
    primary key(codigo)
);

create table articulos(
	codigo int AUTO_INCREMENT,
    nombre nvarchar(100),
    precio int,
    fabricante int,
    primary key(codigo),
    foreign key (fabricante) references fabricantes (codigo) 
		on delete cascade
        on update cascade
);

insert into fabricantes (nombre) values('Samsung');
insert into fabricantes (nombre) values('Msi');
insert into fabricantes (nombre) values('Asus');
insert into fabricantes (nombre) values('Hp');

insert into articulos (nombre, precio, fabricante) values ('Monitor sm90t87', 265, 1);
insert into articulos (nombre, precio, fabricante) values ('Ventus x3 OC', 500, 2);
insert into articulos (nombre, precio, fabricante) values ('Rog ally 240Gb', 600, 3);
insert into articulos (nombre, precio, fabricante) values ('Portatil notegaming 8', 1000, 4);
