package ma.cigma.pfe.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(name = "SEQ_CLIENT", initialValue = 1,allocationSize = 1)
@Table(name = "T_CLIENT")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NoArgsConstructor
@Getter
@Setter
public class Client {

    public Client(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENT")
    private long id;

    @Column
    private String name;

    @OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "client")
    private List<Facture> factures;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "T_CLIENT_PROMOTION",
            joinColumns = @JoinColumn(name = "CLIENT_FK", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "PROMOTION_FK", referencedColumnName = "ID"))
    private List<Promotion> promotions;

    @OneToOne(cascade = { CascadeType.PERSIST }, mappedBy = "client")
    private CarteFidelio carteFidelio;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    private Address address;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
