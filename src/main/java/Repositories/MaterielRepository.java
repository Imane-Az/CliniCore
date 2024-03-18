package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Materiel;
import entities.MaterielStatus;

import java.util.List;

public interface MaterielRepository extends JpaRepository<Materiel, Long> {
    
    List<Materiel> findByStatus(MaterielStatus status);

}
