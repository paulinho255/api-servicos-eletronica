package br.com.java.api.service;

import br.com.java.api.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

@Service
public class AnimeService {
    List<Anime> animes = Arrays.asList(new Anime(1L,"Cavaleiros"), new Anime(2L,"Fatal Fury"));

    public List<Anime> listAll(){
        return animes;
    }

    public Anime getById(Long id) {
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Anime not found"));
    }
}
