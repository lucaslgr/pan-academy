package br.mso.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
  
  public static void main(String[] args) {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String rawPassword = "javasecurity";
    String encodedPassword = encoder.encode(rawPassword);
    
    System.out.println(encodedPassword);
  }
  
}
