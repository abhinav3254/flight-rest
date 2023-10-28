package flight.modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class FlightCountryCode {

    public FlightCountryCode(String countryCode,String nameOfCountryCode,String countryName) {
        this.countryCode = countryCode;
        this.nameOfCountryCode = nameOfCountryCode;
        this.countryName = countryName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String countryCode;

    private String nameOfCountryCode;

    private String countryName;


}
