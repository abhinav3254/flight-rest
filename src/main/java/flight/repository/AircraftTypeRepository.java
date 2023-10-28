package flight.repository;

import flight.modal.AircraftType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AircraftTypeRepository extends JpaRepository<AircraftType,Long> {
}
