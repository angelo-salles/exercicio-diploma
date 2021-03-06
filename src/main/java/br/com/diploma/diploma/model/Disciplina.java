package br.com.diploma.diploma.model;

import java.util.Arrays;

public class Disciplina {
    private String nome;
    private double nota;

    public Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "nome: " + nome + " -  nota: " + nota;
    }
}
