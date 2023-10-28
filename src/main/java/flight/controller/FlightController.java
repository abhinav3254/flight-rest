package flight.controller;

import flight.modal.Flight;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/flight")
public interface FlightController {

    @PostMapping("api/v1/admin/add")
    ResponseEntity<String> addFlight(@RequestBody(required = true)Flight flight);

}
