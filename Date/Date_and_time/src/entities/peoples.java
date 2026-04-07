package entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class peoples {

    private String name;
    private LocalDate birthDate;
    private LocalDate today;
    Period days;

    public peoples() {
    }

    public peoples(String name, LocalDate birthDate, LocalDate today) {
        this.name = name;
        this.birthDate = birthDate;
        this.today = today;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public LocalDate getToday() {
        return today;
    }
    public void setToday(LocalDate today) {
        this.today = today;
    }

    public int period() {
        LocalDate nowe = birthDate.withYear(today.getYear());
        if (!nowe.isAfter(today)) {
            nowe = nowe.plusYears(1);
        }
        long days = (int) ChronoUnit.DAYS.between(today, nowe);
        return (int) days;
        }

    @Override
    public String toString() {
        return getName() + ", your next birthday will happaned in " + period() + " days";
    }
}

/*
        // Próximo aniversário = mesma data de nascimento, mas no ano atual
        LocalDate proximoAniversario = nascimento.withYear(hoje.getYear());

        // Se já passou neste ano, ajusta para o próximo
        if (!proximoAniversario.isAfter(hoje)) {
            proximoAniversario = proximoAniversario.plusYears(1);
        }
 */
