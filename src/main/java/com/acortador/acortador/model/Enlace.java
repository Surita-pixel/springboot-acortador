package com.acortador.acortador.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;


@Document(collection = "Enlace")
public class Enlace{
    @Id
    private String id;
    private String originUrl;
    private String shortUrl;
    private LocalDateTime creationDate;

    public Enlace(){};
    public Enlace(String originUrl, String shortUrl){
        this.originUrl = originUrl;
        this.shortUrl = shortUrl;
        this.creationDate = LocalDateTime.now();

    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getOriginUrl(){
        return originUrl;
    }
    public void setOriginUrl(String originUrl){
        this.originUrl = originUrl;
    }
    public String getShortUrl(){
        return shortUrl;
    }
    public void setShortUrl(String shortUrl){
        this.shortUrl = shortUrl;
    }   
    public LocalDateTime getCreationDate(){
        return creationDate;
    }
    public void setCreationDate(LocalDateTime creationDate){
        this.creationDate = creationDate;
    }
}