package ma.cigma.pfe.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "T_PROMOTION")
@SequenceGenerator(name = "SEQ_PROMOTION", allocationSize = 1)
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROMOTION")
    private long id;

    private String description;


    public Promotion(String description) {
        this.description = description;
    }
}

