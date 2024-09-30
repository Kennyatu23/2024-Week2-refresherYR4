package ie.atu.week2_refresher;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/products")

public class ProductController {
    private final ProductService productService;
    public List<Product> productList = new ArrayList<Product>();
    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProducts()
    {
        return productList;
    }
    @PostMapping
    public Product addProduct(@RequestBody @Valid Product product)
    {
        productList.add(product);
        return product;
    }
    /*
    @PutMapping("/{id}")
    public Product  updateProduct(@PathVariable Long id, @RequestBody Product product )
    {
         return productService()

    }*/

}
