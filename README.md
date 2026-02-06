# Sistema-de-Vacunacion-de-Mascotas

## Contexto del problema:
En muchas clínicas veterinarias y consultorios pequeños, el control de la vacunación
de las mascotas se realiza de forma manual mediante cuadernos, fichas físicas o
archivos no estructurados. Este método presenta problemas como la pérdida de
información, duplicidad de registros, dificultad para consultar el historial de
vacunación y errores en el cálculo de fechas de próximas vacunas.

Debido a estas problemáticas, surge la necesidad de implementar un sistema
informático que permita registrar, organizar y consultar de manera eficiente la
información relacionada con la vacunación de mascotas.

## Análisis de requerimientos
El sistema debe permitir:

- Registrar mascotas con sus datos básicos.
- Registrar propietarios de las mascotas.
- Registrar las vacunas aplicadas.
- Consultar el historial de vacunación de una mascota.
- Controlar las fechas de aplicación y próximas vacunas.
- Mantener la integridad de la información almacenada.


## Descripción de las tablas principales

### Propietarios
Almacena la información de los dueños de las mascotas, como nombre, apellido, cedula, teléfono 
y dirección.

### Mascotas
Contiene los datos de cada mascota registrada, como nombre, especie, raza, edad y sexo. 
Cada mascota pertenece a un propietario.

### Vacunas
Registra el nombre de la mascota, la vacuna, dosis, fecha de su vacunación, y observaciones.

### Registro_Vacunacion
Guarda el historial de vacunación de cada mascota, indicando la vacuna aplicada, la dosis, 
la fecha de aplicación y en las observaciones la próxima fecha de vacunación o novedades.

## Diagrama del modelo lógico
El modelo entidad-relación del sistema se encuentra en la carpeta diagrams.
📎 diagrams/modelo_logico.png

## Modelo físico
La base de datos fue implementada en MySQL.
El script SQL se encuentra en la carpeta database/modelo_fisico.sql.


# Aplicación

### Diseño de interfaz
La aplicación contará con formularios gráficos para el registro de propietarios,
mascotas, vacunas y el control de vacunación.

### Validaciones
Se validará que los campos obligatorios no estén vacíos y que los datos ingresados 
tengan el formato correcto antes de ser almacenados en la base de datos.

### Acceso a datos
El modelo de base de datos fue diseñado bajo el enfoque relacional (MySQL); sin embargo, 
para la implementación del sistema se utilizó almacenamiento en memoria mediante 
estructuras ArrayList en Java.

### Funcionalidades clave
- Visualización de datos almacenados
- Registro y edición de datos
