package web.mundodanime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.mundodanime.dto.AnimeDto;
import web.mundodanime.entity.Anime;
import web.mundodanime.service.AnimeService;

import java.util.List;

@RestController
@RequestMapping("/mundodanime")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @PostMapping
    public ResponseEntity<AnimeDto> save(@Validated AnimeDto animeDto, BindingResult bindingResult){

        AnimeDto response = animeService.saveAnime(animeDto);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AnimeDto> edit(@Validated AnimeDto animeDto, BindingResult bindingResult, Long id){

        AnimeDto response = animeService.edit(animeDto, id);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<AnimeDto>> getAll(){

        List<AnimeDto> animes = animeService.getAll();

        return new ResponseEntity<>(animes,HttpStatus.OK);
    }


}
