package com.acortador.acortador.Controller;

import com.acortador.acortador.Service.EnlacesService;
import com.acortador.acortador.model.Enlace;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shorten")
public class EnlacesController {
    @Autowired
    private EnlacesService enlacesService;

    @PostMapping
    public String shortenUrl(@RequestBody String originUrl) {
        return enlacesService.shortenUrl(originUrl).getShortUrl();

    }

    @GetMapping("/{shortUrl}")
    public String redirectToOriginal(@PathVariable String shortUrl) {
        String originalUrl = enlacesService.getOriginalUrl(shortUrl);
        if (originalUrl != null) {
            return "redirect:" + originalUrl;
        } else {
            return "Shortened URL not found";
        }
    }

    @GetMapping("/all")
    public List<Enlace> getAllEnlaces() {
        return enlacesService.getAllEnlaces();
    }
}
