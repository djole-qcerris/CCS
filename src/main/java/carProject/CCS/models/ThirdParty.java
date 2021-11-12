package carProject.CCS.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "third_party")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThirdParty {

    @Getter @Setter @Id
    private int tpc_id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String api_url;
    @Getter @Setter
    private String api_key;
}
