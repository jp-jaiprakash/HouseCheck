package in.jaiprakash.householdgroceries.dto;

import in.jaiprakash.householdgroceries.models.Category;
import in.jaiprakash.householdgroceries.models.Quantity;
import in.jaiprakash.householdgroceries.models.Shop;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="items")
@Data
@NoArgsConstructor
public class ItemDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String itemName;
    private Date dateOfPurchase;
    private Date dateOfExpiry;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shop_id")
    private ShopDto shop;

    private double gst;
    private double price;


    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "quantity_id", referencedColumnName = "quantityId")
    private QuantityDto quantity;

    private String locationInHouse;
    private Category category;




    //Getters and setters omitted for brevity

//    public void setDetails(ShopDto details) {
//        if (details == null) {
//            if (this.details != null) {
//                this.details.setItemdto(null);
//            }
//        }
//        else {
//            details.setItemdto(this);
//        }
//        this.details = details;
//    }
}
