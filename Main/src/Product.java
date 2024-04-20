public class Product {
    private int productId;
    private String productName;
    private float price;
    public Product(int productId, String productName, float price) {
        if (productId < 0) {
            this.productId = Math.abs(productId);
        }
        else{
            this.productId = productId;
        }
        if (price<0) {
            this.price = Math.abs(price);
        }
        else{
            this.price = price;
        }
        this.productName = productName;
    }
    public int getProductId() {
        return productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public float getPrice() {
        return price;
    }
   
    
}
