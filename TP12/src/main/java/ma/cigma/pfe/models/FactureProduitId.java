package ma.cigma.pfe.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class FactureProduitId implements Serializable {

    @Column(name = "facture_id")
    private long factureId;

    @Column(name = "produit_id")
    private long produitId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactureProduitId that = (FactureProduitId) o;
        return factureId == that.factureId && produitId == that.produitId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factureId, produitId);
    }

    public FactureProduitId(long factureId, long produitId) {
        this.factureId = factureId;
        this.produitId = produitId;
    }
}

