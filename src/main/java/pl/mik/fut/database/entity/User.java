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

    @Size(min = 3, max = 25)
    @Column(nullable = false)
    private String clubName;

    private int coins;

    private int level;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transfer_lists_id")
    private TransferList transferList;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventories_id")
    private Inventory inventory;

    public User() {

    }

    public User(@NotNull String login, @NotNull String password, String clubName, TransferList transferList, Inventory inventory) {
        this.login = login;
        this.password = password;
        this.coins = 0;
        this.level = 0;
        this.clubName = clubName;
        this.transferList = transferList;
        this.inventory = inventory;
    }
}
