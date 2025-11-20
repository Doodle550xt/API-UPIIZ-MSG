package com.upiiz.ajedrez.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upiiz.ajedrez.entities.Notification;
import com.upiiz.ajedrez.entities.Token;
import com.upiiz.ajedrez.services.TokenService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/public/api/v1/notificaciones")
public class TokenController {

    @Autowired
    private final TokenService tokenService;

    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @Operation(summary = "Guardar un token")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Token guardado correctamente"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @PostMapping("/token")
    public ResponseEntity<Token> saveToken(@RequestBody Token token) {
        Token saved = tokenService.addToken(token);
        return ResponseEntity.status(201).body(saved);
    }

    @Operation(summary = "Obtener todos los tokens")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Lista de tokens obtenida correctamente"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping("/token")
    public ResponseEntity<List<Token>> getAllTokens() {
        List<Token> tokens = tokenService.getAllTokens();
        return ResponseEntity.ok(tokens);
    }

    @Operation(summary = "Enviar notificación a un token específico")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Notificación enviada correctamente"),
            @ApiResponse(responseCode = "404", description = "Token no encontrado")
    })
    @PostMapping("/{token}")
    public ResponseEntity<Void> sendNotification(@PathVariable String token, @RequestBody Notification notification) {
        boolean sent = tokenService.sendNotification(token, notification);
        if (sent)
            return ResponseEntity.ok().build();
        else
            return ResponseEntity.notFound().build();
    }
}
