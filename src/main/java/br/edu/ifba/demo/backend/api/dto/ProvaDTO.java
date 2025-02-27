package br.edu.ifba.demo.backend.api.dto;

import java.time.LocalDateTime;

public class ProvaDTO {
    private Integer id_prova;
    private Integer id_disciplina;
    private LocalDateTime data_prova;
    private Float nota_prova;

    public ProvaDTO() {
    }

    public ProvaDTO(Integer id_prova, Integer id_disciplina, LocalDateTime data_prova, Float nota_prova) {
        this.id_prova = id_prova;
        this.id_disciplina = id_disciplina;
        this.data_prova = data_prova;
        this.nota_prova = nota_prova;
    }

    public Integer getId_prova() {
        return id_prova;
    }

    public void setId_prova(Integer id_prova) {
        this.id_prova = id_prova;
    }

    public Integer getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(Integer id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public LocalDateTime getData_prova() {
        return data_prova;
    }

    public void setData_prova(LocalDateTime data_prova) {
        this.data_prova = data_prova;
    }

    public Float getNota_prova() {
        return nota_prova;
    }

    public void setNota_prova(Float nota_prova) {
        this.nota_prova = nota_prova;
    }
}
