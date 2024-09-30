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
    @Autowired //Constructor injection
    public ProductController(ProductService productService){
        this.productService = productService;  // Loose coupling
    }
    @GetMapping
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }
    @PostMapping
    public Product addProduct(@RequestBody @Valid Product product)
    {
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product  updateProduct(@PathVariable Long id, @RequestBody Product product )
    {
         return productService.updateProduct(id, product);

    }

    @DeleteMapping("/{id}")
    public List<Product> deleteProduct(@PathVariable Long id) {

        return productService.deleteProduct(id);
    }
}
