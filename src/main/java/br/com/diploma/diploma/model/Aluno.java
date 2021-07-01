package br.com.diploma.diploma.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    List<Disciplina> disciplinas;

    public Aluno(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>(disciplinas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

}
