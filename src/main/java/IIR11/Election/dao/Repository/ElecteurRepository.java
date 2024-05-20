package IIR11.Election.dao.Repository;

import IIR11.Election.dao.Entities.Electeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElecteurRepository extends JpaRepository<Electeur, Long> {
    // Méthodes de requêtes personnalisées si nécessaire
}