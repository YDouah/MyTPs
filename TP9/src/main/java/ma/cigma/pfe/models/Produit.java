package ma.cigma.pfe.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_PRODUIT")
@SequenceGenerator(name = "SEQ_PRODUIT", allocationSize = 1)
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUIT")
    private long id;

    @Column
    private String designation;

    @Column
    private Float prix;

    @Column
    private Integer stock;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "produit")
    private List<LigneFacture> ligneFactures;

    public Produit(String designation, Float prix, Integer stock) {
        this.designation = designation;
        this.prix = prix;
        this.stock = stock;
    }
}
