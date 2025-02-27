package br.edu.ifba.demo.backend.api.controller;

import br.edu.ifba.demo.backend.api.model.DisciplinaModel;
import br.edu.ifba.demo.backend.api.repository.DisciplinaRepository;
import br.edu.ifba.demo.backend.api.repository.ProvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private ProvaRepository provaRepository;

    @GetMapping
    public List<DisciplinaModel> getAllDisciplinas() {
        return disciplinaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisciplinaModel> getDisciplinaById(@PathVariable Integer id) {
        Optional<DisciplinaModel> disciplina = disciplinaRepository.findById(id);
        if (disciplina.isPresent()) {
            return ResponseEntity.ok(disciplina.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public DisciplinaModel createDisciplina(@RequestBody DisciplinaModel disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisciplina(@PathVariable Integer id) {
        Optional<DisciplinaModel> disciplina = disciplinaRepository.findById(id);
        if (disciplina.isPresent()) {
            // Delete associated provas first
            provaRepository.deleteAll(provaRepository.findByDisciplina(disciplina.get()));
            disciplinaRepository.delete(disciplina.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
