package br.edu.ifba.demo.backend.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Prova")
@Data
public class ProvaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prova")
    private Integer idProva;

    @ManyToOne
    @JoinColumn(name = "id_disciplina", nullable = false)
    private DisciplinaModel disciplina;

    @Column(name = "data_prova", nullable = false)
    private LocalDateTime dataProva;

    @Column(name = "nota_prova", nullable = false)
    private Float notaProva;
}