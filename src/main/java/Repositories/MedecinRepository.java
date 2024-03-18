package Repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

    List<Medecin> findBySpecialite(String specialite);

    List<Medecin> findByNom(String nom);
     
}
