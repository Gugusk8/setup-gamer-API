package setup_gamer.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import setup_gamer.demo.model.Gamer;
import setup_gamer.demo.service.GamerService;

@RestController //Diz que essa classe responde requisições HTTP.
@RequestMapping("/gamers") //Define a URL base.
@RequiredArgsConstructor
public class GamerController {

    // Injeção do Service
    private final GamerService service;

    // Endpoint para salvar gamer
    @PostMapping 
    public Gamer salvar(@RequestBody Gamer gamer) {
        return service.salvar(gamer);
    }

    // Endpoint para listar gamers
    @GetMapping 
    public List<Gamer> listar() {
        return service.listar();
    }
}