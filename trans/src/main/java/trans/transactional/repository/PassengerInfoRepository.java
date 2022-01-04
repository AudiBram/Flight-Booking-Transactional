package trans.transactional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trans.transactional.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
}
