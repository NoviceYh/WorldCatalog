package web.mundodanime.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "descripcion")
    private String description;

//    @Column(name = "generos")
//    private List<Genre> genre;

    @Column(name = "fecha")
    private LocalDate date;

    @Column(name = "estudio")
    private String studio;

    @Column(name = "imagen_url")
    private String imageUrl;

    @OneToMany(mappedBy = "anime", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Episode> episodios;

}
