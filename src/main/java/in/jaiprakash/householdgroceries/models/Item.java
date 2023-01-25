package in.jaiprakash.householdgroceries.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Data
@NoArgsConstructor
public class Item {

    private Long itemId;
    private String itemName;
    private Date dateOfPurchase;
    private Date dateOfExpiry;
    private Shop shop;
    private double gst;
    private double price;
    private Quantity quantity;
    private String locationInHouse;
    private Category category;
}
