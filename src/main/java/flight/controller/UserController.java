package flight.controller;


import flight.dto.LogInDTO;
import flight.modal.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public interface UserController {

    @PutMapping("/signup")
    ResponseEntity<String> registerUser(@RequestBody(required = true)User user);

    @PostMapping("/login")
    ResponseEntity<String> logInUser(@RequestBody(required = true) LogInDTO logInDTO);

}
