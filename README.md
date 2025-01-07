![Portada del Proyecto](src\Imágenes\Foro_hub.jpg)

# Foro Hub - API REST para la Gestión de Tópicos

[![Java Badge](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)  
[![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-3.2.4-green.svg)](https://spring.io/projects/spring-boot)  
[![Maven Badge](https://img.shields.io/badge/Maven-3.8.6-red.svg)](https://maven.apache.org/)  
[![MySQL Badge](https://img.shields.io/badge/MySQL-8.0-orange.svg)](https://www.mysql.com/)  
[![Flyway Badge](https://img.shields.io/badge/Flyway-9.16.0-red.svg)](https://flywaydb.org/)  
[![Spring Data JPA Badge](https://img.shields.io/badge/Spring%20Data%20JPA-3.2.4-blue.svg)](https://spring.io/projects/spring-data-jpa)  
[![Lombok Badge](https://img.shields.io/badge/Lombok-1.18.26-yellow.svg)](https://projectlombok.org/)  
[![License Badge](https://img.shields.io/badge/license-MIT-green)](LICENSE)

---

## Índice

- [Descripción del Proyecto](#descripción-del-proyecto)
- [Estado del Proyecto](#estado-del-proyecto)
- [Funciones Implementadas](#funciones-implementadas)
- [Acceso al Proyecto](#acceso-al-proyecto)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Contribuciones](#contribuciones)
- [Contacto](#contacto)

---

## Descripción del Proyecto

**Foro Hub** es una API REST desarrollada con Spring Framework que busca replicar la funcionalidad básica de un foro en línea. Los usuarios pueden crear, consultar, actualizar y eliminar tópicos, interactuando con la plataforma de manera eficiente. Este proyecto está diseñado como un ejercicio de aprendizaje en el desarrollo backend, implementando buenas prácticas de programación y herramientas modernas.

### Principales Características:
- Gestión de tópicos mediante operaciones CRUD.
- Validación de reglas de negocio.
- Persistencia de datos en una base de datos relacional.
- Organización modular y estructurada para facilitar su mantenimiento.

---

## Estado del Proyecto

El proyecto aún **necesita mejoras**. Actualmente, las funcionalidades básicas están implementadas y funcionando, pero se pueden realizar optimizaciones y agregar nuevas características, como autenticación, manejo avanzado de errores, y relaciones con otras entidades.

---

## Funciones Implementadas

- **Crear un nuevo tópico**:
    - Endpoint para registrar un tópico con validaciones básicas.
- **Listar tópicos**:
    - Recuperar todos los tópicos almacenados.
- **Consultar un tópico específico**:
    - Recuperar los detalles de un tópico mediante su ID.
- **Actualizar un tópico**:
    - Permitir modificaciones en el título o mensaje de un tópico existente.
- **Eliminar un tópico**:
    - Eliminar un tópico identificado por su ID.

---

## Acceso al Proyecto

Clona el repositorio desde GitHub y sigue las instrucciones para configurarlo en tu entorno local.

```bash
    git clone https://github.com/LuisFeMontero/forohub
    cd forohub
```
## Ejecución del Proyecto:
Asegúrate de tener Java 17 y Maven instalados.
Configura tu base de datos PostgreSQL con las credenciales necesarias.
Ejecuta el proyecto con:
```bash
    mvn spring-boot:run
```
---

## 💻 Tecnologías Utilizadas

- **Java 17**: Lenguaje principal del proyecto.
- **Spring Boot**: Framework para la creación de aplicaciones basadas en Spring.
- **Spring Data JPA**: Herramienta para la persistencia de datos.
- **Flyway**: Gestión de migraciones de la base de datos.
- **MySQL**: Base de datos relacional utilizada para almacenar la información.
- **Maven**: Herramienta para la gestión de dependencias y construcción del proyecto.

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si deseas colaborar, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu funcionalidad:
   ```bash
   git checkout -b nombre-de-tu-rama
   ```
3. Realiza los cambios y haz commit:
   ```bash
   git commit -m "Descripción de tus cambios"
   ```
4. Envía tus cambios:
   ```bash
   git push origin nombre-de-tu-rama
   ```
5. Crea un Pull Request en GitHub y describe tus modificaciones.

6. Este proyecto ha sido desarrollado en el marco de aprendizaje de práctica de Alura Latam y con un esfuerzo personal de aprendizaje y exploración de tecnologías modernas en el desarrollo backend.
## 📬 Contacto

Proyecto desarrollado por **Luis Felipe Montero**. Para dudas, sugerencias o colaboraciones, puedes contactarme a través de los siguientes medios:

- **GitHub**: [LuisFeMontero](https://github.com/LuisFeMontero)
- **Correo Electrónico**: luisfelipe.montero@example.com

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](src/License/LICENSE) para más detalles.

Si tienes sugerencias, no dudes en compartirlas. 😊