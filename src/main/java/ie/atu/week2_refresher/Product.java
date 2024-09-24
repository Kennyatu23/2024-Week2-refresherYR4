package ie.atu.week2_refresher;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value = 1, message = "ID must be greater then 0")
    private Long id;
    @NotBlank(message = "Name must not be blank")
    private String name;
    @Min(value = 0, message = "Price must be greater then 0, nothing for free")
    private double price;

}
