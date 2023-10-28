package flight.intializer;

import java.util.List;

import flight.modal.User;
import flight.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private final UserRepository userRepository; // Replace with your repository

    public DataInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        User user = new User();
        user.setEmail("admin");
        user.setPassword("12");
        user.setRole("admin");
        user.setStatus(true);

        List<User> users = userRepository.findAll();

        if (users.isEmpty()) {
            userRepository.save(user);
        }

    }
}