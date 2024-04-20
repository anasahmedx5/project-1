public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;

    public Order(int customerId, int orderId, Product[] products,float totalPrice) {
        if (customerId<0){
        this.customerId = Math.abs(customerId);
        }
        else{
        this.customerId = customerId;
        }
        if (orderId<0){
        this.orderId = Math.abs(orderId);
        }
        else{
        this.orderId = orderId;
        }
        this.products = products; 
        this.totalPrice = totalPrice;
    }
    public void printOrderInfo() {
        System.out.println("Order id: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (Product product : products) {
            if (product != null) {
                System.out.println("- " + product.getProductName() + " - $" + product.getPrice());
            }
        }
        // for (int i = 0 ; i < products.length ; i++) {
        //     if (product != null) {
        //         System.out.println("- " + product.getProductName() + " - $" + product.getPrice());
        //     }
        // }
        System.out.println("Total Price: $" + totalPrice);
    }
}
