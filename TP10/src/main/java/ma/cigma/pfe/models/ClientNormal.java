package ma.cigma.pfe.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T-CLIENT-NORMAL")
@Data
@NoArgsConstructor
public class ClientNormal extends Client {

    private int importance;

    public ClientNormal(String name, int importance) {
        super(name);
        this.importance = importance;
    }
}
