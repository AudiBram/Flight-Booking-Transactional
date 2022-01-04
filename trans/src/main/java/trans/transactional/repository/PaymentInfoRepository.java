package trans.transactional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trans.transactional.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {
}
