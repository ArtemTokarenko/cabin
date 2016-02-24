package email.sender.auth;

import email.sender.entity.User;
import email.sender.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class AuthUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findUserForAuth(username);
        if (user == null) {
            throw new BadCredentialsException("User not found. Invalid username or password");
        }
        return new AuthUserDetails(user.getUsername(), user.getPassword(), getUserAuthorities(user));
    }

    public Collection<? extends GrantedAuthority> getUserAuthorities(User user){
        List<SimpleGrantedAuthority> auths = new java.util.ArrayList<>();
        auths.add(new SimpleGrantedAuthority(user.getRole().toString()));
        return auths;
    }
}
