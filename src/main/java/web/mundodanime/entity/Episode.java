package web.mundodanime.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Episodio")
@Getter
@Setter
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private Integer number;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;
}
