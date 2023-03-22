package br.com.unitins.ia.timetable.model;

import br.com.unitins.ia.timetable.model.enums.DiaSemana;
import br.com.unitins.ia.timetable.model.enums.Turno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HorarioAula {

    private Disciplina disciplina;
    private DiaSemana diaSemana;
    private Turno turno;
}
