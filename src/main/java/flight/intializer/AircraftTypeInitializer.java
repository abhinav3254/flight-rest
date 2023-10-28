package flight.intializer;

import flight.modal.AircraftType;
import flight.repository.AircraftTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AircraftTypeInitializer  implements CommandLineRunner {

    @Autowired
    private AircraftTypeRepository aircraftTypeRepository;

    @Override
    public void run(String... args) throws Exception {

        List<AircraftType> list = aircraftTypeRepository.findAll();

        if (list.isEmpty()) {
            AircraftType[] aircraftTypes = new AircraftType[] {
                    new AircraftType("Airbus A320"),
                    new AircraftType("Airbus A380"),
                    new AircraftType("Airbus A340"),
                    new AircraftType("Airbus A330"),
                    new AircraftType("Airbus A320neo"),
                    new AircraftType("Airbus A319"),
                    new AircraftType("Airbus A321"),
                    new AircraftType("Airbus A318"),
                    new AircraftType("Boeing 747"),
                    new AircraftType("Boeing 787"),
                    new AircraftType("Boeing 777"),
                    new AircraftType("Boeing 767"),
                    new AircraftType("Boeing 757"),
                    new AircraftType("Boeing 737"),
                    new AircraftType("Boeing 727"),
                    new AircraftType("Boeing 717"),
                    new AircraftType("Airbus A300"),
                    new AircraftType("Airbus A310"),
                    new AircraftType("Airbus A350"),
                    new AircraftType("Boeing 737 MAX"),
                    new AircraftType("Boeing 737 NG"),
                    new AircraftType("Boeing 737 Classic"),
                    new AircraftType("Boeing 737 Next Generation"),
                    new AircraftType("Boeing 747-8"),
                    new AircraftType("Boeing 757-300"),
                    new AircraftType("Boeing 767-400"),
                    new AircraftType("Boeing 777-300"),
                    new AircraftType("Boeing 787-9"),
                    new AircraftType("Airbus A220"),
                    new AircraftType("Airbus A330neo"),
                    new AircraftType("Airbus A380plus"),
                    new AircraftType("Airbus A321neo"),
                    new AircraftType("Boeing 747-400"),
                    new AircraftType("Boeing 737-800"),
                    new AircraftType("Boeing 737-900"),
                    new AircraftType("Boeing 737-700"),
                    new AircraftType("Boeing 777-200"),
                    new AircraftType("Boeing 777-200LR"),
                    new AircraftType("Boeing 777-200ER"),
                    new AircraftType("Boeing 777-200F"),
                    new AircraftType("Boeing 777-200LRF"),
                    new AircraftType("Boeing 767-300"),
                    new AircraftType("Boeing 767-300ER"),
                    new AircraftType("Boeing 767-300F"),
                    new AircraftType("Boeing 767-400ER"),
                    new AircraftType("Boeing 767-200"),
                    new AircraftType("Boeing 767-200ER"),
                    new AircraftType("Boeing 757-200"),
                    new AircraftType("Boeing 757-200M"),
                    new AircraftType("Boeing 757-300"),
                    new AircraftType("Boeing 757-300M"),
                    new AircraftType("Boeing 757-300ER"),
                    new AircraftType("Boeing 757-200ER"),
                    new AircraftType("Boeing 757-200PF"),
                    new AircraftType("Boeing 757-200M"),
                    new AircraftType("Boeing 757-200LR"),
                    new AircraftType("Boeing 757-200W"),
                    new AircraftType("Boeing 757-200ERW"),
                    new AircraftType("Boeing 757-200F"),
                    new AircraftType("Boeing 717-200"),
                    new AircraftType("Boeing 717-200ER"),
                    new AircraftType("Boeing 717-200LR"),
                    new AircraftType("Boeing 717-200ADV"),
                    new AircraftType("Airbus A300-600"),
                    new AircraftType("Airbus A300-600R"),
                    new AircraftType("Airbus A300-600RF"),
                    new AircraftType("Airbus A310-200"),
                    new AircraftType("Airbus A310-300"),
                    new AircraftType("Airbus A310-200F"),
                    new AircraftType("Airbus A310-300F"),
                    new AircraftType("Airbus A310-300MRTT"),
                    new AircraftType("Airbus A350-900"),
                    new AircraftType("Airbus A350-1000"),
                    new AircraftType("Airbus A350-900ULR"),
                    new AircraftType("Airbus A350-1000F"),
                    new AircraftType("Airbus A350-900F"),
                    new AircraftType("Airbus A380-800"),
                    new AircraftType("Airbus A380-800F"),
                    new AircraftType("Airbus A380-900"),
                    new AircraftType("Airbus A380-900F"),
                    new AircraftType("Airbus A321-200"),
                    new AircraftType("Airbus A321-200LR"),
                    new AircraftType("Airbus A321-200ER"),
                    new AircraftType("Airbus A321-200neo"),
                    new AircraftType("Airbus A319-100"),
                    new AircraftType("Airbus A319-100LR"),
                    new AircraftType("Airbus A319-100ER"),
                    new AircraftType("Airbus A319-100neo"),
                    new AircraftType("Boeing 787-8"),
                    new AircraftType("Boeing 787-8F"),
                    new AircraftType("Boeing 787-9"),
                    new AircraftType("Boeing 787-9F"),
                    new AircraftType("Boeing 787-10"),
                    new AircraftType("Boeing 787-10F"),
                    new AircraftType("Boeing 787-3"),
                    new AircraftType("Boeing 787-3F"),
                    new AircraftType("Boeing 787-4"),
                    new AircraftType("Boeing 787-4F")
            };

            for (int i = 0; i < aircraftTypes.length; i++) {
                aircraftTypeRepository.save(aircraftTypes[i]);
            }

        }

    }
}
