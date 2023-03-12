public class Product {
    String nama,deskripsi;
    int harga,stock;
    public void setName(String nama) {
        this.nama = nama;
    }
    public String getName() {
        return this.nama;
    }
    public void setDescription(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public String getDescription() {
        return this.deskripsi;
    }
    public void setPrice(int harga) {
        this.harga = harga;
    }
    public double getPrice() {
        return this.harga;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return this.stock;
    }
    public void getInfo() {
        System.out.println("Nama : " + this.getName());
        System.out.println("Deskripsi : " + this.getDescription());
        System.out.println("Harga : " + this.getPrice());
        System.out.println("Stock: " + this.getStock());
    }
    {
        System.out.println("================================");
    }
    public static void main(String[] args) {
        Product Product1 = new Product();
        Product1.setName("Coffee");
        Product1.setDescription("This is coffee");
        Product1.setPrice(15000);
        Product1.setStock(10);
        Product1.getInfo();

        Product Product2 = new Product();
        Product2.setName("Milk");
        Product2.setDescription("This is fresh milk");
        Product2.setPrice(25000);
        Product2.setStock(10);
        Product2.getInfo();

        Product Product3 = new Product();
        Product3.setName("Apple Juice");
        Product3.setDescription("This is juice");
        Product3.setPrice(18000);
        Product3.setStock(20);
    }
}
