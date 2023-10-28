package flight.service;

import flight.modal.Flight;
import flight.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public ResponseEntity<String> addFlight(Flight flight) {
        try {
            flight.setFlightDurationMinutes(calculateFlightDurationInMinutes(flight.getDepartureDate(),flight.getArrivalDate()));
            flightRepository.save(flight);
            return new ResponseEntity<>("added flight",HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("internal", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private long calculateFlightDurationInMinutes(Date  departureDate,Date arrivalDate) {
        long departureTime = departureDate.getTime();
        long arrivalTime = arrivalDate.getTime();
        long durationInMillis = arrivalTime - departureTime;
        return durationInMillis / (60 * 1000); // Convert milliseconds to minutes
    }
}
