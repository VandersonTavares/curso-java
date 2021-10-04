package course;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class Course {
    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENTS);
        
        System.out.println(order);
        
        
        //conversão de String para Enum
        OrderStatus os1 = OrderStatus.PENDING_PAYMENTS;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        System.out.println(os1);
        System.out.println(os2);
        
        
        
    }
    
}
