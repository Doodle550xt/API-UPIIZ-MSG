package com.upiiz.ajedrez.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upiiz.ajedrez.entities.Token;

@Repository
public interface TokenRepository extends CrudRepository<Token, String> {
    // Aquí puedes agregar métodos personalizados si los necesitas
    Optional<Token> findByToken(String token);

}
