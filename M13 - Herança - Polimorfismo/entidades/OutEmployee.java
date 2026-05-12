package entidades;

public class OutEmployee extends Employee {

    private Double additionalCharge;

    public OutEmployee() {
        super();
    }

    public OutEmployee(String name, Integer hour, Double valueH, Double additionalCharge) {
        super(name, hour, valueH);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    // METODO PAGAMENTO + POLIMORFISMO
    @Override
    public Double payment() {
        return super.payment() + getAdditionalCharge() * 1.1;
    }

}