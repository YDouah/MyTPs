package ma.cigma.pfe.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_LIGNE_FACTURE")
@Getter
@Setter
@NoArgsConstructor
public class LigneFacture {

    @EmbeddedId
    private FactureProduitId id;

    @ManyToOne
    @MapsId("produitId")
    private Produit produit;

    @ManyToOne
    @MapsId("factureId")
    private Facture facture;

    @Column
    private Integer qte;

    public LigneFacture(Facture facture, Produit produit, Integer qte) {
        this.id = new FactureProduitId(facture.getId(), produit.getId());
        this.produit = produit;
        this.facture = facture;
        this.qte = qte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LigneFacture that = (LigneFacture) o;
        return produit.equals(that.produit) && facture.equals(that.facture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produit, facture);
    }
}
