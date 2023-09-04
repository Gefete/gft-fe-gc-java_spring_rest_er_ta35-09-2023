DROP TABLE IF EXISTS departamentos;
DROP TABLE IF EXISTS empleados;


CREATE TABLE departamentos (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre varchar(100),
  presupuesto int,
  PRIMARY KEY (codigo)
);

CREATE TABLE empleados (
  dni varchar(8),
  nombre nvarchar(100),
  apellidos nvarchar(255),
  departamento int,
  PRIMARY KEY (dni),
  foreign key (departamento) references departamentos (codigo)
	on delete cascade
    on update cascade
);


insert into departamentos (nombre, presupuesto)
values('Tecnologia', 1434);
insert into departamentos (nombre, presupuesto)
values('Informatica', 1722);
insert into departamentos (nombre, presupuesto)
values('Programar', 1533);
insert into departamentos (nombre, presupuesto)
values('Imagen corporativa', 1234);
insert into departamentos (nombre, presupuesto)
values('Financiero', 1234);

insert into empleados (dni, nombre, apellidos, departamento)
values('13245678','Jose', 'Martinez Andres',1);
insert into empleados (dni, nombre, apellidos, departamento)
values('12534678','Juan', 'Muñoz Martinez',1);
insert into empleados (dni, nombre, apellidos, departamento)
values('12342378','Pedro', 'Ruiz Soto',2);
insert into empleados (dni, nombre, apellidos, departamento)
values('15435678','Jordi', 'Soto Almeida',4);
insert into empleados (dni, nombre, apellidos, departamento)
values('12653278','Jonatan', 'Alvarez Garcia',3);