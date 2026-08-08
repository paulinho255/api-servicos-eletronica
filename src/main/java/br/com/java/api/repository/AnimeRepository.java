package br.com.java.api.repository;

import br.com.java.api.domain.Anime;

import java.util.Arrays;
import java.util.List;

public interface AnimeRepository {
    public List<Anime> listAll();
}
