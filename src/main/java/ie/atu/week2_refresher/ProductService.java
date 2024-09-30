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
        for(Product previousProduct : productList);
            if (previousProduct.getID().equals(id){
                previousProduct setName(productList.getName());
                previousProduct setPrice(productList.getPrice());

                return previousProduct;

    }

    }

}
