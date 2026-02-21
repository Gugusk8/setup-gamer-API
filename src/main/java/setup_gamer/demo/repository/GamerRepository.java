// Repository responsável por operações de persistência da entidade Gamer.

package setup_gamer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import setup_gamer.demo.model.Gamer;

public interface GamerRepository extends JpaRepository<Gamer, Long> {
    
}