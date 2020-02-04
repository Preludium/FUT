package pl.mik.fut.database.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "users")
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 30, min = 5)
    @Column(unique = true, nullable = false)
    private String login;

    @NotBlank
    @Size(max = 30, min = 5)
    @Column(nullable = false)
    private String password;

    @Column
    private int coins;

    @Column
    private int level;

    public User() {

    }

    public User(@NotNull String login, @NotNull String password) {
        this.login = login;
        this.password = password;
        this.coins = 0;
        this.level = 0;
    }
}
