package br.mso.security.services;

import br.mso.security.models.User;
import br.mso.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
  
  @Autowired
  private UserRepository userRepository;
  
  @Override
  public UserDetails loadUserByUsername(String username)
      throws UsernameNotFoundException {
    User user = userRepository.getUserByUsername(username);
    
    if (user == null) {
      throw new UsernameNotFoundException("Could not find user");
    }
    
    return new MyUserDetails(user);
  }
  
}
