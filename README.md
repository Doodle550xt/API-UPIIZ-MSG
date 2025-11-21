# ♟️ API - Backend Spring Boot

![Java](https://img.shields.io/badge/Java-17%2B-orange) ![Spring
Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Firebase](https://img.shields.io/badge/Firebase-Admin-yellow)

Este proyecto es una **API REST en Spring Boot** que funciona como
backend para enviar notificaciones. Gestiona almacenamiento de tokens, y
envía notificaciones  utilizando Firebase.

------------------------------------------------------------------------

## Tecnologías

-   **Lenguaje:** Java
-   **Framework:** Spring Boot (Web, Data JPA)
-   **Base de Datos:** MySQL
-   **Servicios Cloud:** Firebase (Auth & Cloud Messaging)
-   **Gestor de Dependencias:** Maven

------------------------------------------------------------------------

## Requisitos Previos

Antes de iniciar, asegúrate de contar con:

1.  **JDK 17** o superior
2.  **Maven** 
3.  **MySQL Server** local o remoto
4.  Una cuenta activa en **Firebase Console**

------------------------------------------------------------------------

## ⚙️ Configuración del Proyecto

### 1. Clonar el repositorio

``` bash
git clone https://github.com/tu-usuario/ajedrez-backend.git
cd ajedrez-backend
```

------------------------------------------------------------------------

### 2. Configuración de Base de Datos (MySQL)

Crea una base de datos vacía (por ejemplo: `ajedrez_db`).

Edita el archivo:

    src/main/resources/application.properties

Y coloca tus credenciales:

``` properties
spring.application.name=ajedrez

# --- Configuración de MySQL ---
spring.jpa.hibernate.ddl-auto=update

spring.datasource.url=jdbc:mysql://<HOST>:<PUERTO>/<BASE_DE_DATOS>?serverTimezone=UTC
spring.datasource.username=<USUARIO>
spring.datasource.password=<CONTRASEÑA>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# --- Debugging (Opcional) ---
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

**Importante:** No subas contraseñas reales a repositorios públicos.\
Usa **variables de entorno** en producción.

------------------------------------------------------------------------

### 3. Configuración de Firebase

Para habilitar notificaciones:

1.  Ve a **Firebase Console**
2.  Navega a **Configuración del proyecto → Cuentas de servicio**
3.  Haz clic en **Generar nueva clave privada**
4.  Descarga el archivo `.json`
5.  Renómbralo a:

```{=html}
    firebase-service-account.json
```

6.  Muévelo a:

```{=html}
    src/main/resources/firebase-service-account.json
```

Asegúrate de agregarlo al `.gitignore`.

------------------------------------------------------------------------

## Ejecución

### Compilar el proyecto

``` bash
mvn clean package
```

### Ejecutar la aplicación

``` bash
mvn spring-boot:run
```

La API estará disponible en:

 **http://localhost:8080**
