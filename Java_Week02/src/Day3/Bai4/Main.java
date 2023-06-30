package Day3.Bai4;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("John Smith");
        Order order = new Order(customer);

        Product product1 = new Product("Product 1", 10.99, 2);
        Product product2 = new Product("Product 2", 19.99, 1);

        OrderItem orderItem1 = new OrderItem(product1, 3);
        OrderItem orderItem2 = new OrderItem(product2, 2);

        order.addItem(orderItem1);
        order.addItem(orderItem2);

        order.printInvoice();
    }
}
