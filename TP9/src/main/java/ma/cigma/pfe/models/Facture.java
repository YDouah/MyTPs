package ma.cigma.pfe.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "T_FACTURE")
@SequenceGenerator(name = "SEQ_FACTURE", initialValue = 1, allocationSize = 1)
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Facture {

    public Facture(Date date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FACTURE")
    private long id;

    @Column(name = "at")
    private Date date;

    @Column
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "facture")
    private List<LigneFacture> ligneFactures;

}
