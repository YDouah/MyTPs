package ma.cigma.pfe.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "T-CLIENT-VIP")
@NoArgsConstructor
@Entity
public class ClientVip extends Client{
    private String preferences;

    public ClientVip(String name, String preferences){
        super(name);
        this.preferences = preferences;
    }
}
