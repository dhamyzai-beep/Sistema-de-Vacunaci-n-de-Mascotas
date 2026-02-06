CREATE DATABASE sistema_vacunacion_mascotas;
USE sistema_vacunacion_mascotas;

CREATE TABLE dueño (
    id_dueño INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(50),
    apellidos VARCHAR(50),
    cedula VARCHAR(15),
    telefono VARCHAR(15),
    direccion VARCHAR(100)
);

CREATE TABLE mascota (
    id_mascota INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    especie VARCHAR(30),
    raza VARCHAR(30),
    edad INT,
    sexo VARCHAR(10),
    nombre_dueño VARCHAR(50),
    cedula_dueño VARCHAR(15),
    telefono_dueño VARCHAR(15)
);

CREATE TABLE vacuna (
    id_vacuna INT AUTO_INCREMENT PRIMARY KEY,
    nombre_vacuna VARCHAR(50),
    dosis VARCHAR(20)
);

CREATE TABLE registro_vacunacion (
    id_registro INT AUTO_INCREMENT PRIMARY KEY,
    nombre_mascota VARCHAR(50),
    nombre_vacuna VARCHAR(50),
    dosis VARCHAR(20),
    fecha_vacuna DATE,
    observaciones VARCHAR(150)
);
