package carProject.CCS.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "third_party")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCredentials implements Serializable {

    @Getter @Setter @Id
    private int tpc_id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String api_url;
    @Getter @Setter
    private String api_key;
}
