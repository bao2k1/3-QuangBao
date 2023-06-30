package Day3.Bai4;

import java.util.ArrayList;
import java.util.List;

// Lớp Order đại diện cho đơn hàng
class Order {
    private Customer customer;
    private List<OrderItem> orderItems;

    public Order(Customer customer) {
        this.customer = customer;
        orderItems = new ArrayList<>();
    }

    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
    }

    public double getTotal() {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            Product product = orderItem.getProduct();
            total += (product.getPrice() * orderItem.getQuantity());
        }
        return total;
    }
    public void printInvoice() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Order Items:");
        for (OrderItem orderItem : orderItems) {
            Product product = orderItem.getProduct();
            System.out.println(product.getName() + " - $" + product.getPrice() + " x " + orderItem.getQuantity());
        }
        System.out.println("Total: $" + getTotal());
    }
}