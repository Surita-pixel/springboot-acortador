package com.acortador.acortador.repository;

import com.acortador.acortador.model.Enlace;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;   

@Repository
public interface EnlacesRepository extends MongoRepository<Enlace, String> {
    Enlace findByShortUrl(String shortUrl);
    Enlace findByOriginUrl(String originUrl);
}