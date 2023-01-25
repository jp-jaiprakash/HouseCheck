package in.jaiprakash.householdgroceries.models;

import in.jaiprakash.householdgroceries.utils.QuantityUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Quantity {

    private Long quantityId;
    private int quantityPurchased;
    private QuantityUnit quantityUnit;
    private int remainingQuantity;
}
