package flight.health;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/test")
    public ResponseEntity<String> checkHealth() {
        return new ResponseEntity<>("server up and running", HttpStatus.OK);
    }

}
