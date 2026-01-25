CREATE DATABASE sistema_vacunacion_mascotas;
USE sistema_vacunacion_mascotas;

CREATE TABLE propietarios (
    id_propietario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    telefono VARCHAR(20),
    direccion VARCHAR(150)
);

CREATE TABLE mascotas (
    id_mascota INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    especie VARCHAR(50),
    raza VARCHAR(50),
    fecha_nacimiento DATE,
    id_propietario INT,
    FOREIGN KEY (id_propietario) REFERENCES propietarios(id_propietario)
);

CREATE TABLE vacunas (
    id_vacuna INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion TEXT
);

CREATE TABLE registro_vacunacion (
    id_registro INT AUTO_INCREMENT PRIMARY KEY,
    fecha_aplicacion DATE,
    proxima_vacuna DATE,
    id_mascota INT,
    id_vacuna INT,
    FOREIGN KEY (id_mascota) REFERENCES mascotas(id_mascota),
    FOREIGN KEY (id_vacuna) REFERENCES vacunas(id_vacuna)
);
