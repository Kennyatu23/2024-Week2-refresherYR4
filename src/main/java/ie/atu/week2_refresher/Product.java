package ie.atu.week2_refresher;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Min(value = 1, message = " Id must be greater than 0")
    private Long id;
    @NotBlank(message = " Product cannot be blank")
    private String name;
    @Positive(message =" Price must be greater then 0" )
    private double price;



}
