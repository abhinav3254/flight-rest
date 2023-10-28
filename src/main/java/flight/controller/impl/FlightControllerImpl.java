package flight.controller.impl;

import flight.controller.FlightController;
import flight.modal.Flight;
import flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FlightControllerImpl implements FlightController {

    @Autowired
    private FlightService flightService;

    @Override
    public ResponseEntity<String> addFlight(Flight flight) {
        return flightService.addFlight(flight);
    }
}
