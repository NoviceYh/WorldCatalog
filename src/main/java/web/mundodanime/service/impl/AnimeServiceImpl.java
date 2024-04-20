package web.mundodanime.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.mundodanime.dto.AnimeDto;
import web.mundodanime.entity.Anime;
import web.mundodanime.mapper.AnimeMapper;
import web.mundodanime.repository.AnimeRepository;
import web.mundodanime.service.AnimeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeServiceImpl implements AnimeService {

    @Autowired
    private AnimeMapper animeMapper;

    @Autowired
    private AnimeRepository animeRepository;

    @Override
    public List<Anime> animeList() {
        return animeRepository.findAll();
    }

    @Override
    public Anime findAnime(String name) {
        return animeRepository.findByName(name);
    }

    @Override
    public AnimeDto saveAnime(AnimeDto animeDto) {

        Anime anime = animeMapper.dtoToEntity(animeDto);

        animeRepository.save(anime);

        return animeMapper.entityToDto(anime);

    }

    @Override
    public List<AnimeDto> getAll() {

        List<Anime> enitities = animeRepository.findAll();

        return animeMapper.entitiesToDtoList(enitities);

    }

    @Override
    public AnimeDto edit(AnimeDto animeDto, Long id) {

        Anime anime = animeRepository.findById(id).get();

        anime = animeMapper.dtoToEntity(animeDto);

        Anime response = animeRepository.save(anime);

        return animeMapper.entityToDto(response);
    }
}
