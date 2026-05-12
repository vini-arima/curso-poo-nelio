package entidades;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    protected Integer hour; // POLIMORFISMO - PROTECTED
    protected Double valueH;

    public Employee() {

    }

    public Employee(String name, Integer hour, Double valueH) {
        this.name = name;
        this.hour = hour;
        this.valueH = valueH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValueH() {
        return valueH;
    }

    public void setValueH(Double valueH) {
        this.valueH = valueH;
    }

    // METODO PAGAMENTO
    public Double payment() {
        return hour * valueH;
    }

}