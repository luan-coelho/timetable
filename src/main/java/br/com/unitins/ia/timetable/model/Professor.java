package br.com.unitins.ia.timetable.model;

import br.com.unitins.ia.timetable.model.enums.DiaSemana;
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
public class Teacher {

    private String name;
    private List<DiaSemana> daysAvailable = new ArrayList<>();
}
