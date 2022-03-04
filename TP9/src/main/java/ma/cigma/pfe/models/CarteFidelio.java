package ma.cigma.pfe.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "T_CARTE_FIDELIO")
@SequenceGenerator(name = "SEQ_CARTE_FIDELIO", allocationSize = 1)
@Setter
@Getter
@ToString
@NoArgsConstructor
public class CarteFidelio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CARTE_FIDELIO")
    private long id;

    private String code;

    @OneToOne
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    public CarteFidelio(String code) {
        this.code = code;
    }
}
