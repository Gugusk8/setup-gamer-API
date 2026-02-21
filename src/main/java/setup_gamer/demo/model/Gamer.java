package setup_gamer.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Entidade responsável por representar um Gamer no sistema.
// Mapeia a tabela "gamers" no banco de dados.

@Entity 
@Table(name = "gamers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Gamer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;

    private String nome;
    private String nick;
    private String email;
    private Integer ranking;
}   