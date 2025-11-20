# 🏗️ Ajedrez Spring Boot Project

Este proyecto es una aplicación **Spring Boot** llamada `ajedrez` que utiliza **MySQL** como base de datos y **Firebase** para funcionalidades como notificaciones o autenticación.

---

## 1️⃣ Configuración del proyecto

### `application.properties`

Llena este archivo con los valores de tu base de datos MySQL directamente:

#############
spring.application.name=ajedrez
# Configuración de MySQL
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://<HOST>:<PUERTO>/<BASE_DE_DATOS>
spring.datasource.username=<USUARIO>
spring.datasource.password=<CONTRASEÑA>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Mostrar consultas SQL en consola
spring.jpa.show-sql=true
#############

Reemplaza <HOST>, <PUERTO>, <BASE_DE_DATOS>, <USUARIO> y <CONTRASEÑA> por tus credenciales reales.


2️⃣ Configuración de Firebase
Ve a la Consola de Firebase → Configuración del proyecto → Cuentas de servicio → Generar nueva clave privada.
Descarga el JSON de la Service Account.
Guárdalo en tu proyecto en src/main/resources/firebase-service-account.json 

Empaquetar y ejecutar la aplicación
Con Maven
# Construir JAR
mvn clean package


Para ejecutar la app
mvn spring-boot:run
