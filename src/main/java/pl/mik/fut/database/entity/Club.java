package pl.mik.fut.database.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name =  "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 40)
    @NotBlank
    @NotNull
    private String name;

    @NotBlank
    @Size(max = 40)
    private String league;

    public Club() {

    }

    public Club(String name, String league) {
        this.name = name;
        this.league = league;
    }
}
