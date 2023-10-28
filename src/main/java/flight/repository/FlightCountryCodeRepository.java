package flight.repository;


import flight.modal.FlightCountryCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightCountryCodeRepository extends JpaRepository<FlightCountryCode,Long> {
}
