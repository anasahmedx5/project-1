public class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;
   
    public ElectronicProduct(int productId, String name, float price, String brand, int warrantyPeriod) {
        super(productId, name, price);
        this.brand = brand;
        if (warrantyPeriod <0){
        this.warrantyPeriod = Math.abs(warrantyPeriod);
        }
        else{
        this.warrantyPeriod = warrantyPeriod;
        }
    }
    public String getBrand() {
        return brand;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
    
}
