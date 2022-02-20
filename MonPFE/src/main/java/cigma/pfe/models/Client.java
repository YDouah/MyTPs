package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Getter
@Setter
@Entity(name="TClients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public long id;
	public String name;

	public Client(long id, String name) {

		this.id = id;
		this.name = name;
	}

	public Client() {

	}

}
