package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Salle;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Long> {
    
    List<Salle> findByType(String type);

}
