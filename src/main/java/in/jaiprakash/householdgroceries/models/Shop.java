package in.jaiprakash.householdgroceries.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Shop {

    private String shopName;
    private String shopAddress;
    private boolean isFavourite;
    private Long shopId;
}
