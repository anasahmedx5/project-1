public class Customer {
    private int customerId;
    private String name;
    private String address;
    
    public Customer(int customerId, String name, String address) {
        if (customerId >= 0) {
            this.customerId = customerId;
            }
            else{
            this.customerId = Math.abs(customerId);
            }
        this.name = name;
        this.address = address;
    }
    public int getCustomerId() {
        return customerId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    
}
