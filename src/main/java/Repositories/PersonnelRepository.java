package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Personnel;

import java.util.List;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
    List<Personnel> findByRole(String role);

    // Add other custom methods as needed
    List<Personnel> findByNomAndPrenom(String nom, String prenom);
}
