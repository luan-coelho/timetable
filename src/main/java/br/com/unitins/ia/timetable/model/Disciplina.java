package br.com.unitins.ia.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {

    private String nome;

    public List<Disciplina> criarCarga() {
        Disciplina d1 = new Disciplina("ENGENHARIA DE QUALIDADE");
        Disciplina d2 = new Disciplina("ESTÁGIO SUPERVISIONADO");
        Disciplina d3 = new Disciplina("ESTATÍSTICA COMPUTACIONAL");
        Disciplina d4 = new Disciplina("GOVERNANÇA DE TI");
        Disciplina d5 = new Disciplina("INTELIGÊNCIA ARTIFICIAL");
        Disciplina d6 = new Disciplina("INTERFACE HUMANO- COMPUTADOR");
        Disciplina d7 = new Disciplina("PROGRAMAÇÃO PARA DISPOSITIVOS MÓVEIS I");
        Disciplina d8 = new Disciplina("REDES DE COMPUTADORES II");

        return new ArrayList<>(Arrays.asList(d1, d2, d3, d4, d5, d6, d7, d8));
    }
}
