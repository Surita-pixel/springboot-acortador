package com.acortador.acortador.Service;

import com.acortador.acortador.model.Enlace;    
import com.acortador.acortador.repository.EnlacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class EnlacesService {
    @Autowired
    private EnlacesRepository enlacesRepository;

    public Enlace shortenUrl(String originUrl){
        String shortenedUrl = generateShortUrl();
        Enlace enlace = new Enlace(originUrl, shortenedUrl);
        return enlacesRepository.save(enlace);


    }
    public String getOriginalUrl(String shortenedUrl){
        Enlace enlace = enlacesRepository.findByShortUrl(shortenedUrl);
        return enlace != null ? enlace.getOriginUrl() : null;

    }

    public String generateShortUrl(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder shortUrl = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 6; i++){
            shortUrl.append(characters.charAt(random.nextInt(characters.length())));
        }
        return shortUrl.toString();
    }
    public List<Enlace> getAllEnlaces(){
        return enlacesRepository.findAll();
    }
}