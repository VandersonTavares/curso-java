package entities;

import entities.enums.OrderStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    
    private Client client;
    
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    /* deixando esse getItems, tenho acesso aos métodos de orderitems
    public List<OrderItem> getItems() {
        return items;
    }
    */
    public void addOrderItems(OrderItem item){
        items.add(item);
    }
    
    public void removeOrderItems(OrderItem item){
        items.remove(item);
    }
    
    public double total(){
        double sum = 0;
            //para cada order item it, na minha lista items
        for(OrderItem it : items){
            sum += it.subTotal(); //delegação de responsabilidade
        }           //subtotal faz as sombas das compras 
        return sum;
    }
    
}
