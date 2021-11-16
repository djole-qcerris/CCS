package carProject.CCS.dao;

import carProject.CCS.models.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCredentialsDao extends JpaRepository<UserCredentials, Integer> {
    List<UserCredentials> findByName(String name);
}
