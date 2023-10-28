package flight.modal;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;
    private String airline;
    private String origin;
    private String src;
    private String destination;
    private String des;
    private String aircraftType;
    private String departureTerminal;
    private String arrivalTerminal;
    private Date departureDate;
    private Date arrivalDate;
    private int availableSeats;
    private double ticketPrice;
    private Long flightDurationMinutes;
}
