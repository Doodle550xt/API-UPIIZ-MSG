package com.upiiz.ajedrez.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.upiiz.ajedrez.entities.Notification;
import com.upiiz.ajedrez.entities.Token;
import com.upiiz.ajedrez.repositories.TokenRepository;

@Service
public class TokenService {

    private final TokenRepository tokenRepository;
    private final FirebaseMessaging firebaseMessaging;

    public TokenService(TokenRepository tokenRepository, FirebaseMessaging firebaseMessaging) {
        this.tokenRepository = tokenRepository;
        this.firebaseMessaging = firebaseMessaging;
    }

    public List<Token> getAllTokens() {
        return (List<Token>) tokenRepository.findAll();
    }

    public Token addToken(Token token) {
        return tokenRepository.save(token);
    }

    public Token updateToken(Token token) {
        return tokenRepository.save(token);
    }

    public void deleteToken(String token) {
        tokenRepository.deleteById(token);
    }

    public Token getTokenByValue(String tokenValue) {
        return tokenRepository.findByToken(tokenValue).orElse(null);
    }

    public boolean sendNotification(String token, Notification notification) {
        try {

            Message message = Message.builder()
                    .setToken(token)
                    .putData("title", notification.getTitle())
                    .putData("body", notification.getBody())
                    .build();

            String response = firebaseMessaging.send(message);
            System.out.println("Sent message: " + response);

            return true;

        } catch (Exception e) {
            System.err.println("Error enviando notificación: " + e.getMessage());
            return false;
        }
    }
}
