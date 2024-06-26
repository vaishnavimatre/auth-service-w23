package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class User extends UserData {

  private String status;
  private String message;
  private Long userId;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Long getUserId() {
    return userId;
  }

  @Override
  public String toString() {
    return " status:" + status + ", message:" + message + ", userId:" + userId + "";
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }
}
