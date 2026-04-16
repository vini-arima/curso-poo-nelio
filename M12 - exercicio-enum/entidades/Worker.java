package entidades;

import java.util.List;
import java.util.ArrayList;

public class Worker {

    private String name; // variavel primitiva
    private WorkerLevel level; // enum
    private Double baseSalary; // variavel primitiva

    private Departament department; // variavel do tipo objeto

    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.contracts = contracts;
        this.department = department;
    }

    public Departament getDepartament() {
        return department;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public List<HourContract> geContracts() {
        return contracts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // FUNÇÕES PRINCIPAIS
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double incomeContract(Integer year, Integer mouth) {
        double sum = baseSalary;
        for (HourContract c : contracts) {
            if (c.getData().getYear() == year && c.getData().getMonthValue() == mouth) { // atraves do c -> getdata() ->
                sum += c.totalValue(); // c -> getYear
            }
        }
        return sum;
    }

}
