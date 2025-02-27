package br.edu.ifba.demo.backend.api.dto;

public class DisciplinaDTO {
    private Integer id_disciplina;
    private String nm_disciplina;
    private Integer curso;
    private Integer turno;

    public DisciplinaDTO() {
    }

    public DisciplinaDTO(Integer id_disciplina, String nm_disciplina, Integer curso, Integer turno) {
        this.id_disciplina = id_disciplina;
        this.nm_disciplina = nm_disciplina;
        this.curso = curso;
        this.turno = turno;
    }

    public Integer getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(Integer id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public String getNm_disciplina() {
        return nm_disciplina;
    }

    public void setNm_disciplina(String nm_disciplina) {
        this.nm_disciplina = nm_disciplina;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }
}
