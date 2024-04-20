public class Cart {
    private int customerId;
    private int nProducts;
    private Product [] products;
    public Cart(int customerId, int nProducts){
        if (customerId>=0){
            this.customerId = customerId;
            }
            else {
            this.customerId = Math.abs(customerId);
            }
        if (nProducts>0){
            this.nProducts = nProducts;
            this.products = new Product[nProducts];
            }
            else if (nProducts==0) {
                this.products = new Product[nProducts];
            }
            else {
            this.nProducts = Math.abs(nProducts);
            this.products = new Product[nProducts];
            }
    }
    public int getCustomerId() {
        return customerId;
    }
    public int getnProducts() {
        return nProducts;
    }
    public void addProduct(Product product,int index){
        // for (int i=0;i<=index;i++){
        //     products[i]=product;
        // }
        products[index]=product;
    }
    public void removeProduct(int index){
        if (index>=0) {
        for (int i=0;i<index;i++){
            products[i] = null;
        }
        }
        else{
            System.out.println("Invalid index");
        }
    }
    public float calculatePrice(){
        float total = 0;
        for (int i=0; i<nProducts; i++) {
            total = total + products[i].getPrice();
        }
        return total;
    }
    public void placeOrder(){
        
    }
    public Product[] getProducts() {
        return products;
    }
    

}
