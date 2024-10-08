package ie.atu.week2_refresher;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts(){

        return productList;
    }

    public Product addProduct(Product product){
        productList.add(product);
        return product;
    }
   public Product  updateProduct(@PathVariable Long id, @RequestBody Product product )
    {
        // loop for running through a product list
        for(Product previousProduct : productList) {
        //Search for product with a matching id
            if (previousProduct.getId().equals(id)) {
                //Update name and price field
                previousProduct.setName(product.getName());
                previousProduct.setPrice(product.getPrice());

                return previousProduct;

            }

        }
        return product;
    }
    public List<Product> deleteProduct(@PathVariable Long id) {
        productList.removeIf(product ->product.getId().equals(id));
        return productList;


    }
}
