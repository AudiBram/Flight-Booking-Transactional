package trans.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import trans.transactional.dto.FlightBookingAcknowledgement;
import trans.transactional.dto.FlightBookingRequest;
import trans.transactional.service.FlightBookingService;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class TransactionalApplication {

    @Autowired
    private FlightBookingService service;


    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return service.bookFlightTicket(request);
    }



    public static void main(String[] args) {
        SpringApplication.run(TransactionalApplication.class, args);
    }

}
