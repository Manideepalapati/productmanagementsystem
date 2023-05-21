import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public List<Product> getProductWithText(String string) {
       return products.stream()
                       .filter(p-> p.getName().contains(string)||
                                   p.getType().contains(string)||
                                   p.getPlace().contains(string))
                       .toList();

    }

    public Product getProduct(String string) {
        return products.stream()
                       .filter(p->p.getName().equalsIgnoreCase(string))
                       .toList()
                       .get(0);

    }
    public List<Product> getProductWithPlace(String string) {
        return products.stream()
                        .filter(p-> p.getPlace().equalsIgnoreCase(string))
                        .toList();
 
     }
     public List<Product> OutOfWarranty(){
        return products.stream()
                       .filter(p->p.getWarranty()<2023)
                       .toList();
     }


}
