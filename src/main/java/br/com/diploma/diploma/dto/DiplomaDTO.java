package br.com.diploma.diploma.dto;

import br.com.diploma.diploma.model.Aluno;

public class DiplomaDTO {
    private String mensagem;
    private Double media;
    private Aluno aluno;

    public DiplomaDTO(String mensagem, Double media, Aluno aluno) {
        this.mensagem = mensagem;
        this.media = media;
        this.aluno = aluno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Double getMedia() {
        return this.media;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
