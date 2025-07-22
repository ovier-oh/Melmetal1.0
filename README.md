# Melmetal1.0

# 📁 File Processor API (Spring Boot)

Una aplicación Java con Spring Boot que recibe archivos desde un cliente (como Postman), los procesa y devuelve archivos modificados. El proyecto está diseñado de forma incremental: desde un simple "Hola Mundo" hasta una API escalable, segura y bien testeada con JUnit.

---

## 🚀 Objetivo General

Construir una API REST modular y escalable que:
- Reciba archivos mediante POST.
- Procese los archivos (por ejemplo, convertir texto a mayúsculas).
- Devuelva archivos procesados como respuesta.
- Soporte múltiples tipos de archivo (txt, csv, etc).
- Implemente pruebas unitarias con JUnit.
- Use Postman como interfaz de prueba.
- Se pueda ejecutar en Docker.

---

## 📌 Etapas de Desarrollo

| Etapa | Descripción | Estado |
|-------|-------------|--------|
| 1     | `GET /hello` – Hola mundo desde Java | 🟢 |
| 2     | `POST /upload` – Recibe archivo y devuelve nombre | ⬜ |
| 3     | Procesa archivo de texto y devuelve archivo modificado | ⬜ |
| 4     | Manejo de múltiples formatos (txt, csv, xml...) | ⬜ |
| 5     | Validaciones, logs y manejo de errores | ⬜ |
| 6     | Modularización (services, DTOs, utils) | ⬜ |
| 7     | Dockerización y despliegue básico | ⬜ |
| 8     | Almacenamiento temporal y descarga de archivos | ⬜ |
| 9     | Seguridad básica (API Key, tamaño, MIME) | ⬜ |

---

## ⚙️ Tecnologías

- **Java 17+**
- **Spring Boot 3.x**
- **JUnit 5**
- **Postman (para pruebas manuales)**
- **Maven o Gradle**
- **Docker (etapa avanzada)**

---

## 📂 Estructura Inicial del Proyecto

file-processor/
├── src/
│ ├── main/
│ │ └── java/com/example/fileprocessor/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── model/
│ │ └── FileProcessorApplication.java
│ └── test/
│ └── java/com/example/fileprocessor/
├── pom.xml
├── README.md


---

## ▶️ Cómo ejecutar (Etapa 1)

### 1. Clona el proyecto
```bash
git clone https://github.com/tu-usuario/file-processor.git
cd file-processor

Ejecuta con Maven
bash
Copiar
Editar
./mvnw spring-boot:run
3. Prueba en Postman
URL: http://localhost:8080/hello

Método: GET

Respuesta esperada: "Hola mundo desde Java"