package web.mundodanime.mapper;

import org.springframework.stereotype.Component;
import web.mundodanime.dto.AnimeDto;
import web.mundodanime.entity.Anime;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimeMapper {

    public AnimeDto entityToDto(Anime anime){

        AnimeDto dto = new AnimeDto();
        dto.setId(anime.getId());
        dto.setName(anime.getName());
        dto.setDate(anime.getDate());
        dto.setDescription(anime.getDescription());
        dto.setStudio(anime.getStudio());
        dto.setImageUrl(anime.getImageUrl());

        return dto;

    }

    public Anime dtoToEntity(AnimeDto dto){

        Anime anime = new Anime();
        anime.setName(dto.getName());
        anime.setDate(dto.getDate());
        anime.setDescription(dto.getDescription());
        anime.setStudio(dto.getStudio());
        anime.setImageUrl(dto.getImageUrl());

        return anime;
    }

    public List<AnimeDto> entitiesToDtoList(List<Anime> entities){

        List<AnimeDto> dtos = new ArrayList<>();
        for (Anime entitie: entities) {
            AnimeDto dto;
            dto = entityToDto(entitie);
            dtos.add(dto);
        }
        return dtos;
    }

}
