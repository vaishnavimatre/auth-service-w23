package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginRequest {

  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUser_name(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
