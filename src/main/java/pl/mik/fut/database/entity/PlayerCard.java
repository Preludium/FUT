package pl.mik.fut.database.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "player_cards")
public class PlayerCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private Position position;

    @ManyToOne(fetch = FetchType.LAZY)
    private Club club;

    @Column(nullable = false)
    private int overall;

    @Column(nullable = false)
    private int quickSellPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventories_id", referencedColumnName = "id")
    private Inventory inventory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transfer_lists_id", referencedColumnName = "id")
    private TransferList transferList;

    public PlayerCard() {

    }

    public PlayerCard(String name, String surname, Position position, Club club, int overall,
                      TransferList transferList, Inventory inventory) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.club = club;
        this.overall = overall;
        this.inventory = inventory;
        this.transferList = transferList;
    }
}
