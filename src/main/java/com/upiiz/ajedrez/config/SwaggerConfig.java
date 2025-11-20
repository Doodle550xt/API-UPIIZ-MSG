package com.upiiz.ajedrez.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "API de Notificaciones - Firebase",
        description = "API para gestionar tokens de usuarios y enviar notificaciones utilizando Firebase",
        version = "1.0.0",
        contact = @Contact(
            name = "Cristian García Nieves",
            url = "https://github.com/crisgnh01", 
            email = "crisgnh01@gmail.com"
        ),
        license = @License(
            name = "MINT",
            url = "https://mint.com/licencia"
        ),
        termsOfService = "https://mint.com/terminos"
    ),
    servers = {
        @Server(url = "https://api-upiiz-msg.onrender.com", description = "Servidor de producción")
    }
)
public class SwaggerConfig {
}
