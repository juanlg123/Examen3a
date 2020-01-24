CREATE DATABASE idat;
use idat;
CREATE TABLE empleados(
    idempleados int not null primary key identity,
    nombres varchar(45),
    apellidos varchar(45),
    dni varchar(45)
);
CREATE TABLE familiares(
    idfamiliares int not null primary key identity,
    nombres varchar(45),
    apellidos varchar(45),
    estado char(1),
    idempleados int
);