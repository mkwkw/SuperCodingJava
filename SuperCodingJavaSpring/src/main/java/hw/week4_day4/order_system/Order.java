package hw.week4_day4.order_system;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Order {
    private int id;
    private Optional<Customer> customer;
    private LocalDate orderDate;
    private Status status;
    private Optional<List<OrderItem>> orderItems;

    public Order(int id, Customer customer, String status, List<OrderItem> orderItems) {
        this.id = id;
        this.customer = Optional.ofNullable(customer);
        this.orderDate = LocalDate.now();
        this.status = Enum.valueOf(Status.class, status);
        this.orderItems = Optional.ofNullable(orderItems);
    }


    public String getOrderStatus() {
        return status.getStatus();
    }

    public Optional<List<OrderItem>> getOrderItems() {
        return orderItems;
    }

    public Optional<Customer> getCustomer() {return customer;}

}
