package br.com.unitins.ia.timetable.model;

import br.com.unitins.ia.timetable.model.enums.DayOfWeek;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Discipline {

    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private DayOfWeek dayOfWeek;
}
