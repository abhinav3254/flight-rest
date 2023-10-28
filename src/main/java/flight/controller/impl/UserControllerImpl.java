package flight.controller.impl;

import flight.controller.UserController;
import flight.dto.LogInDTO;
import flight.modal.User;
import flight.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<String> registerUser(User user) {
        try {
            return userService.registerUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> logInUser(LogInDTO logInDTO) {
        try {
            return userService.logInUser(logInDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
