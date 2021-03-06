package ma.cigma.pfe.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLIENT_VIP")
@Data
@NoArgsConstructor
public class ClientVip extends Client {
    private String preferences;

    public ClientVip(String name, String preferences) {
        super(name);
        this.preferences = preferences;
    }
}
