package ie.atu.week2_refresher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
    public List<Product> productList = new ArrayList<Product>();
    @GetMapping
    public List<Product> getAllProducts()
    {
        return productList;
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product)
    {
        productList.add(product);
        return product;
    }

}
