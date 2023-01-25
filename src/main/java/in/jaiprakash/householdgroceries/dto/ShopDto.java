package in.jaiprakash.householdgroceries.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "shops")
public class ShopDto {

    private String shopName;
    private String shopAddress;
    private boolean isFavourite;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shopId")
    private Long shopId;

    @OneToMany(mappedBy = "itemId", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
    private List<ItemDto> items;

}
