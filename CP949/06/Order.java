/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.time.LocalDateTime;

class Order {
    private static final int MAX_NVISIT = 10;
    private Customer customer;
    private LocalDateTime orderDateTime;
    private Coffee coffee;
    private int quantity;

    public void takeOrder(Customer customer, Coffee coffee) {
        this.customer = customer;
        this.coffee = coffee;
        quantity++;
        orderDateTime = LocalDateTime.now();       
        int v = customer.increaseVisit();
        if (v >= MAX_NVISIT) {            
            System.out.printf("%d ordered. So you get free coffee!\n", v);
            customer.resetVisit();
        }
    }
    public int charge() {
        int total = coffee.getPrice() * quantity;
        System.out.printf("You charge will be %d\n", total);
        return total;
    }
}