package pl.mik.fut.database.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "transfer_lists")
public class TransferList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "transferList", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private User user;

    @OneToMany(mappedBy = "transferList", fetch = FetchType.LAZY)
    private Set<PlayerCard> cards;

    private int startPrice;

    private int buyNowPrice;

    public TransferList() {

    }

    public TransferList(Set<PlayerCard> cards, User user) {
        this.cards = cards;
        this.user = user;
    }
}
