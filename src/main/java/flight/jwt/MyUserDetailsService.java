package flight.jwt;

import java.util.ArrayList;

import flight.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userDao;

    flight.modal.User user;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user = userDao.findUserByEmail(username);
        if (user != null) {
            return new User(user.getEmail(),user.getPassword(),new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User Not Find By the email"+username);
        }
    }



    public flight.modal.User getUserDetails() {
        return user;
    }

}