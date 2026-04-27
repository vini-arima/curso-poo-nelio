package entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    // LISTA DE ITEMS
    private List<OrderItem> items = new ArrayList<>();

    // LISTA DE CLIENTES
    private List<Client> clients = new ArrayList<>();

    private Client client;

    public Order() {

    }

    public Order(LocalDateTime moment, OrderStatus status, List<OrderItem> items, List<Client> clients, Client client) {
        this.moment = moment;
        this.status = status;
        this.items = items;
        this.clients = clients;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    // FUNÇAO TOTAL
    public Double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order items:\n");

        for (OrderItem item : items) {
            sb.append(item.toString());
            sb.append("\n");
        }

        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }

}
