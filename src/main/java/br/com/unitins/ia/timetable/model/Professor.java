package br.com.unitins.ia.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    private String nome;
    private List<HorarioAula> horarioAulas;

    public List<Professor> criarCarga() {
        List<Professor> professores = new ArrayList<>();
        Professor p1 = new Professor();
        return null;
    }
}
