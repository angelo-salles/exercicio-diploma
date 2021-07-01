package br.com.diploma.diploma.controller;

import br.com.diploma.diploma.dto.DiplomaDTO;
import br.com.diploma.diploma.model.Aluno;
import br.com.diploma.diploma.model.Disciplina;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {

    @PostMapping("/aluno")
    public ResponseEntity<DiplomaDTO> obterDiploma(@RequestBody Aluno aluno) {
        List<Disciplina> disciplinas = aluno.getDisciplinas();
        double media = disciplinas.stream().map(Disciplina::getNota).reduce(0.0, Double::sum);
        media = media / disciplinas.size();
        String mensagem;
        if (media >= 9)
            mensagem = "PARABENS!";
        else if (media >= 5)
            mensagem = "APROVADO!";
        else
            mensagem = "REPROVADO";

        DiplomaDTO diplomaDTO = new DiplomaDTO(mensagem, media, aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(diplomaDTO);
    }
}
