package carProject.CCS.dao;

import carProject.CCS.models.ThirdParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThirdPartyDao extends JpaRepository<ThirdParty, Integer> {
    List<ThirdParty> findByName(String name);
}
