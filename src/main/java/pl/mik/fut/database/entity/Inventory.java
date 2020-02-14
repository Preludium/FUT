package pl.mik.fut.database.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "inventories")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "inventory", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private User user;

    @OneToMany(mappedBy = "inventory", fetch = FetchType.LAZY)
    private Set<PlayerCard> cards;

    public Inventory() {

    }

    public Inventory(Set<PlayerCard> cards, User user) {
        this.cards = cards;
        this.user = user;
    }
}
