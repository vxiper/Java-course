package src.classesWithAttributes;

public class Product {

    // Attibute | field
    int id;
    String name ;
    String description;
    double price;
    int stockAmount ;
    private String renk;


	    public Product(){
	    }

	    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
	        System.out.println("Yapıcı blok çalıştı");
	        this.id = id;
	        this.name = name;
	        this.description = description;
	        this.price = price;
	        this.stockAmount = stockAmount;
	        this.renk = renk;
	    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return this.stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return this.renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}

