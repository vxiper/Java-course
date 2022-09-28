package src.classesWithAttributes;

public class ProductManager {
    public void Add(Product product) {
        //JDBS
        System.out.println("Ürün Eklendi: " + product.getName());
    }
}
