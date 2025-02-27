package br.edu.ifba.demo.backend.api.controller;

import br.edu.ifba.demo.backend.api.model.ProvaModel;
import br.edu.ifba.demo.backend.api.repository.DisciplinaRepository;
import br.edu.ifba.demo.backend.api.repository.ProvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/provas")
public class ProvaController {

    @Autowired
    private ProvaRepository provaRepository;

    @GetMapping
    public List<ProvaModel> getAllProvas() {
        return provaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProvaModel> getProvaById(@PathVariable Integer id) {
        Optional<ProvaModel> prova = provaRepository.findById(id);
        if (prova.isPresent()) {
            return ResponseEntity.ok(prova.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ProvaModel createProva(@RequestBody ProvaModel prova) {
        return provaRepository.save(prova);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProva(@PathVariable Integer id) {
        Optional<ProvaModel> prova = provaRepository.findById(id);
        if (prova.isPresent()) {
            provaRepository.delete(prova.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
