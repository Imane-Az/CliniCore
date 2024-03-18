package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Infermiere;
import java.util.List;

public interface InfermiereRepository extends JpaRepository<Infermiere, Long> {
    List<Infermiere> findByNom(String nom);

}
