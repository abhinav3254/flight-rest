package flight.service;


import flight.dto.LogInDTO;
import flight.jwt.JwtUtils;
import flight.modal.User;
import flight.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtils jwtUtils;

    public ResponseEntity<String> registerUser(User user) {
        try {

            user.setRole("user");
            user.setStatus(true);
            user.setCreateDate(new Date());

            userRepository.save(user);

            return new ResponseEntity<>("user added",HttpStatus.CREATED);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<String> logInUser(LogInDTO logInDTO) {
        try {

            User user = userRepository.findUserByEmail(logInDTO.getEmail());

            if (Objects.isNull(user)) {
                return new ResponseEntity<>("invalid account access",HttpStatus.NOT_FOUND);
            } else {
                if (user.getEmail().equals(logInDTO.getEmail()) && user.getPassword().equals(logInDTO.getPassword()) && user.isStatus()) {
                    String jwtToken = jwtUtils.generateToken(user.getEmail(),user.getRole());
                    return new ResponseEntity<>(jwtToken,HttpStatus.OK);
                }
                return new ResponseEntity<>("invalid username or password",HttpStatus.BAD_REQUEST);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("internal server error", HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
