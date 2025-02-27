package br.edu.ifba.demo.backend.api.model;
import lombok.Data;
import jakarta.persistence.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Disciplina")
@Data
public class DisciplinaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_disciplina")
    private Integer idDisciplina;
    
    @Column(name = "nm_disciplina", length = 45, nullable = false)
    private String nmDisciplina;

    @Column(name = "curso", nullable = false)
    private Integer curso;

    @Column(name = "turno", nullable = false)
    private Integer turno;

    
    @OneToMany(mappedBy = "disciplina", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProvaModel> provas;
}
