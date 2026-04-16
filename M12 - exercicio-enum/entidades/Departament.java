package entidades;

public class Departament {
    private String name_departament;

    public Departament() {
    }

    public Departament(String name) {
        this.name_departament = name;
    }

    public String getName() {
        return name_departament;
    }

    public void setName(String name) {
        this.name_departament = name;
    }

}
