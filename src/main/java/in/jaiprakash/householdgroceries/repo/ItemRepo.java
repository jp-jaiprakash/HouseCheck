package in.jaiprakash.householdgroceries.repo;

import in.jaiprakash.householdgroceries.dto.ItemDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<ItemDto, Long> {
}
