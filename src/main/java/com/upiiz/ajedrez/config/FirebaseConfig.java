package com.upiiz.ajedrez.config;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;


@Configuration
public class FirebaseConfig {

    @Bean
    public GoogleCredentials googleCredentials() throws IOException {
        // Suponiendo que tu JSON de credenciales está en resources
        InputStream serviceAccount = new ClassPathResource("gameupiiz-firebase-adminsdk-fbsvc-858ba58cf0.json").getInputStream();
        return GoogleCredentials.fromStream(serviceAccount);
    }

    @Bean
    public FirebaseApp firebaseApp(GoogleCredentials credentials) {
        FirebaseOptions options = FirebaseOptions.builder()
            .setCredentials(credentials)
            .build();
        return FirebaseApp.initializeApp(options);
    }

    @Bean
    public FirebaseMessaging firebaseMessaging(FirebaseApp firebaseApp) {
        return FirebaseMessaging.getInstance(firebaseApp);
    }
}
