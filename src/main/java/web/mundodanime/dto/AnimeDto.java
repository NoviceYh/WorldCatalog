package web.mundodanime.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AnimeDto {

    private Long id;

    private String name;

    private String description;

    private LocalDate date;

    private String studio;

    private String imageUrl;
    

}
