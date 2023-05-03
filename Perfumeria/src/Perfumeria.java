public class Perfumeria {
    int stock; 
    String prod, key; 
    double price;
    public Perfumeria(int stock, String prod, String key, double price) {
        this.stock = stock;
        this.prod = prod;
        this.key = key;
        this.price = price;
    } 
    public String getProd() {
        return prod;
    }
    public void setProd(String prod) {
        this.prod = prod;
    }
    
    
}
