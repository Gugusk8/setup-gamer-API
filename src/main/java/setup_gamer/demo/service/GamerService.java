package setup_gamer.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import setup_gamer.demo.model.Gamer;
import setup_gamer.demo.repository.GamerRepository;

@Service //Marca como camada de regra de negócio.
@RequiredArgsConstructor
public class GamerService {

    // Injeção de dependência do repository
    private final GamerRepository repository;

    // Método para salvar um gamer no banco
    public Gamer salvar(Gamer gamer) {
        return repository.save(gamer);
    }

    // Método para listar todos os gamers
    public List<Gamer> listar() {
        return repository.findAll();
    }
}