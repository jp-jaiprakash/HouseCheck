package in.jaiprakash.householdgroceries.dto;

import in.jaiprakash.householdgroceries.utils.QuantityUnit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "quantities")
@NoArgsConstructor
public class QuantityDto {

    private int quantityPurchased;
    private QuantityUnit quantityUnit;
    private int remainingQuantity;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quantityId;

}
