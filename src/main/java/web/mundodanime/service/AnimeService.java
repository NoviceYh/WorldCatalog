package web.mundodanime.service;

import web.mundodanime.dto.AnimeDto;
import web.mundodanime.entity.Anime;

import java.util.List;

public interface AnimeService {

    List<Anime> animeList();

    Anime findAnime(String name);

    AnimeDto saveAnime(AnimeDto animeDto);

    List<AnimeDto> getAll();

    AnimeDto edit(AnimeDto animeDto, Long id);
}
