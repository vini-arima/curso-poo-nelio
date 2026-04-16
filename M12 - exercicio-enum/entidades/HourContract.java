package entidades;

import java.time.LocalDate;

public class HourContract {
    private LocalDate data;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(LocalDate data, Double valuePerHour, Integer hours) {
        this.data = data;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }

}
