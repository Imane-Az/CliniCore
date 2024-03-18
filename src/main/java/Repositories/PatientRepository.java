package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import entities.Patient;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByNomAndPrenom(String nom, String prenom);

    List<Patient> findByMaladie(String maladie);
}
