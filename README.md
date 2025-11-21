# ♟️  API - Backend Spring Boot

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Firebase](https://img.shields.io/badge/Firebase-Admin-yellow)

Este proyecto es una API REST desarrollada con **Spring Boot** que sirve como backend para enviar notificaciones. Gestiona la lógica de persistencia de tokens, y notificaciones en tiempo real.

## 🛠️ Tecnologías

* **Lenguaje:** Java
* **Framework:** Spring Boot (Web, Data JPA)
* **Base de Datos:** MySQL
* **Servicios Cloud:** Firebase (Auth & Cloud Messaging)
* **Gestor de Dependencias:** Maven

---

## 📋 Requisitos Previos

Asegúrate de tener instalado lo siguiente antes de comenzar:

1.  **JDK 17** o superior.
2.  **Maven** (o usar el wrapper `mvnw` incluido).
3.  **MySQL Server** ejecutándose localmente o en un servidor remoto.
4.  Una cuenta de **Firebase Console** activa.

---

## ⚙️ Configuración del Proyecto

### 1. Clonar el repositorio

```bash
git clone [https://github.com/tu-usuario/ajedrez-backend.git](https://github.com/tu-usuario/ajedrez-backend.git)
cd ajedrez-backend


¡Claro que sí! Un README.md bien estructurado es vital para que cualquier desarrollador (o tú mismo en el futuro) entienda cómo configurar y arrancar el proyecto rápidamente.

Aquí tienes una versión mejorada, profesional y formateada de tu README.md. He añadido insignias (badges), secciones claras de requisitos, advertencias de seguridad y una estructura más limpia.

Puedes copiar y pegar el siguiente bloque directamente en tu archivo README.md.

📄 Propuesta de README.md mejorado
Markdown
# ♟️ Ajedrez API - Backend Spring Boot

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Firebase](https://img.shields.io/badge/Firebase-Admin-yellow)

Este proyecto es una API REST desarrollada con **Spring Boot** que sirve como backend para el juego de Ajedrez. Gestiona la lógica de persistencia de datos, autenticación y notificaciones en tiempo real.

## 🛠️ Tecnologías

* **Lenguaje:** Java
* **Framework:** Spring Boot (Web, Data JPA)
* **Base de Datos:** MySQL
* **Servicios Cloud:** Firebase (Auth & Cloud Messaging)
* **Gestor de Dependencias:** Maven

---

## 📋 Requisitos Previos

Asegúrate de tener instalado lo siguiente antes de comenzar:

1.  **JDK 17** o superior.
2.  **Maven** (o usar el wrapper `mvnw` incluido).
3.  **MySQL Server** ejecutándose localmente o en un servidor remoto.
4.  Una cuenta de **Firebase Console** activa.

---

## ⚙️ Configuración del Proyecto

### 1. Clonar el repositorio

```bash
git clone [https://github.com/tu-usuario/ajedrez-backend.git](https://github.com/tu-usuario/ajedrez-backend.git)
cd ajedrez-backend


2. Configuración de Base de Datos (MySQL)

Crea una base de datos vacía en tu servidor MySQL (ej. ajedrez_db).

Abre el archivo src/main/resources/application.properties y configura tus credenciales.

⚠️ Nota de Seguridad: Nunca subas contraseñas reales a un repositorio público. Para producción, utiliza variables de entorno.

spring.application.name=ajedrez

# --- Configuración de MySQL ---
# Actualiza el esquema de la BD automáticamente (usar 'validate' o 'none' en producción)
spring.jpa.hibernate.ddl-auto=update

# Reemplaza los valores entre <> por tu configuración local
spring.datasource.url=jdbc:mysql://<HOST>:<PUERTO>/<BASE_DE_DATOS>?serverTimezone=UTC
spring.datasource.username=<USUARIO>
spring.datasource.password=<CONTRASEÑA>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# --- Debugging (Opcional) ---
# Muestra las consultas SQL en consola (Desactivar en producción)
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

3. Configuración de Firebase

Para habilitar las notificaciones y la autenticación:

Ve a la Consola de Firebase.

Navega a Configuración del proyecto ⚙️ → Cuentas de servicio.

Haz clic en Generar nueva clave privada.

Descarga el archivo .json.

Renombra el archivo a firebase-service-account.json.

Mueve el archivo a la carpeta de recursos del proyecto: src/main/resources/firebase-service-account.json

Importante: Asegúrate de que este archivo .json esté incluido en tu .gitignore para no exponer tus claves privadas.




¡Claro que sí! Un README.md bien estructurado es vital para que cualquier desarrollador (o tú mismo en el futuro) entienda cómo configurar y arrancar el proyecto rápidamente.

Aquí tienes una versión mejorada, profesional y formateada de tu README.md. He añadido insignias (badges), secciones claras de requisitos, advertencias de seguridad y una estructura más limpia.

Puedes copiar y pegar el siguiente bloque directamente en tu archivo README.md.

📄 Propuesta de README.md mejorado
Markdown
# ♟️ Ajedrez API - Backend Spring Boot

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Firebase](https://img.shields.io/badge/Firebase-Admin-yellow)

Este proyecto es una API REST desarrollada con **Spring Boot** que sirve como backend para el juego de Ajedrez. Gestiona la lógica de persistencia de datos, autenticación y notificaciones en tiempo real.

## 🛠️ Tecnologías

* **Lenguaje:** Java
* **Framework:** Spring Boot (Web, Data JPA)
* **Base de Datos:** MySQL
* **Servicios Cloud:** Firebase (Auth & Cloud Messaging)
* **Gestor de Dependencias:** Maven

---

## 📋 Requisitos Previos

Asegúrate de tener instalado lo siguiente antes de comenzar:

1.  **JDK 17** o superior.
2.  **Maven** (o usar el wrapper `mvnw` incluido).
3.  **MySQL Server** ejecutándose localmente o en un servidor remoto.
4.  Una cuenta de **Firebase Console** activa.

---

## ⚙️ Configuración del Proyecto

### 1. Clonar el repositorio

```bash
git clone [https://github.com/tu-usuario/ajedrez-backend.git](https://github.com/tu-usuario/ajedrez-backend.git)
cd ajedrez-backend
2. Configuración de Base de Datos (MySQL)

Crea una base de datos vacía en tu servidor MySQL (ej. ajedrez_db).

Abre el archivo src/main/resources/application.properties y configura tus credenciales.

⚠️ Nota de Seguridad: Nunca subas contraseñas reales a un repositorio público. Para producción, utiliza variables de entorno.

Properties
spring.application.name=ajedrez

# --- Configuración de MySQL ---
# Actualiza el esquema de la BD automáticamente (usar 'validate' o 'none' en producción)
spring.jpa.hibernate.ddl-auto=update

# Reemplaza los valores entre <> por tu configuración local
spring.datasource.url=jdbc:mysql://<HOST>:<PUERTO>/<BASE_DE_DATOS>?serverTimezone=UTC
spring.datasource.username=<USUARIO>
spring.datasource.password=<CONTRASEÑA>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# --- Debugging (Opcional) ---
# Muestra las consultas SQL en consola (Desactivar en producción)
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
3. Configuración de Firebase

Para habilitar las notificaciones y la autenticación:

Ve a la Consola de Firebase.

Navega a Configuración del proyecto ⚙️ → Cuentas de servicio.

Haz clic en Generar nueva clave privada.

Descarga el archivo .json.

Renombra el archivo a firebase-service-account.json.

Mueve el archivo a la carpeta de recursos del proyecto: src/main/resources/firebase-service-account.json

Importante: Asegúrate de que este archivo .json esté incluido en tu .gitignore para no exponer tus claves privadas.

🚀 Ejecución
Usando Maven desde consola

Primero, limpia y empaqueta el proyecto para asegurar que no hay errores de compilación:

Bash
mvn clean package
Para ejecutar la aplicación:

Bash
mvn spring-boot:run
La aplicación estará disponible generalmente en: http://localhost:8080