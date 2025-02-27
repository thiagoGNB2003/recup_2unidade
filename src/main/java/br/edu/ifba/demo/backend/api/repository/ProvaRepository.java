package br.edu.ifba.demo.backend.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifba.demo.backend.api.model.DisciplinaModel;
import br.edu.ifba.demo.backend.api.model.ProvaModel;

@Repository
public interface ProvaRepository extends JpaRepository<ProvaModel, Integer> {

    Iterable<? extends ProvaModel> findByDisciplina(DisciplinaModel disciplinaModel);
}
