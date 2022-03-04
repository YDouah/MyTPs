package ma.cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "table_facture")
@SequenceGenerator(name = "SEQ_FACTURE", initialValue = 1, allocationSize = 1)
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

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
