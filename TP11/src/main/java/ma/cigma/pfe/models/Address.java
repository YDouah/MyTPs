package ma.cigma.pfe.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_ADDRESS")
@SequenceGenerator(name = "SEQ_ADDRESS", allocationSize = 1)
@Setter
@Getter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ADDRESS")
    private long id;

    @Column
    private String avenue;

    @Column
    private String ville;

    @Column
    private String pays;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    private List<Client> clients;

    public Address(String avenue, String ville, String pays) {
        this.avenue = avenue;
        this.ville = ville;
        this.pays = pays;
    }
}
